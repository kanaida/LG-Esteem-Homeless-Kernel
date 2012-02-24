/* This file is auto-generated.  DO NOT MODIFY.
 * Source file: frameworks/base/services/java/com/android/server/EventLogTags.logtags
 */

package com.android.server;

/**
 * @hide
 */
public class EventLogTags {
  private EventLogTags() { }  // don't instantiate

  /** 2722 battery_level (level|1|6),(voltage|1|1),(temperature|1|1) */
  public static final int BATTERY_LEVEL = 2722;

  /** 2723 battery_status (status|1|5),(health|1|5),(present|1|5),(plugged|1|5),(technology|3) */
  public static final int BATTERY_STATUS = 2723;

  /** 2730 battery_discharge (duration|2|3),(minLevel|1|6),(maxLevel|1|6) */
  public static final int BATTERY_DISCHARGE = 2730;

  /** 2724 power_sleep_requested (wakeLocksCleared|1|1) */
  public static final int POWER_SLEEP_REQUESTED = 2724;

  /** 2725 power_screen_broadcast_send (wakelockCount|1|1) */
  public static final int POWER_SCREEN_BROADCAST_SEND = 2725;

  /** 2726 power_screen_broadcast_done (on|1|5),(broadcastDuration|2|3),(wakelockCount|1|1) */
  public static final int POWER_SCREEN_BROADCAST_DONE = 2726;

  /** 2727 power_screen_broadcast_stop (which|1|5),(wakelockCount|1|1) */
  public static final int POWER_SCREEN_BROADCAST_STOP = 2727;

  /** 2728 power_screen_state (offOrOn|1|5),(becauseOfUser|1|5),(totalTouchDownTime|2|3),(touchCycles|1|1) */
  public static final int POWER_SCREEN_STATE = 2728;

  /** 2729 power_partial_wake_state (releasedorAcquired|1|5),(tag|3) */
  public static final int POWER_PARTIAL_WAKE_STATE = 2729;

  /** 2744 free_storage_changed (data|2|2) */
  public static final int FREE_STORAGE_CHANGED = 2744;

  /** 2745 low_storage (data|2|2) */
  public static final int LOW_STORAGE = 2745;

  /** 2746 free_storage_left (data|2|2),(system|2|2),(cache|2|2) */
  public static final int FREE_STORAGE_LEFT = 2746;

  /** 2750 notification_enqueue (pkg|3),(id|1|5),(notification|3) */
  public static final int NOTIFICATION_ENQUEUE = 2750;

  /** 2751 notification_cancel (pkg|3),(id|1|5),(required_flags|1) */
  public static final int NOTIFICATION_CANCEL = 2751;

  /** 2752 notification_cancel_all (pkg|3),(required_flags|1) */
  public static final int NOTIFICATION_CANCEL_ALL = 2752;

  /** 2802 watchdog (Service|3) */
  public static final int WATCHDOG = 2802;

  /** 2803 watchdog_proc_pss (Process|3),(Pid|1|5),(Pss|1|2) */
  public static final int WATCHDOG_PROC_PSS = 2803;

  /** 2804 watchdog_soft_reset (Process|3),(Pid|1|5),(MaxPss|1|2),(Pss|1|2),(Skip|3) */
  public static final int WATCHDOG_SOFT_RESET = 2804;

  /** 2805 watchdog_hard_reset (Process|3),(Pid|1|5),(MaxPss|1|2),(Pss|1|2) */
  public static final int WATCHDOG_HARD_RESET = 2805;

  /** 2806 watchdog_pss_stats (EmptyPss|1|2),(EmptyCount|1|1),(BackgroundPss|1|2),(BackgroundCount|1|1),(ServicePss|1|2),(ServiceCount|1|1),(VisiblePss|1|2),(VisibleCount|1|1),(ForegroundPss|1|2),(ForegroundCount|1|1),(NoPssCount|1|1) */
  public static final int WATCHDOG_PSS_STATS = 2806;

  /** 2807 watchdog_proc_stats (DeathsInOne|1|1),(DeathsInTwo|1|1),(DeathsInThree|1|1),(DeathsInFour|1|1),(DeathsInFive|1|1) */
  public static final int WATCHDOG_PROC_STATS = 2807;

  /** 2808 watchdog_scheduled_reboot (Now|2|1),(Interval|1|3),(StartTime|1|3),(Window|1|3),(Skip|3) */
  public static final int WATCHDOG_SCHEDULED_REBOOT = 2808;

