/************************************************************************************
 *
 *  Copyright (C) 2009-2010 Broadcom Corporation
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License, version 2, as published by
 *  the Free Software Foundation (the "GPL").
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  A copy of the GPL is available at http://www.broadcom.com/licenses/GPLv2.php,
 *  or by writing to the Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 *  Boston, MA  02111-1307, USA.
 *
 ************************************************************************************/

#include <gdbus.h>
#include <dbus/dbus.h>
#include <bluetooth/bluetooth.h>

#include "dtun_clnt.h"

#include "dtun_sdp.h"

#include "bluetooth/sdp.h"
#include "bluetooth/sdp_lib.h"
#include "sdp-xml.h"
#include "error.h"

/* some local debug macros */
#ifdef DTUN_STANDALONE
#define info(format, ...)  fprintf (stdout, format, ## __VA_ARGS__)
#define debug(format, ...) fprintf (stdout, format, ## __VA_ARGS__)
#define error(format, ...) fprintf (stderr, format, ## __VA_ARGS__)
#else
#define LOG_TAG "dtun_sdp"
#include "utils/Log.h"
#define info(format, ...)  LOGI (format, ## __VA_ARGS__)
#define debug(format, ...) LOGD (format, ## __VA_ARGS__)
#define error(format, ...) LOGE (format, ## __VA_ARGS__)
#endif

static DBusConnection *conn = NULL;
struct record_data {
    uint32_t handle;
    char *sender;
    guint listener_id;
    //struct service_adapter *serv_adapter;
};

struct context_data {
    sdp_record_t *          record;
    sdp_data_t              attr_data;
    struct sdp_xml_data *   stack_head;
    uint16_t                attr_id;    
};

DBusConnection * g_conn = NULL;
DBusMessage * g_msg = NULL;


int sdp_gen_buffer(sdp_buf_t *buf, sdp_data_t *d);

void sdp_hex_dump(char *msg, void *data, int size, int trunc)
{
    unsigned char *p = data;
    unsigned char c;
    int n;
    char bytestr[4] = {0};
    char addrstr[10] = {0};
    char hexstr[ 16*3 + 5] = {0};
    char charstr[16*1 + 5] = {0};

    debug("%s", msg);

    /* truncate */
    if(trunc && (size>16))
        size = 16;
    
    for(n=1;n<=size;n++) {
        if (n%16 == 1) {
            /* store address for this line */
            snprintf(addrstr, sizeof(addrstr), "%.4x",
               ((unsigned int)p-(unsigned int)data) );
        }
            
        c = *p;
        if (isalnum(c) == 0) {
            c = '.';
        }

        /* store hex str (for left side) */
        snprintf(bytestr, sizeof(bytestr), "%02X ", *p);
        strncat(hexstr, bytestr, sizeof(hexstr)-strlen(hexstr)-1);

        /* store char str (for right side) */
        snprintf(bytestr, sizeof(bytestr), "%c", c);
        strncat(charstr, bytestr, sizeof(charstr)-strlen(charstr)-1);

        if(n%16 == 0) { 
            /* line completed */
            debug("[%4.4s]   %-50.50s  %s", addrstr, hexstr, charstr);
            hexstr[0] = 0;
            charstr[0] = 0;
        } else if(n%8 == 0) {
            /* half line: add whitespaces */
            strncat(hexstr, "  ", sizeof(hexstr)-strlen(hexstr)-1);
            strncat(charstr, " ", sizeof(charstr)-strlen(charstr)-1);
        }
        p++; /* next byte */
    }

    if (strlen(hexstr) > 0) {
        /* print rest of buffer if not empty */
        debug("[%4.4s]   %-50.50s  %s", addrstr, hexstr, charstr);

    }
}

static int compute_seq_size(sdp_data_t *data)
{
    int unit_size = data->unitSize;
    sdp_data_t *seq = data->val.dataseq;

    for (; seq; seq = seq->next)
        unit_size += seq->unitSize;

    return unit_size;
}

