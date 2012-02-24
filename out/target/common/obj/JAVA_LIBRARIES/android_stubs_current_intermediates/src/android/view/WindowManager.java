package android.view;
public interface WindowManager
  extends android.view.ViewManager
{
public static class BadTokenException
  extends java.lang.RuntimeException
{
public  BadTokenException() { throw new RuntimeException("Stub!"); }
public  BadTokenException(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
public static class LayoutParams
  extends android.view.ViewGroup.LayoutParams
  implements android.os.Parcelable
{
public  LayoutParams() { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int _type) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int _type, int _flags) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int _type, int _flags, int _format) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h, int _type, int _flags, int _format) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h, int xpos, int ypos, int _type, int _flags, int _format) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.os.Parcel in) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public static  boolean mayUseInputMethod(int flags) { throw new RuntimeException("Stub!"); }
public final  void setTitle(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public final  java.lang.CharSequence getTitle() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public final  int copyFrom(android.view.WindowManager.LayoutParams o) { throw new RuntimeException("Stub!"); }
public  java.lang.String debug(java.lang.String output) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public int x;
public int y;
public float horizontalWeight;
public float verticalWeight;
public int type;
public static final int FIRST_APPLICATION_WINDOW = 1;
public static final int TYPE_BASE_APPLICATION = 1;
public static final int TYPE_APPLICATION = 2;
public static final int TYPE_APPLICATION_STARTING = 3;
public static final int LAST_APPLICATION_WINDOW = 99;
public static final int FIRST_SUB_WINDOW = 1000;
public static final int TYPE_APPLICATION_PANEL = 1000;
public static final int TYPE_APPLICATION_MEDIA = 1001;
public static final int TYPE_APPLICATION_SUB_PANEL = 1002;
public static final int TYPE_APPLICATION_ATTACHED_DIALOG = 1003;
public static final int LAST_SUB_WINDOW = 1999;
public static final int FIRST_SYSTEM_WINDOW = 2000;
public static final int TYPE_STATUS_BAR = 2000;
public static final int TYPE_SEARCH_BAR = 2001;
public static final int TYPE_PHONE = 2002;
public static final int TYPE_SYSTEM_ALERT = 2003;
public static final int TYPE_KEYGUARD = 2004;
public static final int TYPE_TOAST = 2005;
public static final int TYPE_SYSTEM_OVERLAY = 2006;
public static final int TYPE_PRIORITY_PHONE = 2007;
public static final int TYPE_SYSTEM_DIALOG = 2008;
public static final int TYPE_KEYGUARD_DIALOG = 2009;
public static final int TYPE_SYSTEM_ERROR = 2010;
public static final int TYPE_INPUT_METHOD = 2011;
public static final int TYPE_INPUT_METHOD_DIALOG = 2012;
public static final int TYPE_WALLPAPER = 2013;
public static final int TYPE_STATUS_BAR_PANEL = 2014;
public static final int LAST_SYSTEM_WINDOW = 2999;
public int memoryType;
public static final int MEMORY_TYPE_NORMAL = 0;
public static final int MEMORY_TYPE_HARDWARE = 1;
public static final int MEMORY_TYPE_GPU = 2;
public static final int MEMORY_TYPE_PUSH_BUFFERS = 3;
public int flags;
public static final int FLAG_ALLOW_LOCK_WHILE_SCREEN_ON = 1;
public static final int FLAG_DIM_BEHIND = 2;
public static final int FLAG_BLUR_BEHIND = 4;
public static final int FLAG_NOT_FOCUSABLE = 8;
public static final int FLAG_NOT_TOUCHABLE = 16;
public static final int FLAG_NOT_TOUCH_MODAL = 32;
public static final int FLAG_TOUCHABLE_WHEN_WAKING = 64;
public static final int FLAG_KEEP_SCREEN_ON = 128;
public static final int FLAG_LAYOUT_IN_SCREEN = 256;
public static final int FLAG_LAYOUT_NO_LIMITS = 512;
public static final int FLAG_FULLSCREEN = 1024;
public static final int FLAG_FORCE_NOT_FULLSCREEN = 2048;
public static final int FLAG_DITHER = 4096;
public static final int FLAG_SECURE = 8192;
public static final int FLAG_SCALED = 16384;
public static final int FLAG_IGNORE_CHEEK_PRESSES = 32768;
public static final int FLAG_LAYOUT_INSET_DECOR = 65536;
public static final int FLAG_ALT_FOCUSABLE_IM = 131072;
public static final int FLAG_WATCH_OUTSIDE_TOUCH = 262144;
public static final int FLAG_SHOW_WHEN_LOCKED = 524288;
public static final int FLAG_SHOW_WALLPAPER = 1048576;
public static final int FLAG_TURN_SCREEN_ON = 2097152;
public static final int FLAG_DISMISS_KEYGUARD = 4194304;
public static final int PREVENT_POWER_KEY = -2147483648;
public static final int SOFT_INPUT_MASK_STATE = 15;
public static final int SOFT_INPUT_STATE_UNSPECIFIED = 0;
public static final int SOFT_INPUT_STATE_UNCHANGED = 1;
public static final int SOFT_INPUT_STATE_HIDDEN = 2;
public static final int SOFT_INPUT_STATE_ALWAYS_HIDDEN = 3;
public static final int SOFT_INPUT_STATE_VISIBLE = 4;
public static final int SOFT_INPUT_STATE_ALWAYS_VISIBLE = 5;
public static final int SOFT_INPUT_MASK_ADJUST = 240;
public static final int SOFT_INPUT_ADJUST_UNSPECIFIED = 0;
public static final int SOFT_INPUT_ADJUST_RESIZE = 16;
public static final int SOFT_INPUT_ADJUST_PAN = 32;
public static final int SOFT_INPUT_IS_FORWARD_NAVIGATION = 256;
public static final float BRIGHTNESS_OVERRIDE_NONE = -1.0f;
public static final float BRIGHTNESS_OVERRIDE_OFF = 0.0f;
public static final float BRIGHTNESS_OVERRIDE_FULL = 1.0f;
public int softInputMode;
public int gravity;
public float horizontalMargin;
public float verticalMargin;
public int format;
public int windowAnimations;
public float alpha;
public float dimAmount;
public float screenBrightness;
public float buttonBrightness;
public android.os.IBinder token;
public java.lang.String packageName;
public int screenOrientation;
public static final android.os.Parcelable.Creator<android.view.WindowManager.LayoutParams> CREATOR;
public static final int LAYOUT_CHANGED = 1;
public static final int TYPE_CHANGED = 2;
public static final int FLAGS_CHANGED = 4;
public static final int FORMAT_CHANGED = 8;
public static final int ANIMATION_CHANGED = 16;
public static final int DIM_AMOUNT_CHANGED = 32;
public static final int TITLE_CHANGED = 64;
public static final int ALPHA_CHANGED = 128;
public static final int MEMORY_TYPE_CHANGED = 256;
public static final int SOFT_INPUT_MODE_CHANGED = 512;
public static final int SCREEN_ORIENTATION_CHANGED = 1024;
public static final int SCREEN_BRIGHTNESS_CHANGED = 2048;
static { CREATOR = null; }
}
public abstract  android.view.Display getDefaultDisplay();
public abstract  void removeViewImmediate(android.view.View view);
}