  /** 2809 watchdog_meminfo (MemFree|1|2),(Buffers|1|2),(Cached|1|2),(Active|1|2),(Inactive|1|2),(AnonPages|1|2),(Mapped|1|2),(Slab|1|2),(SReclaimable|1|2),(SUnreclaim|1|2),(PageTables|1|2) */
  public static final int WATCHDOG_MEMINFO = 2809;

  /** 2810 watchdog_vmstat (runtime|2|3),(pgfree|1|1),(pgactivate|1|1),(pgdeactivate|1|1),(pgfault|1|1),(pgmajfault|1|1) */
  public static final int WATCHDOG_VMSTAT = 2810;

  /** 2811 watchdog_requested_reboot (NoWait|1|1),(ScheduleInterval|1|3),(RecheckInterval|1|3),(StartTime|1|3),(Window|1|3),(MinScreenOff|1|3),(MinNextAlarm|1|3) */
  public static final int WATCHDOG_REQUESTED_REBOOT = 2811;

  /** 2820 backup_data_changed (Package|3) */
  public static final int BACKUP_DATA_CHANGED = 2820;

  /** 2821 backup_start (Transport|3) */
  public static final int BACKUP_START = 2821;

  /** 2822 backup_transport_failure (Package|3) */
  public static final int BACKUP_TRANSPORT_FAILURE = 2822;

  /** 2823 backup_agent_failure (Package|3),(Message|3) */
  public static final int BACKUP_AGENT_FAILURE = 2823;

  /** 2824 backup_package (Package|3),(Size|1|2) */
  public static final int BACKUP_PACKAGE = 2824;

  /** 2825 backup_success (Packages|1|1),(Time|1|3) */
  public static final int BACKUP_SUCCESS = 2825;

  /** 2826 backup_reset (Transport|3) */
  public static final int BACKUP_RESET = 2826;

  /** 2827 backup_initialize */
  public static final int BACKUP_INITIALIZE = 2827;

  /** 2830 restore_start (Transport|3),(Source|2|5) */
  public static final int RESTORE_START = 2830;

  /** 2831 restore_transport_failure */
  public static final int RESTORE_TRANSPORT_FAILURE = 2831;

  /** 2832 restore_agent_failure (Package|3),(Message|3) */
  public static final int RESTORE_AGENT_FAILURE = 2832;

  /** 2833 restore_package (Package|3),(Size|1|2) */
  public static final int RESTORE_PACKAGE = 2833;

  /** 2834 restore_success (Packages|1|1),(Time|1|3) */
  public static final int RESTORE_SUCCESS = 2834;

  /** 3010 boot_progress_system_run (time|2|3) */
  public static final int BOOT_PROGRESS_SYSTEM_RUN = 3010;

  /** 3060 boot_progress_pms_start (time|2|3) */
  public static final int BOOT_PROGRESS_PMS_START = 3060;

  /** 3070 boot_progress_pms_system_scan_start (time|2|3) */
  public static final int BOOT_PROGRESS_PMS_SYSTEM_SCAN_START = 3070;

  /** 3080 boot_progress_pms_data_scan_start (time|2|3) */
  public static final int BOOT_PROGRESS_PMS_DATA_SCAN_START = 3080;

  /** 3090 boot_progress_pms_scan_end (time|2|3) */
  public static final int BOOT_PROGRESS_PMS_SCAN_END = 3090;

  /** 3100 boot_progress_pms_ready (time|2|3) */
  public static final int BOOT_PROGRESS_PMS_READY = 3100;

  /** 31000 wm_no_surface_memory (Window|3),(PID|1|5),(Operation|3) */
  public static final int WM_NO_SURFACE_MEMORY = 31000;

  /** 32000 imf_force_reconnect_ime (IME|4),(Time Since Connect|2|3),(Showing|1|1) */
  public static final int IMF_FORCE_RECONNECT_IME = 32000;

  /** 50020 connectivity_state_changed (custom|1|5) */
  public static final int CONNECTIVITY_STATE_CHANGED = 50020;

  public static void writeBatteryLevel(int level, int voltage, int temperature) {
    android.util.EventLog.writeEvent(BATTERY_LEVEL, level, voltage, temperature);
  }

  public static void writeBatteryStatus(int status, int health, int present, int plugged, String technology) {
    android.util.EventLog.writeEvent(BATTERY_STATUS, status, health, present, plugged, technology);
  }