static void element_log(sdp_data_t * d ) {

    switch (d->dtd) {
    case SDP_DATA_NIL:
        break;
    case SDP_UINT8:
        debug("Type = SDP_UINT8 len = %d value = 0x%x", sizeof(uint8_t),d->val.uint8);
        break;
    case SDP_UINT16:
        debug("Type = SDP_UINT16 len = %d value = 0x%x", sizeof(uint16_t),d->val.uint16);        
        break;
    case SDP_UINT32:
        debug("Type = SDP_UINT32 len = %d value = 0x%x", sizeof(uint32_t),d->val.uint32);
        break;
    case SDP_UINT64:
        debug("Type = SDP_UINT64 len = %d value = 0x%x", sizeof(uint64_t),d->val.uint64);        
        break;
    case SDP_UINT128:                    
        debug("Type = SDP_UINT128 len = %d value = 0x%x", sizeof(uint128_t),d->val.uint128);                
        break;
    case SDP_INT8:
    case SDP_BOOL:
        debug("Type = SDP_INT8 len = %d value = 0x%x", sizeof(int8_t),d->val.int8);                        
        break;
    case SDP_INT16:
        debug("Type = SDP_INT16 len = %d value = 0x%x", sizeof(int16_t),d->val.int16);
        break;
    case SDP_INT32:
        debug("Type = SDP_INT32 len = %d value = 0x%x", sizeof(int32_t),d->val.int32);        
        break;
    case SDP_INT64:
        debug("Type = SDP_INT64 len = %d value = 0x%x", sizeof(int64_t),d->val.int64);
        break;
    case SDP_INT128:
        debug("Type = SDP_INT128 len = %d value = 0x%x", sizeof(uint128_t),d->val.int128);
        break;
    case SDP_TEXT_STR8:
    case SDP_TEXT_STR16:
    case SDP_TEXT_STR32:
    case SDP_URL_STR8:
    case SDP_URL_STR16:
    case SDP_URL_STR32:
        debug("Type = SDP_TEXT_STR8 len = %d value = %s", d->unitSize - sizeof(uint8_t),d->val.str);
        break;
    case SDP_SEQ8:
    case SDP_SEQ16:
    case SDP_SEQ32:
        debug("Type = SDP_SEQ8 len = %d ", compute_seq_size(d));
        break;
    case SDP_ALT8:
    case SDP_ALT16:
    case SDP_ALT32:
        debug("Type = SDP_ALT8 len = %d ", compute_seq_size(d));
        break;
    case SDP_UUID16:
        debug("Type = SDP_UUID16 len = %d 0x%x", sizeof(uint16_t),d->val.uuid.value.uuid16 );
        break;
    case SDP_UUID32:
        debug("Type = SDP_UUID32 len = %d 0x%x", sizeof(uint32_t),d->val.uuid.value.uuid32 );
        break;
    case SDP_UUID128:
        debug("Type = SDP_UUID128 len = %d 0x%x", sizeof(uint128_t),d->val.uuid.value.uuid128 );
        break;
    default:
        break;
    }
    
}

