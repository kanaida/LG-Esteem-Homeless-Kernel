/* This file is auto-generated.  DO NOT MODIFY.
 * Source file: frameworks/base/services/java/com/android/server/am/EventLogTags.logtags
 */

package com.android.server.am;

/**
 * @hide
 */
public class EventLogTags {
  private EventLogTags() { }  // don't instantiate

  /** 2719 configuration_changed (config mask|1|5) */
  public static final int CONFIGURATION_CHANGED = 2719;

  /** 2721 cpu (total|1|6),(user|1|6),(system|1|6),(iowait|1|6),(irq|1|6),(softirq|1|6) */
  public static final int CPU = 2721;

  /** 3040 boot_progress_ams_ready (time|2|3) */
  public static final int BOOT_PROGRESS_AMS_READY = 3040;

  /** 3050 boot_progress_enable_screen (time|2|3) */
  public static final int BOOT_PROGRESS_ENABLE_SCREEN = 3050;

  /** 30001 am_finish_activity (Token|1|5),(Task ID|1|5),(Component Name|3),(Reason|3) */
  public static final int AM_FINISH_ACTIVITY = 30001;

  /** 30002 am_task_to_front (Task|1|5) */
  public static final int AM_TASK_TO_FRONT = 30002;

  /** 30003 am_new_intent (Token|1|5),(Task ID|1|5),(Component Name|3),(Action|3),(MIME Type|3),(URI|3),(Flags|1|5) */
  public static final int AM_NEW_INTENT = 30003;

  /** 30004 am_create_task (Task ID|1|5) */
  public static final int AM_CREATE_TASK = 30004;

  /** 30005 am_create_activity (Token|1|5),(Task ID|1|5),(Component Name|3),(Action|3),(MIME Type|3),(URI|3),(Flags|1|5) */
  public static final int AM_CREATE_ACTIVITY = 30005;

  /** 30006 am_restart_activity (Token|1|5),(Task ID|1|5),(Component Name|3) */
  public static final int AM_RESTART_ACTIVITY = 30006;

  /** 30007 am_resume_activity (Token|1|5),(Task ID|1|5),(Component Name|3) */
  public static final int AM_RESUME_ACTIVITY = 30007;

  /** 30008 am_anr (pid|1|5),(Package Name|3),(Flags|1|5),(reason|3) */
  public static final int AM_ANR = 30008;

  /** 30009 activity_launch_time (Token|1|5),(Component Name|3),(time|2|3) */
  public static final int ACTIVITY_LAUNCH_TIME = 30009;

  /** 30010 am_proc_bound (PID|1|5),(Process Name|3) */
  public static final int AM_PROC_BOUND = 30010;

  /** 30011 am_proc_died (PID|1|5),(Process Name|3) */
  public static final int AM_PROC_DIED = 30011;

  /** 30012 am_failed_to_pause (Token|1|5),(Wanting to pause|3),(Currently pausing|3) */
  public static final int AM_FAILED_TO_PAUSE = 30012;

  /** 30013 am_pause_activity (Token|1|5),(Component Name|3) */
  public static final int AM_PAUSE_ACTIVITY = 30013;

  /** 30014 am_proc_start (PID|1|5),(UID|1|5),(Process Name|3),(Type|3),(Component|3) */
  public static final int AM_PROC_START = 30014;

  /** 30015 am_proc_bad (UID|1|5),(Process Name|3) */
  public static final int AM_PROC_BAD = 30015;

  /** 30016 am_proc_good (UID|1|5),(Process Name|3) */
  public static final int AM_PROC_GOOD = 30016;

  /** 30017 am_low_memory (Num Processes|1|1) */
  public static final int AM_LOW_MEMORY = 30017;

  /** 30018 am_destroy_activity (Token|1|5),(Task ID|1|5),(Component Name|3) */
  public static final int AM_DESTROY_ACTIVITY = 30018;

  /** 30019 am_relaunch_resume_activity (Token|1|5),(Task ID|1|5),(Component Name|3) */
  public static final int AM_RELAUNCH_RESUME_ACTIVITY = 30019;

  /** 30020 am_relaunch_activity (Token|1|5),(Task ID|1|5),(Component Name|3) */
  public static final int AM_RELAUNCH_ACTIVITY = 30020;

  /** 30021 am_on_paused_called (Component Name|3) */
  public static final int AM_ON_PAUSED_CALLED = 30021;

  /** 30022 am_on_resume_called (Component Name|3) */
  public static final int AM_ON_RESUME_CALLED = 30022;

  /** 30023 am_kill (PID|1|5),(Process Name|3),(OomAdj|1|5),(Reason|3) */
  public static final int AM_KILL = 30023;

