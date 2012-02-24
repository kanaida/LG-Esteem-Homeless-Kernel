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
#ifndef SDP_H
#define SDP_H

#define BTLA_BASE_INTERFACE "org.bluez"
#define BTLA_SDP_INTERFACE BTLA_BASE_INTERFACE ".Btla"

#define BTLA_BASE_PATH      "/org/bluez"
#define BTLA_SDP_PATH      BTLA_BASE_PATH "/btlasdp0"

int sdp_dbus_init (DBusConnection *conn);
void sdp_dbus_exit (void);
void dtun_sig_sdp_add_record(tDTUN_DEVICE_SIGNAL *p_data);
void dtun_sig_sdp_remove_record(tDTUN_DEVICE_SIGNAL *p_data);
void dtun_sig_sdp_update_record(tDTUN_DEVICE_SIGNAL *p_data);

#endif // end SDP_H