static void element_start(GMarkupParseContext *context,
        const gchar *element_name, const gchar **attribute_names,
        const gchar **attribute_values, gpointer user_data, GError **err)
{
    struct context_data *ctx_data = user_data;

    if (!strcmp(element_name, "record"))
        return;

    if (!strcmp(element_name, "attribute")) {
        int i;
        for (i = 0; attribute_names[i]; i++) {
            if (!strcmp(attribute_names[i], "id")) {
                ctx_data->attr_id = strtol(attribute_values[i], 0, 0);
                break;
            }
        }
        debug("New attribute 0x%04x", ctx_data->attr_id);
        return;
    }

    if (ctx_data->stack_head) {
        struct sdp_xml_data *newelem = sdp_xml_data_alloc();
        newelem->next = ctx_data->stack_head;
        ctx_data->stack_head = newelem;
    } else {
        ctx_data->stack_head = sdp_xml_data_alloc();
        ctx_data->stack_head->next = NULL;
    }

    if (!strcmp(element_name, "sequence")) {
        debug("New seequence ");
        ctx_data->stack_head->data = sdp_data_alloc(SDP_SEQ8, NULL);
    }
    else if (!strcmp(element_name, "alternate")) {
        debug("New alternate");        
        ctx_data->stack_head->data = sdp_data_alloc(SDP_ALT8, NULL);
    }
    else {
        int i;
        /* Parse value, name, encoding */
        for (i = 0; attribute_names[i]; i++) {
            
            if (!strcmp(attribute_names[i], "value")) {
                int curlen = strlen(ctx_data->stack_head->text);
                int attrlen = strlen(attribute_values[i]);

                /* Ensure we're big enough */
                while ((curlen + 1 + attrlen) > ctx_data->stack_head->size) {
                    sdp_xml_data_expand(ctx_data->stack_head);
                }

                memcpy(ctx_data->stack_head->text + curlen,
                        attribute_values[i], attrlen);
                ctx_data->stack_head->text[curlen + attrlen] = '\0';
            }

            if (!strcmp(attribute_names[i], "encoding")) {
                if (!strcmp(attribute_values[i], "hex"))
                    ctx_data->stack_head->type = 1;
            }

            if (!strcmp(attribute_names[i], "name")) {
                ctx_data->stack_head->name = strdup(attribute_values[i]);
            }
    }

        ctx_data->stack_head->data = sdp_xml_parse_datatype(element_name,
                ctx_data->stack_head, ctx_data->record);
        
        if (ctx_data->stack_head->data == NULL)
            error("Can't parse element %s", element_name);
    }
}

static void element_end(GMarkupParseContext *context,
        const gchar *element_name, gpointer user_data, GError **err)
{
    struct context_data *ctx_data = user_data;
    struct sdp_xml_data *elem;

    if (!strcmp(element_name, "record"))
        return;

    if (!strcmp(element_name, "attribute")) {
        if (ctx_data->stack_head && ctx_data->stack_head->data) {
            debug("End New attribute 0x%04x Attribute data = ", ctx_data->attr_id); 

            
            element_log(ctx_data->stack_head->data );
            int ret = sdp_attr_add(ctx_data->record, ctx_data->attr_id,
                            ctx_data->stack_head->data);
            if (ret == -1)
                debug("Trouble adding attribute\n");


            ctx_data->stack_head->data = NULL;
            sdp_xml_data_free(ctx_data->stack_head);
            ctx_data->stack_head = NULL;

        } else {
            debug("No data for attribute 0x%04x\n", ctx_data->attr_id);
        }
        return;
    }

    if (!strcmp(element_name, "sequence")) {
        debug("End New sequence"); 
        ctx_data->stack_head->data->unitSize = compute_seq_size(ctx_data->stack_head->data);

        if (ctx_data->stack_head->data->unitSize > USHRT_MAX) {
            ctx_data->stack_head->data->unitSize += sizeof(uint32_t);
            ctx_data->stack_head->data->dtd = SDP_SEQ32;
        } else if (ctx_data->stack_head->data->unitSize > UCHAR_MAX) {
            ctx_data->stack_head->data->unitSize += sizeof(uint16_t);
            ctx_data->stack_head->data->dtd = SDP_SEQ16;
        } else {
            ctx_data->stack_head->data->unitSize += sizeof(uint8_t);
        }
    } else if (!strcmp(element_name, "alternate")) {
        debug("End New alternate");     
        ctx_data->stack_head->data->unitSize = compute_seq_size(ctx_data->stack_head->data);

        if (ctx_data->stack_head->data->unitSize > USHRT_MAX) {
            ctx_data->stack_head->data->unitSize += sizeof(uint32_t);
            ctx_data->stack_head->data->dtd = SDP_ALT32;
        } else if (ctx_data->stack_head->data->unitSize > UCHAR_MAX) {
            ctx_data->stack_head->data->unitSize += sizeof(uint16_t);
            ctx_data->stack_head->data->dtd = SDP_ALT16;
        } else {
            ctx_data->stack_head->data->unitSize += sizeof(uint8_t);
        }
    }

    if (ctx_data->stack_head->next && ctx_data->stack_head->data &&
                    ctx_data->stack_head->next->data) {
        switch (ctx_data->stack_head->next->data->dtd) {
        case SDP_SEQ8:
        case SDP_SEQ16:
        case SDP_SEQ32:
        case SDP_ALT8:
        case SDP_ALT16:
        case SDP_ALT32:
            debug("Appending sequence data"); 
            element_log(ctx_data->stack_head->data );
            ctx_data->stack_head->next->data->val.dataseq =
                sdp_seq_append(ctx_data->stack_head->next->data->val.dataseq,
                                ctx_data->stack_head->data);
            ctx_data->stack_head->data = NULL;
            break;
        }

        elem = ctx_data->stack_head;
        ctx_data->stack_head = ctx_data->stack_head->next;

        sdp_xml_data_free(elem);
    }
}