  /** 30024 am_broadcast_discard_filter (Broadcast|1|5),(Action|3),(Receiver Number|1|1),(BroadcastFilter|1|5) */
  public static final int AM_BROADCAST_DISCARD_FILTER = 30024;

  /** 30025 am_broadcast_discard_app (Broadcast|1|5),(Action|3),(Receiver Number|1|1),(App|3) */
  public static final int AM_BROADCAST_DISCARD_APP = 30025;

  /** 30030 am_create_service (Service Record|1|5),(Name|3),(Intent|3),(PID|1|5) */
  public static final int AM_CREATE_SERVICE = 30030;

  /** 30031 am_destroy_service (Service Record|1|5),(Name|3),(PID|1|5) */
  public static final int AM_DESTROY_SERVICE = 30031;

  /** 30032 am_process_crashed_too_much (Name|3),(PID|1|5) */
  public static final int AM_PROCESS_CRASHED_TOO_MUCH = 30032;

  /** 30033 am_drop_process (PID|1|5) */
  public static final int AM_DROP_PROCESS = 30033;

  /** 30034 am_service_crashed_too_much (Crash Count|1|1),(Component Name|3),(PID|1|5) */
  public static final int AM_SERVICE_CRASHED_TOO_MUCH = 30034;

  /** 30035 am_schedule_service_restart (Component Name|3),(Time|2|3) */
  public static final int AM_SCHEDULE_SERVICE_RESTART = 30035;

  /** 30036 am_provider_lost_process (Package Name|3),(UID|1|5),(Name|3) */
  public static final int AM_PROVIDER_LOST_PROCESS = 30036;

  /** 30037 am_process_start_timeout (PID|1|5),(UID|1|5),(Process Name|3) */
  public static final int AM_PROCESS_START_TIMEOUT = 30037;

  /** 30039 am_crash (PID|1|5),(Process Name|3),(Flags|1|5),(Exception|3),(Message|3),(File|3),(Line|1|5) */
  public static final int AM_CRASH = 30039;

  /** 30040 am_wtf (PID|1|5),(Process Name|3),(Flags|1|5),(Tag|3),(Message|3) */
  public static final int AM_WTF = 30040;

  public static void writeConfigurationChanged(int configMask) {
    android.util.EventLog.writeEvent(CONFIGURATION_CHANGED, configMask);
  }

  public static void writeCpu(int total, int user, int system, int iowait, int irq, int softirq) {
    android.util.EventLog.writeEvent(CPU, total, user, system, iowait, irq, softirq);
  }

  public static void writeBootProgressAmsReady(long time) {
    android.util.EventLog.writeEvent(BOOT_PROGRESS_AMS_READY, time);
  }

  public static void writeBootProgressEnableScreen(long time) {
    android.util.EventLog.writeEvent(BOOT_PROGRESS_ENABLE_SCREEN, time);
  }

  public static void writeAmFinishActivity(int token, int taskId, String componentName, String reason) {
    android.util.EventLog.writeEvent(AM_FINISH_ACTIVITY, token, taskId, componentName, reason);
  }

  public static void writeAmTaskToFront(int task) {
    android.util.EventLog.writeEvent(AM_TASK_TO_FRONT, task);
  }

  public static void writeAmNewIntent(int token, int taskId, String componentName, String action, String mimeType, String uri, int flags) {
    android.util.EventLog.writeEvent(AM_NEW_INTENT, token, taskId, componentName, action, mimeType, uri, flags);
  }

  public static void writeAmCreateTask(int taskId) {
    android.util.EventLog.writeEvent(AM_CREATE_TASK, taskId);
  }

  public static void writeAmCreateActivity(int token, int taskId, String componentName, String action, String mimeType, String uri, int flags) {
    android.util.EventLog.writeEvent(AM_CREATE_ACTIVITY, token, taskId, componentName, action, mimeType, uri, flags);
  }

  public static void writeAmRestartActivity(int token, int taskId, String componentName) {
    android.util.EventLog.writeEvent(AM_RESTART_ACTIVITY, token, taskId, componentName);
  }

  public static void writeAmResumeActivity(int token, int taskId, String componentName) {
    android.util.EventLog.writeEvent(AM_RESUME_ACTIVITY, token, taskId, componentName);
  }

  public static void writeAmAnr(int pid, String packageName, int flags, String reason) {
    android.util.EventLog.writeEvent(AM_ANR, pid, packageName, flags, reason);
  }

  public static void writeActivityLaunchTime(int token, String componentName, long time) {
    android.util.EventLog.writeEvent(ACTIVITY_LAUNCH_TIME, token, componentName, time);
  }

  public static void writeAmProcBound(int pid, String processName) {
    android.util.EventLog.writeEvent(AM_PROC_BOUND, pid, processName);
  }