  public static void writeBatteryDischarge(long duration, int minlevel, int maxlevel) {
    android.util.EventLog.writeEvent(BATTERY_DISCHARGE, duration, minlevel, maxlevel);
  }

  public static void writePowerSleepRequested(int wakelockscleared) {
    android.util.EventLog.writeEvent(POWER_SLEEP_REQUESTED, wakelockscleared);
  }

  public static void writePowerScreenBroadcastSend(int wakelockcount) {
    android.util.EventLog.writeEvent(POWER_SCREEN_BROADCAST_SEND, wakelockcount);
  }

  public static void writePowerScreenBroadcastDone(int on, long broadcastduration, int wakelockcount) {
    android.util.EventLog.writeEvent(POWER_SCREEN_BROADCAST_DONE, on, broadcastduration, wakelockcount);
  }

  public static void writePowerScreenBroadcastStop(int which, int wakelockcount) {
    android.util.EventLog.writeEvent(POWER_SCREEN_BROADCAST_STOP, which, wakelockcount);
  }

  public static void writePowerScreenState(int offoron, int becauseofuser, long totaltouchdowntime, int touchcycles) {
    android.util.EventLog.writeEvent(POWER_SCREEN_STATE, offoron, becauseofuser, totaltouchdowntime, touchcycles);
  }

  public static void writePowerPartialWakeState(int releasedoracquired, String tag) {
    android.util.EventLog.writeEvent(POWER_PARTIAL_WAKE_STATE, releasedoracquired, tag);
  }

  public static void writeFreeStorageChanged(long data) {
    android.util.EventLog.writeEvent(FREE_STORAGE_CHANGED, data);
  }

  public static void writeLowStorage(long data) {
    android.util.EventLog.writeEvent(LOW_STORAGE, data);
  }

  public static void writeFreeStorageLeft(long data, long system, long cache) {
    android.util.EventLog.writeEvent(FREE_STORAGE_LEFT, data, system, cache);
  }

  public static void writeNotificationEnqueue(String pkg, int id, String notification) {
    android.util.EventLog.writeEvent(NOTIFICATION_ENQUEUE, pkg, id, notification);
  }

  public static void writeNotificationCancel(String pkg, int id, int requiredFlags) {
    android.util.EventLog.writeEvent(NOTIFICATION_CANCEL, pkg, id, requiredFlags);
  }

  public static void writeNotificationCancelAll(String pkg, int requiredFlags) {
    android.util.EventLog.writeEvent(NOTIFICATION_CANCEL_ALL, pkg, requiredFlags);
  }

  public static void writeWatchdog(String service) {
    android.util.EventLog.writeEvent(WATCHDOG, service);
  }

  public static void writeWatchdogProcPss(String process, int pid, int pss) {
    android.util.EventLog.writeEvent(WATCHDOG_PROC_PSS, process, pid, pss);
  }

  public static void writeWatchdogSoftReset(String process, int pid, int maxpss, int pss, String skip) {
    android.util.EventLog.writeEvent(WATCHDOG_SOFT_RESET, process, pid, maxpss, pss, skip);
  }

  public static void writeWatchdogHardReset(String process, int pid, int maxpss, int pss) {
    android.util.EventLog.writeEvent(WATCHDOG_HARD_RESET, process, pid, maxpss, pss);
  }

  public static void writeWatchdogPssStats(int emptypss, int emptycount, int backgroundpss, int backgroundcount, int servicepss, int servicecount, int visiblepss, int visiblecount, int foregroundpss, int foregroundcount, int nopsscount) {
    android.util.EventLog.writeEvent(WATCHDOG_PSS_STATS, emptypss, emptycount, backgroundpss, backgroundcount, servicepss, servicecount, visiblepss, visiblecount, foregroundpss, foregroundcount, nopsscount);
  }

  public static void writeWatchdogProcStats(int deathsinone, int deathsintwo, int deathsinthree, int deathsinfour, int deathsinfive) {
    android.util.EventLog.writeEvent(WATCHDOG_PROC_STATS, deathsinone, deathsintwo, deathsinthree, deathsinfour, deathsinfive);
  }

  public static void writeWatchdogScheduledReboot(long now, int interval, int starttime, int window, String skip) {
    android.util.EventLog.writeEvent(WATCHDOG_SCHEDULED_REBOOT, now, interval, starttime, window, skip);
  }

  public static void writeWatchdogMeminfo(int memfree, int buffers, int cached, int active, int inactive, int anonpages, int mapped, int slab, int sreclaimable, int sunreclaim, int pagetables) {
    android.util.EventLog.writeEvent(WATCHDOG_MEMINFO, memfree, buffers, cached, active, inactive, anonpages, mapped, slab, sreclaimable, sunreclaim, pagetables);
  }