static GMarkupParser parser = {
    element_start, element_end, NULL, NULL, NULL
};


static sdp_record_t *sdp_xml_parse_record(const char *data, int size)
{
    GMarkupParseContext *ctx;
    struct context_data *ctx_data;
    sdp_record_t *record;

    ctx_data = malloc(sizeof(*ctx_data));
    if (!ctx_data)
        return NULL;


    record = sdp_record_alloc();
    if (!record) {
        free(ctx_data);
        return NULL;
    }

    memset(ctx_data, 0, sizeof(*ctx_data));
    ctx_data->record = record;

    ctx = g_markup_parse_context_new(&parser, 0, ctx_data, NULL);

    if (g_markup_parse_context_parse(ctx, data, size, NULL) == FALSE) {
        error("XML parsing error");
        g_markup_parse_context_free(ctx);
        sdp_record_free(record);
        free(ctx_data);
        return NULL;
    }

    //free the method buf
    g_markup_parse_context_free(ctx);
    free(ctx_data);

    return record;
}

sdp_record_t *sdp_record_alloc()
{
    sdp_record_t *rec = malloc(sizeof(sdp_record_t));
    memset((void *)rec, 0, sizeof(sdp_record_t));
    rec->handle = 0xffffffff;
    return rec;
}

/*
 * Free the contents of a service record
 */
void sdp_record_free(sdp_record_t *rec)
{
    sdp_list_free(rec->attrlist, (sdp_free_func_t)sdp_data_free);
    sdp_list_free(rec->pattern, free);
    free(rec);
}

#if __BYTE_ORDER == __BIG_ENDIAN
#define ntoh64(x) (x)
static inline void ntoh128(uint128_t *src, uint128_t *dst)
{
    int i;
    for (i = 0; i < 16; i++)
        dst->data[i] = src->data[i];
}
#else
static inline uint64_t ntoh64(uint64_t n)
{
    uint64_t h;
    uint64_t tmp = ntohl(n & 0x00000000ffffffff);
    h = ntohl(n >> 32);
    h |= tmp << 32;
    return h;
}
static inline void ntoh128(uint128_t *src, uint128_t *dst)
{
    int i;
    for (i = 0; i < 16; i++)
        dst->data[15 - i] = src->data[i];
}
#endif

#define hton64(x)     ntoh64(x)
#define hton128(x, y) ntoh128(x, y)

void sdp_set_seq_len(uint8_t *ptr, uint32_t length)
{
    uint8_t dtd = *(uint8_t *) ptr++;

    switch (dtd) {
    case SDP_SEQ8:
    case SDP_ALT8:
    case SDP_TEXT_STR8:
    case SDP_URL_STR8:
        *(uint8_t *)ptr = (uint8_t) length;
        break;
    case SDP_SEQ16:
    case SDP_ALT16:
    case SDP_TEXT_STR16:
    case SDP_URL_STR16:
        bt_put_unaligned(htons(length), (uint16_t *) ptr);
        break;
    case SDP_SEQ32:
    case SDP_ALT32:
    case SDP_TEXT_STR32:
    case SDP_URL_STR32:
        bt_put_unaligned(htonl(length), (uint32_t *) ptr);
        break;
    }
}

