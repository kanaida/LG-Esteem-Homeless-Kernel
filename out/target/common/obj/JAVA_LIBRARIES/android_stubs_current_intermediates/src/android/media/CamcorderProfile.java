package android.media;
public class CamcorderProfile
{
CamcorderProfile() { throw new RuntimeException("Stub!"); }
public static  android.media.CamcorderProfile get(int quality) { throw new RuntimeException("Stub!"); }
public static  android.media.CamcorderProfile get(int cameraId, int quality) { throw new RuntimeException("Stub!"); }
public static final int QUALITY_LOW = 0;
public static final int QUALITY_HIGH = 1;
public static final int QUALITY_HD = 2;
public static final int QUALITY_WIDE = 3;
public int duration;
public int quality;
public int fileFormat;
public int videoCodec;
public int videoBitRate;
public int videoFrameRate;
public int videoFrameWidth;
public int videoFrameHeight;
public int audioCodec;
public int audioBitRate;
public int audioSampleRate;
public int audioChannels;
}