  public static void writeWatchdogVmstat(long runtime, int pgfree, int pgactivate, int pgdeactivate, int pgfault, int pgmajfault) {
    android.util.EventLog.writeEvent(WATCHDOG_VMSTAT, runtime, pgfree, pgactivate, pgdeactivate, pgfault, pgmajfault);
  }

  public static void writeWatchdogRequestedReboot(int nowait, int scheduleinterval, int recheckinterval, int starttime, int window, int minscreenoff, int minnextalarm) {
    android.util.EventLog.writeEvent(WATCHDOG_REQUESTED_REBOOT, nowait, scheduleinterval, recheckinterval, starttime, window, minscreenoff, minnextalarm);
  }

  public static void writeBackupDataChanged(String package_) {
    android.util.EventLog.writeEvent(BACKUP_DATA_CHANGED, package_);
  }

  public static void writeBackupStart(String transport) {
    android.util.EventLog.writeEvent(BACKUP_START, transport);
  }

  public static void writeBackupTransportFailure(String package_) {
    android.util.EventLog.writeEvent(BACKUP_TRANSPORT_FAILURE, package_);
  }

  public static void writeBackupAgentFailure(String package_, String message) {
    android.util.EventLog.writeEvent(BACKUP_AGENT_FAILURE, package_, message);
  }

  public static void writeBackupPackage(String package_, int size) {
    android.util.EventLog.writeEvent(BACKUP_PACKAGE, package_, size);
  }

  public static void writeBackupSuccess(int packages, int time) {
    android.util.EventLog.writeEvent(BACKUP_SUCCESS, packages, time);
  }

  public static void writeBackupReset(String transport) {
    android.util.EventLog.writeEvent(BACKUP_RESET, transport);
  }

  public static void writeBackupInitialize() {
    android.util.EventLog.writeEvent(BACKUP_INITIALIZE);
  }

  public static void writeRestoreStart(String transport, long source) {
    android.util.EventLog.writeEvent(RESTORE_START, transport, source);
  }

  public static void writeRestoreTransportFailure() {
    android.util.EventLog.writeEvent(RESTORE_TRANSPORT_FAILURE);
  }

  public static void writeRestoreAgentFailure(String package_, String message) {
    android.util.EventLog.writeEvent(RESTORE_AGENT_FAILURE, package_, message);
  }

  public static void writeRestorePackage(String package_, int size) {
    android.util.EventLog.writeEvent(RESTORE_PACKAGE, package_, size);
  }

  public static void writeRestoreSuccess(int packages, int time) {
    android.util.EventLog.writeEvent(RESTORE_SUCCESS, packages, time);
  }

  public static void writeBootProgressSystemRun(long time) {
    android.util.EventLog.writeEvent(BOOT_PROGRESS_SYSTEM_RUN, time);
  }

  public static void writeBootProgressPmsStart(long time) {
    android.util.EventLog.writeEvent(BOOT_PROGRESS_PMS_START, time);
  }

  public static void writeBootProgressPmsSystemScanStart(long time) {
    android.util.EventLog.writeEvent(BOOT_PROGRESS_PMS_SYSTEM_SCAN_START, time);
  }

  public static void writeBootProgressPmsDataScanStart(long time) {
    android.util.EventLog.writeEvent(BOOT_PROGRESS_PMS_DATA_SCAN_START, time);
  }

  public static void writeBootProgressPmsScanEnd(long time) {
    android.util.EventLog.writeEvent(BOOT_PROGRESS_PMS_SCAN_END, time);
  }

  public static void writeBootProgressPmsReady(long time) {
    android.util.EventLog.writeEvent(BOOT_PROGRESS_PMS_READY, time);
  }

  public static void writeWmNoSurfaceMemory(String window, int pid, String operation) {
    android.util.EventLog.writeEvent(WM_NO_SURFACE_MEMORY, window, pid, operation);
  }

  public static void writeImfForceReconnectIme(Object[] ime, long timeSinceConnect, int showing) {
    android.util.EventLog.writeEvent(IMF_FORCE_RECONNECT_IME, ime, timeSinceConnect, showing);
  }

  public static void writeConnectivityStateChanged(int custom) {
    android.util.EventLog.writeEvent(CONNECTIVITY_STATE_CHANGED, custom);
  }
}