static char * create_sdp_method_buf(sdp_record_t * sdp_record, uint16_t * total_size)
{
    sdp_list_t *            attrlist = NULL;
    sdp_buf_t               buf;
    sdp_data_t *            d = NULL;  
    uint8_t     *           method_buf = NULL;
    uint8_t     *           buf_ptr = NULL;
    uint16_t                cur_size = 0;

    attrlist = sdp_record->attrlist;
    for (; attrlist; attrlist = attrlist->next) {
        
        d = (sdp_data_t * )attrlist->data;
        
        memset(&buf, 0, sizeof(sdp_buf_t));
        
        sdp_gen_buffer(&buf, d);
        
        buf.data = malloc(buf.buf_size);
        if (!buf.data)
            return NULL;
        
        sdp_set_attrid(&buf, d->attrId);
        sdp_gen_pdu(&buf, d);
        //
        //hex dump the buffer
        //pdu has following format - 
        // uint8 = attrid data type
        // uint16 - attrid
        // uint8 - type
        // based on the type - length
        // then the value itself
        // - for all practical purposes length will be 1 byte
        //
        sdp_hex_dump("***SDP PDU***",buf.data,buf.data_size,0);
        
        //now put it in our method buf - uint16_t = length and then the pdu
        
        cur_size = sizeof(uint16_t) + buf.data_size;

        
        method_buf = realloc(method_buf, *total_size + cur_size);   
        buf_ptr = method_buf + *total_size;
        *((uint16_t *)(buf_ptr)) = buf.data_size;
        memcpy(buf_ptr + sizeof(uint16_t), buf.data, buf.data_size);

        *total_size += cur_size;
        
        free(buf.data);
        
    }
    return method_buf;
}

static int add_xml_record(DBusConnection *conn, const char *sender,
            /*struct service_adapter *serv_adapter,*/
            const char *record)
{
    sdp_record_t *          sdp_record;
    uint16_t                total_size = sizeof(tDTUN_HDR);    
    uint8_t     *           method_buf = NULL;
    uint8_t     *           buf_ptr = NULL;
    tDTUN_METHOD_DM_ADD_SDP_REC_EX  * pmethod = NULL;    
    
    debug("%s", __FUNCTION__);    
    sdp_record = sdp_xml_parse_record(record, strlen(record));
    if (!sdp_record) {
        error("Parsing of XML service record failed");
        return -EIO;
    }

    method_buf = create_sdp_method_buf(sdp_record, &total_size);
    
    pmethod = (tDTUN_METHOD_DM_ADD_SDP_REC_EX *) method_buf;
    pmethod->hdr.id = DTUN_METHOD_SDP_ADD_RECORD;
    pmethod->hdr.len = total_size - sizeof(tDTUN_HDR);
    sdp_hex_dump("***FINAL PACKET***", method_buf + sizeof(tDTUN_HDR),total_size - sizeof(tDTUN_HDR), 0 );
    dtun_client_call_method((tDTUN_DEVICE_METHOD *)method_buf);   //wait for the signal now.
    //free method buf
    free(method_buf);
    
    return 0;
}



static DBusMessage *add_sdp_record(DBusConnection *conn,
                        DBusMessage *msg, void *data)
{
    const char *sender, *record;

    int err;
    debug("%s", __FUNCTION__);
    debug( "SDP: add_sdp_record  conn=%p ", conn );

    if (dbus_message_get_args(msg, NULL,
            DBUS_TYPE_STRING, &record, DBUS_TYPE_INVALID) == FALSE) {
        error("SDP: error getting args");        
        return NULL;
    }
    debug( "SDP: add_sdp_record  record=%s ", record );

    sender = dbus_message_get_sender(msg);
    
    err = add_xml_record(conn, sender, record);
    if (err < 0)
        return g_dbus_create_error(msg, ERROR_INTERFACE ".Failed",strerror(err));

    g_conn = dbus_connection_ref(conn);
    g_msg = dbus_message_ref(msg);

    return NULL;
}


