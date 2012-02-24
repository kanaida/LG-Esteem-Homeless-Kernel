/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/net/IConnectivityManager.aidl
 */
package android.net;
/**
 * Interface that answers queries about, and allows changing, the
 * state of network connectivity.
 *//** {@hide} */
public interface IConnectivityManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.IConnectivityManager
{
private static final java.lang.String DESCRIPTOR = "android.net.IConnectivityManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.IConnectivityManager interface,
 * generating a proxy if needed.
 */
public static android.net.IConnectivityManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.IConnectivityManager))) {
return ((android.net.IConnectivityManager)iin);
}
return new android.net.IConnectivityManager.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_setNetworkPreference:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setNetworkPreference(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getNetworkPreference:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getNetworkPreference();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getActiveNetworkInfo:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkInfo _result = this.getActiveNetworkInfo();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getNetworkInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.NetworkInfo _result = this.getNetworkInfo(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getAllNetworkInfo:
{
data.enforceInterface(DESCRIPTOR);
android.net.NetworkInfo[] _result = this.getAllNetworkInfo();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_setRadios:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setRadios(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setRadio:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.setRadio(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startUsingNetworkFeature:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
android.os.IBinder _arg2;
_arg2 = data.readStrongBinder();
int _result = this.startUsingNetworkFeature(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_stopUsingNetworkFeature:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.stopUsingNetworkFeature(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_requestRouteToHost:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.requestRouteToHost(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getBackgroundDataSetting:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getBackgroundDataSetting();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setBackgroundDataSetting:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setBackgroundDataSetting(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getMobileDataEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getMobileDataEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setMobileDataEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setMobileDataEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_tether:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.tether(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_untether:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.untether(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getLastTetherError:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getLastTetherError(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isTetheringSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isTetheringSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getTetherableIfaces:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTetherableIfaces();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getTetheredIfaces:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTetheredIfaces();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getTetheringErroredIfaces:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTetheringErroredIfaces();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getTetherableUsbRegexs:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTetherableUsbRegexs();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getTetherableWifiRegexs:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTetherableWifiRegexs();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_reportInetCondition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.reportInetCondition(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.IConnectivityManager
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public void setNetworkPreference(int pref) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(pref);
mRemote.transact(Stub.TRANSACTION_setNetworkPreference, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getNetworkPreference() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNetworkPreference, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.net.NetworkInfo getActiveNetworkInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveNetworkInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.net.NetworkInfo getNetworkInfo(int networkType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
mRemote.transact(Stub.TRANSACTION_getNetworkInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.NetworkInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.net.NetworkInfo[] getAllNetworkInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.NetworkInfo[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllNetworkInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.net.NetworkInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean setRadios(boolean onOff) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((onOff)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setRadios, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean setRadio(int networkType, boolean turnOn) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeInt(((turnOn)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setRadio, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int startUsingNetworkFeature(int networkType, java.lang.String feature, android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeString(feature);
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_startUsingNetworkFeature, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int stopUsingNetworkFeature(int networkType, java.lang.String feature) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeString(feature);
mRemote.transact(Stub.TRANSACTION_stopUsingNetworkFeature, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean requestRouteToHost(int networkType, int hostAddress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeInt(hostAddress);
mRemote.transact(Stub.TRANSACTION_requestRouteToHost, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean getBackgroundDataSetting() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBackgroundDataSetting, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setBackgroundDataSetting(boolean allowBackgroundData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((allowBackgroundData)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setBackgroundDataSetting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean getMobileDataEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMobileDataEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setMobileDataEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setMobileDataEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int tether(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_tether, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int untether(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_untether, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getLastTetherError(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_getLastTetherError, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean isTetheringSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isTetheringSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String[] getTetherableIfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetherableIfaces, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String[] getTetheredIfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetheredIfaces, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String[] getTetheringErroredIfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetheringErroredIfaces, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String[] getTetherableUsbRegexs() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetherableUsbRegexs, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String[] getTetherableWifiRegexs() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetherableWifiRegexs, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void reportInetCondition(int networkType, int percentage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(networkType);
_data.writeInt(percentage);
mRemote.transact(Stub.TRANSACTION_reportInetCondition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setNetworkPreference = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getNetworkPreference = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getActiveNetworkInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getNetworkInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getAllNetworkInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setRadios = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setRadio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_startUsingNetworkFeature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_stopUsingNetworkFeature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_requestRouteToHost = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getBackgroundDataSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setBackgroundDataSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getMobileDataEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setMobileDataEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_tether = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_untether = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getLastTetherError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_isTetheringSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getTetherableIfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getTetheredIfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_getTetheringErroredIfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getTetherableUsbRegexs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_getTetherableWifiRegexs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_reportInetCondition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
}
public void setNetworkPreference(int pref) throws android.os.RemoteException;
public int getNetworkPreference() throws android.os.RemoteException;
public android.net.NetworkInfo getActiveNetworkInfo() throws android.os.RemoteException;
public android.net.NetworkInfo getNetworkInfo(int networkType) throws android.os.RemoteException;
public android.net.NetworkInfo[] getAllNetworkInfo() throws android.os.RemoteException;
public boolean setRadios(boolean onOff) throws android.os.RemoteException;
public boolean setRadio(int networkType, boolean turnOn) throws android.os.RemoteException;
public int startUsingNetworkFeature(int networkType, java.lang.String feature, android.os.IBinder binder) throws android.os.RemoteException;
public int stopUsingNetworkFeature(int networkType, java.lang.String feature) throws android.os.RemoteException;
public boolean requestRouteToHost(int networkType, int hostAddress) throws android.os.RemoteException;
public boolean getBackgroundDataSetting() throws android.os.RemoteException;
public void setBackgroundDataSetting(boolean allowBackgroundData) throws android.os.RemoteException;
public boolean getMobileDataEnabled() throws android.os.RemoteException;
public void setMobileDataEnabled(boolean enabled) throws android.os.RemoteException;
public int tether(java.lang.String iface) throws android.os.RemoteException;
public int untether(java.lang.String iface) throws android.os.RemoteException;
public int getLastTetherError(java.lang.String iface) throws android.os.RemoteException;
public boolean isTetheringSupported() throws android.os.RemoteException;
public java.lang.String[] getTetherableIfaces() throws android.os.RemoteException;
public java.lang.String[] getTetheredIfaces() throws android.os.RemoteException;
public java.lang.String[] getTetheringErroredIfaces() throws android.os.RemoteException;
public java.lang.String[] getTetherableUsbRegexs() throws android.os.RemoteException;
public java.lang.String[] getTetherableWifiRegexs() throws android.os.RemoteException;
public void reportInetCondition(int networkType, int percentage) throws android.os.RemoteException;
}
