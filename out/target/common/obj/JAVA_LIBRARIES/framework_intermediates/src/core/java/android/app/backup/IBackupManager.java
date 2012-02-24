/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/backup/IBackupManager.aidl
 */
package android.app.backup;
/**
 * Direct interface to the Backup Manager Service that applications invoke on.  The only
 * operation currently needed is a simple notification that the app has made changes to
 * data it wishes to back up, so the system should run a backup pass.
 *
 * Apps will use the {@link android.app.backup.BackupManager} class rather than going through
 * this Binder interface directly.
 * 
 * {@hide}
 */
public interface IBackupManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.backup.IBackupManager
{
private static final java.lang.String DESCRIPTOR = "android.app.backup.IBackupManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.backup.IBackupManager interface,
 * generating a proxy if needed.
 */
public static android.app.backup.IBackupManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.backup.IBackupManager))) {
return ((android.app.backup.IBackupManager)iin);
}
return new android.app.backup.IBackupManager.Stub.Proxy(obj);
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
case TRANSACTION_dataChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.dataChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_clearBackupData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.clearBackupData(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_agentConnected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.agentConnected(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_agentDisconnected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.agentDisconnected(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_restoreAtInstall:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.restoreAtInstall(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setBackupEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setBackupEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setAutoRestore:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setAutoRestore(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setBackupProvisioned:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setBackupProvisioned(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isBackupEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isBackupEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_backupNow:
{
data.enforceInterface(DESCRIPTOR);
this.backupNow();
reply.writeNoException();
return true;
}
case TRANSACTION_getCurrentTransport:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getCurrentTransport();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_listAllTransports:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.listAllTransports();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_selectBackupTransport:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.selectBackupTransport(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_beginRestoreSession:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.app.backup.IRestoreSession _result = this.beginRestoreSession(_arg0, _arg1);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_opComplete:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.opComplete(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.backup.IBackupManager
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
/**
     * Tell the system service that the caller has made changes to its
     * data, and therefore needs to undergo an incremental backup pass.
     *
     * Any application can invoke this method for its own package, but
     * only callers who hold the android.permission.BACKUP permission
     * may invoke it for arbitrary packages.
     */
public void dataChanged(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_dataChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Erase all backed-up data for the given package from the storage
     * destination.
     *
     * Any application can invoke this method for its own package, but
     * only callers who hold the android.permission.BACKUP permission
     * may invoke it for arbitrary packages.
     */
public void clearBackupData(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_clearBackupData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the Backup Manager Service that an agent has become available.  This
     * method is only invoked by the Activity Manager.
     */
public void agentConnected(java.lang.String packageName, android.os.IBinder agent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeStrongBinder(agent);
mRemote.transact(Stub.TRANSACTION_agentConnected, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notify the Backup Manager Service that an agent has unexpectedly gone away.
     * This method is only invoked by the Activity Manager.
     */
public void agentDisconnected(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_agentDisconnected, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notify the Backup Manager Service that an application being installed will
     * need a data-restore pass.  This method is only invoked by the Package Manager.
     */
public void restoreAtInstall(java.lang.String packageName, int token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(token);
mRemote.transact(Stub.TRANSACTION_restoreAtInstall, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Enable/disable the backup service entirely.  When disabled, no backup
     * or restore operations will take place.  Data-changed notifications will
     * still be observed and collected, however, so that changes made while the
     * mechanism was disabled will still be backed up properly if it is enabled
     * at some point in the future.
     *
     * <p>Callers must hold the android.permission.BACKUP permission to use this method.
     */
public void setBackupEnabled(boolean isEnabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isEnabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setBackupEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Enable/disable automatic restore of application data at install time.  When
     * enabled, installation of any package will involve the Backup Manager.  If data
     * exists for the newly-installed package, either from the device's current [enabled]
     * backup dataset or from the restore set used in the last wholesale restore operation,
     * that data will be supplied to the new package's restore agent before the package
     * is made generally available for launch.
     *
     * <p>Callers must hold  the android.permission.BACKUP permission to use this method.
     *
     * @param doAutoRestore When true, enables the automatic app-data restore facility.  When
     *   false, this facility will be disabled.
     */
public void setAutoRestore(boolean doAutoRestore) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((doAutoRestore)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAutoRestore, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Indicate that any necessary one-time provisioning has occurred.
     *
     * <p>Callers must hold the android.permission.BACKUP permission to use this method.
     */
public void setBackupProvisioned(boolean isProvisioned) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isProvisioned)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setBackupProvisioned, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Report whether the backup mechanism is currently enabled.
     *
     * <p>Callers must hold the android.permission.BACKUP permission to use this method.
     */
public boolean isBackupEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isBackupEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Schedule an immediate backup attempt for all pending updates.  This is
     * primarily intended for transports to use when they detect a suitable
     * opportunity for doing a backup pass.  If there are no pending updates to
     * be sent, no action will be taken.  Even if some updates are pending, the
     * transport will still be asked to confirm via the usual requestBackupTime()
     * method.
     *
     * <p>Callers must hold the android.permission.BACKUP permission to use this method.
     */
public void backupNow() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_backupNow, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Identify the currently selected transport.  Callers must hold the
     * android.permission.BACKUP permission to use this method.
     */
public java.lang.String getCurrentTransport() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentTransport, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Request a list of all available backup transports' names.  Callers must
     * hold the android.permission.BACKUP permission to use this method.
     */
public java.lang.String[] listAllTransports() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listAllTransports, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Specify the current backup transport.  Callers must hold the
     * android.permission.BACKUP permission to use this method.
     *
     * @param transport The name of the transport to select.  This should be one
     * of {@link BackupManager.TRANSPORT_GOOGLE} or {@link BackupManager.TRANSPORT_ADB}.
     * @return The name of the previously selected transport.  If the given transport
     *   name is not one of the currently available transports, no change is made to
     *   the current transport setting and the method returns null.
     */
public java.lang.String selectBackupTransport(java.lang.String transport) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(transport);
mRemote.transact(Stub.TRANSACTION_selectBackupTransport, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Begin a restore session.  Either or both of packageName and transportID
     * may be null.  If packageName is non-null, then only the given package will be
     * considered for restore.  If transportID is null, then the restore will use
     * the current active transport.
     * <p>
     * This method requires the android.permission.BACKUP permission <i>except</i>
     * when transportID is null and packageName is the name of the caller's own
     * package.  In that case, the restore session returned is suitable for supporting
     * the BackupManager.requestRestore() functionality via RestoreSession.restorePackage()
     * without requiring the app to hold any special permission.
     *
     * @param packageName The name of the single package for which a restore will
     *        be requested.  May be null, in which case all packages in the restore
     *        set can be restored.
     * @param transportID The name of the transport to use for the restore operation.
     *        May be null, in which case the current active transport is used.
     * @return An interface to the restore session, or null on error.
     */
public android.app.backup.IRestoreSession beginRestoreSession(java.lang.String packageName, java.lang.String transportID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.backup.IRestoreSession _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeString(transportID);
mRemote.transact(Stub.TRANSACTION_beginRestoreSession, _data, _reply, 0);
_reply.readException();
_result = android.app.backup.IRestoreSession.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Notify the backup manager that a BackupAgent has completed the operation
     * corresponding to the given token.
     *
     * @param token The transaction token passed to a BackupAgent's doBackup() or
     *        doRestore() method.
     * {@hide}
     */
public void opComplete(int token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(token);
mRemote.transact(Stub.TRANSACTION_opComplete, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_dataChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_clearBackupData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_agentConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_agentDisconnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_restoreAtInstall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setBackupEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setAutoRestore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setBackupProvisioned = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_isBackupEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_backupNow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getCurrentTransport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_listAllTransports = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_selectBackupTransport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_beginRestoreSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_opComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
}
/**
     * Tell the system service that the caller has made changes to its
     * data, and therefore needs to undergo an incremental backup pass.
     *
     * Any application can invoke this method for its own package, but
     * only callers who hold the android.permission.BACKUP permission
     * may invoke it for arbitrary packages.
     */
public void dataChanged(java.lang.String packageName) throws android.os.RemoteException;
/**
     * Erase all backed-up data for the given package from the storage
     * destination.
     *
     * Any application can invoke this method for its own package, but
     * only callers who hold the android.permission.BACKUP permission
     * may invoke it for arbitrary packages.
     */
public void clearBackupData(java.lang.String packageName) throws android.os.RemoteException;
/**
     * Notifies the Backup Manager Service that an agent has become available.  This
     * method is only invoked by the Activity Manager.
     */
public void agentConnected(java.lang.String packageName, android.os.IBinder agent) throws android.os.RemoteException;
/**
     * Notify the Backup Manager Service that an agent has unexpectedly gone away.
     * This method is only invoked by the Activity Manager.
     */
public void agentDisconnected(java.lang.String packageName) throws android.os.RemoteException;
/**
     * Notify the Backup Manager Service that an application being installed will
     * need a data-restore pass.  This method is only invoked by the Package Manager.
     */
public void restoreAtInstall(java.lang.String packageName, int token) throws android.os.RemoteException;
/**
     * Enable/disable the backup service entirely.  When disabled, no backup
     * or restore operations will take place.  Data-changed notifications will
     * still be observed and collected, however, so that changes made while the
     * mechanism was disabled will still be backed up properly if it is enabled
     * at some point in the future.
     *
     * <p>Callers must hold the android.permission.BACKUP permission to use this method.
     */
public void setBackupEnabled(boolean isEnabled) throws android.os.RemoteException;
/**
     * Enable/disable automatic restore of application data at install time.  When
     * enabled, installation of any package will involve the Backup Manager.  If data
     * exists for the newly-installed package, either from the device's current [enabled]
     * backup dataset or from the restore set used in the last wholesale restore operation,
     * that data will be supplied to the new package's restore agent before the package
     * is made generally available for launch.
     *
     * <p>Callers must hold  the android.permission.BACKUP permission to use this method.
     *
     * @param doAutoRestore When true, enables the automatic app-data restore facility.  When
     *   false, this facility will be disabled.
     */
public void setAutoRestore(boolean doAutoRestore) throws android.os.RemoteException;
/**
     * Indicate that any necessary one-time provisioning has occurred.
     *
     * <p>Callers must hold the android.permission.BACKUP permission to use this method.
     */
public void setBackupProvisioned(boolean isProvisioned) throws android.os.RemoteException;
/**
     * Report whether the backup mechanism is currently enabled.
     *
     * <p>Callers must hold the android.permission.BACKUP permission to use this method.
     */
public boolean isBackupEnabled() throws android.os.RemoteException;
/**
     * Schedule an immediate backup attempt for all pending updates.  This is
     * primarily intended for transports to use when they detect a suitable
     * opportunity for doing a backup pass.  If there are no pending updates to
     * be sent, no action will be taken.  Even if some updates are pending, the
     * transport will still be asked to confirm via the usual requestBackupTime()
     * method.
     *
     * <p>Callers must hold the android.permission.BACKUP permission to use this method.
     */
public void backupNow() throws android.os.RemoteException;
/**
     * Identify the currently selected transport.  Callers must hold the
     * android.permission.BACKUP permission to use this method.
     */
public java.lang.String getCurrentTransport() throws android.os.RemoteException;
/**
     * Request a list of all available backup transports' names.  Callers must
     * hold the android.permission.BACKUP permission to use this method.
     */
public java.lang.String[] listAllTransports() throws android.os.RemoteException;
/**
     * Specify the current backup transport.  Callers must hold the
     * android.permission.BACKUP permission to use this method.
     *
     * @param transport The name of the transport to select.  This should be one
     * of {@link BackupManager.TRANSPORT_GOOGLE} or {@link BackupManager.TRANSPORT_ADB}.
     * @return The name of the previously selected transport.  If the given transport
     *   name is not one of the currently available transports, no change is made to
     *   the current transport setting and the method returns null.
     */
public java.lang.String selectBackupTransport(java.lang.String transport) throws android.os.RemoteException;
/**
     * Begin a restore session.  Either or both of packageName and transportID
     * may be null.  If packageName is non-null, then only the given package will be
     * considered for restore.  If transportID is null, then the restore will use
     * the current active transport.
     * <p>
     * This method requires the android.permission.BACKUP permission <i>except</i>
     * when transportID is null and packageName is the name of the caller's own
     * package.  In that case, the restore session returned is suitable for supporting
     * the BackupManager.requestRestore() functionality via RestoreSession.restorePackage()
     * without requiring the app to hold any special permission.
     *
     * @param packageName The name of the single package for which a restore will
     *        be requested.  May be null, in which case all packages in the restore
     *        set can be restored.
     * @param transportID The name of the transport to use for the restore operation.
     *        May be null, in which case the current active transport is used.
     * @return An interface to the restore session, or null on error.
     */
public android.app.backup.IRestoreSession beginRestoreSession(java.lang.String packageName, java.lang.String transportID) throws android.os.RemoteException;
/**
     * Notify the backup manager that a BackupAgent has completed the operation
     * corresponding to the given token.
     *
     * @param token The transaction token passed to a BackupAgent's doBackup() or
     *        doRestore() method.
     * {@hide}
     */
public void opComplete(int token) throws android.os.RemoteException;
}