static DBusMessage *remove_sdp_record(DBusConnection *conn,
                        DBusMessage *msg, void *data)
{
    struct service_adapter *serv_adapter = data;   
    tDTUN_METHOD_DM_REMOVE_SDP_REC_EX       method;
    dbus_uint32_t handle;
    const char *sender;
    
    debug( "SDP: remove_sdp_record  conn=%p", conn );

    if (dbus_message_get_args(msg, NULL, DBUS_TYPE_UINT32, &handle,
                            DBUS_TYPE_INVALID) == FALSE)
        return NULL;

    sender = dbus_message_get_sender(msg);
    
    g_conn = dbus_connection_ref(conn);
    g_msg = dbus_message_ref(msg);
    
    memset(&method,0, sizeof(method));
    method.handle = handle;
    method.hdr.len= sizeof(handle);
    method.hdr.id = DTUN_METHOD_SDP_REMOVE_RECORD;
    dtun_client_call_method((tDTUN_DEVICE_METHOD *)&method);
    return NULL;

}

//Signals from btld
void dtun_sig_sdp_add_record(tDTUN_DEVICE_SIGNAL *p_data)
{
    DBusMessage *reply;

    debug(__FUNCTION__);
    if ( g_conn != NULL && g_msg != NULL) {
        reply = dbus_message_new_method_return(g_msg);
        if (!reply) {
            error("Could not get return message");
            return ;
        }
        dbus_message_append_args(reply, DBUS_TYPE_UINT32, &(p_data->sdp_add_rec.handle),
                                DBUS_TYPE_INVALID);
        
        g_dbus_send_message(g_conn, reply);
        dbus_connection_unref(g_conn);
        dbus_message_unref(g_msg);
        g_conn = NULL;
        g_msg = NULL;
    }
    return;
    
}

void dtun_sig_sdp_remove_record(tDTUN_DEVICE_SIGNAL *p_data)
{
    DBusMessage *reply;

    debug(__FUNCTION__);
    if ( g_conn != NULL && g_msg != NULL) {
        reply = dbus_message_new_method_return(g_msg);
        if (!reply) {
            error("Could not get return message");
            return ;
        }
        dbus_message_append_args(reply, DBUS_TYPE_UINT32, &(p_data->sdp_remove_rec.retCode),
                                DBUS_TYPE_INVALID);
        
        g_dbus_send_message(g_conn, reply);
        dbus_connection_unref(g_conn);
        dbus_message_unref(g_msg);
        g_conn = NULL;
        g_msg = NULL;
    }
    return;

}



/*******************************************************************************
**
** Function         sdp_dbus_init
**
** Description     Init function of obexd module
**
*******************************************************************************/

static void dtun_sdp_process_started (void) 
{
    debug("SDP interface Initialized");
}
static GDBusMethodTable dtun_sdp_methods[] = {
    { "AddRecord",      "s",    "u",add_sdp_record,    G_DBUS_METHOD_FLAG_ASYNC  },
    { "RemoveRecord",   "u",    "", remove_sdp_record, G_DBUS_METHOD_FLAG_ASYNC   },
    { }
};

int sdp_dbus_init (DBusConnection *in_conn)
{

    conn = dbus_connection_ref( in_conn );
    debug( "SDP: g_dbus_register_interface  in_conn = %p conn=%p", in_conn, conn );
    if (!g_dbus_register_interface(in_conn, BTLA_SDP_PATH, BTLA_SDP_INTERFACE,
        dtun_sdp_methods, NULL, NULL, NULL, NULL)) {
        return -1;
    }
    //dtun_start_interface(DTUN_INTERFACE_OBEX, obex_signal_tbl, dtun_obex_process_started);

    return 0;
}

/*******************************************************************************
**
** Function         sdp_dbus_exit
**
** Description     Exit function of sdp module
**
*******************************************************************************/
void sdp_dbus_exit (void)
{
    debug("Exit Obex interface");

   // dtun_client_stop(DTUN_INTERFACE_OBEX);

    if (!conn || !dbus_connection_get_is_connected(conn)) {
        return;
    }

    g_dbus_unregister_interface(conn, BTLA_SDP_PATH, BTLA_SDP_INTERFACE);
    conn = NULL;

}