  public static void writeAmProcDied(int pid, String processName) {
    android.util.EventLog.writeEvent(AM_PROC_DIED, pid, processName);
  }

  public static void writeAmFailedToPause(int token, String wantingToPause, String currentlyPausing) {
    android.util.EventLog.writeEvent(AM_FAILED_TO_PAUSE, token, wantingToPause, currentlyPausing);
  }

  public static void writeAmPauseActivity(int token, String componentName) {
    android.util.EventLog.writeEvent(AM_PAUSE_ACTIVITY, token, componentName);
  }

  public static void writeAmProcStart(int pid, int uid, String processName, String type, String component) {
    android.util.EventLog.writeEvent(AM_PROC_START, pid, uid, processName, type, component);
  }

  public static void writeAmProcBad(int uid, String processName) {
    android.util.EventLog.writeEvent(AM_PROC_BAD, uid, processName);
  }

  public static void writeAmProcGood(int uid, String processName) {
    android.util.EventLog.writeEvent(AM_PROC_GOOD, uid, processName);
  }

  public static void writeAmLowMemory(int numProcesses) {
    android.util.EventLog.writeEvent(AM_LOW_MEMORY, numProcesses);
  }

  public static void writeAmDestroyActivity(int token, int taskId, String componentName) {
    android.util.EventLog.writeEvent(AM_DESTROY_ACTIVITY, token, taskId, componentName);
  }

  public static void writeAmRelaunchResumeActivity(int token, int taskId, String componentName) {
    android.util.EventLog.writeEvent(AM_RELAUNCH_RESUME_ACTIVITY, token, taskId, componentName);
  }

  public static void writeAmRelaunchActivity(int token, int taskId, String componentName) {
    android.util.EventLog.writeEvent(AM_RELAUNCH_ACTIVITY, token, taskId, componentName);
  }

  public static void writeAmOnPausedCalled(String componentName) {
    android.util.EventLog.writeEvent(AM_ON_PAUSED_CALLED, componentName);
  }

  public static void writeAmOnResumeCalled(String componentName) {
    android.util.EventLog.writeEvent(AM_ON_RESUME_CALLED, componentName);
  }

  public static void writeAmKill(int pid, String processName, int oomadj, String reason) {
    android.util.EventLog.writeEvent(AM_KILL, pid, processName, oomadj, reason);
  }

  public static void writeAmBroadcastDiscardFilter(int broadcast, String action, int receiverNumber, int broadcastfilter) {
    android.util.EventLog.writeEvent(AM_BROADCAST_DISCARD_FILTER, broadcast, action, receiverNumber, broadcastfilter);
  }

  public static void writeAmBroadcastDiscardApp(int broadcast, String action, int receiverNumber, String app) {
    android.util.EventLog.writeEvent(AM_BROADCAST_DISCARD_APP, broadcast, action, receiverNumber, app);
  }

  public static void writeAmCreateService(int serviceRecord, String name, String intent, int pid) {
    android.util.EventLog.writeEvent(AM_CREATE_SERVICE, serviceRecord, name, intent, pid);
  }

  public static void writeAmDestroyService(int serviceRecord, String name, int pid) {
    android.util.EventLog.writeEvent(AM_DESTROY_SERVICE, serviceRecord, name, pid);
  }

  public static void writeAmProcessCrashedTooMuch(String name, int pid) {
    android.util.EventLog.writeEvent(AM_PROCESS_CRASHED_TOO_MUCH, name, pid);
  }

  public static void writeAmDropProcess(int pid) {
    android.util.EventLog.writeEvent(AM_DROP_PROCESS, pid);
  }

  public static void writeAmServiceCrashedTooMuch(int crashCount, String componentName, int pid) {
    android.util.EventLog.writeEvent(AM_SERVICE_CRASHED_TOO_MUCH, crashCount, componentName, pid);
  }

  public static void writeAmScheduleServiceRestart(String componentName, long time) {
    android.util.EventLog.writeEvent(AM_SCHEDULE_SERVICE_RESTART, componentName, time);
  }

  public static void writeAmProviderLostProcess(String packageName, int uid, String name) {
    android.util.EventLog.writeEvent(AM_PROVIDER_LOST_PROCESS, packageName, uid, name);
  }

  public static void writeAmProcessStartTimeout(int pid, int uid, String processName) {
    android.util.EventLog.writeEvent(AM_PROCESS_START_TIMEOUT, pid, uid, processName);
  }

  public static void writeAmCrash(int pid, String processName, int flags, String exception, String message, String file, int line) {
    android.util.EventLog.writeEvent(AM_CRASH, pid, processName, flags, exception, message, file, line);
  }

  public static void writeAmWtf(int pid, String processName, int flags, String tag, String message) {
    android.util.EventLog.writeEvent(AM_WTF, pid, processName, flags, tag, message);
  }
}
