package android.hardware;
public class Camera
{
public static class CameraInfo
{
public  CameraInfo() { throw new RuntimeException("Stub!"); }
public static final int CAMERA_FACING_BACK = 0;
public static final int CAMERA_FACING_FRONT = 1;
public int facing;
public int orientation;
}
public static interface PreviewCallback
{
public abstract  void onPreviewFrame(byte[] data, android.hardware.Camera camera);
}
public static interface AutoFocusCallback
{
public abstract  void onAutoFocus(boolean success, android.hardware.Camera camera);
}
public static interface ShutterCallback
{
public abstract  void onShutter();
}
public static interface PictureCallback
{
public abstract  void onPictureTaken(byte[] data, android.hardware.Camera camera);
}
public static interface OnZoomChangeListener
{
public abstract  void onZoomChange(int zoomValue, boolean stopped, android.hardware.Camera camera);
}
public static interface ErrorCallback
{
public abstract  void onError(int error, android.hardware.Camera camera);
}
public class Size
{
public  Size(int w, int h) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public int width;
public int height;
}
public class Coordinate
{
public  Coordinate(int x, int y) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public int xCoordinate;
public int yCoordinate;
}
public class Parameters
{
Parameters() { throw new RuntimeException("Stub!"); }
public  java.lang.String flatten() { throw new RuntimeException("Stub!"); }
public  void unflatten(java.lang.String flattened) { throw new RuntimeException("Stub!"); }
public  void remove(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  void set(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void set(java.lang.String key, int value) { throw new RuntimeException("Stub!"); }
public  java.lang.String get(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  int getInt(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  void setPreviewSize(int width, int height) { throw new RuntimeException("Stub!"); }
public  android.hardware.Camera.Size getPreviewSize() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.hardware.Camera.Size> getSupportedPreviewSizes() { throw new RuntimeException("Stub!"); }
public  void setJpegThumbnailSize(int width, int height) { throw new RuntimeException("Stub!"); }
public  android.hardware.Camera.Size getJpegThumbnailSize() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.hardware.Camera.Size> getSupportedJpegThumbnailSizes() { throw new RuntimeException("Stub!"); }
public  void setJpegThumbnailQuality(int quality) { throw new RuntimeException("Stub!"); }
public  int getJpegThumbnailQuality() { throw new RuntimeException("Stub!"); }
public  void setJpegQuality(int quality) { throw new RuntimeException("Stub!"); }
public  int getJpegQuality() { throw new RuntimeException("Stub!"); }
public  void setPreviewFrameRate(int fps) { throw new RuntimeException("Stub!"); }
public  int getPreviewFrameRate() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.Integer> getSupportedPreviewFrameRates() { throw new RuntimeException("Stub!"); }
public  void setPreviewFpsRange(int min, int max) { throw new RuntimeException("Stub!"); }
public  void getPreviewFpsRange(int[] range) { throw new RuntimeException("Stub!"); }
public  java.util.List<int[]> getSupportedPreviewFpsRange() { throw new RuntimeException("Stub!"); }
public  void setPreviewFormat(int pixel_format) { throw new RuntimeException("Stub!"); }
public  int getPreviewFormat() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.Integer> getSupportedPreviewFormats() { throw new RuntimeException("Stub!"); }
public  void setPictureSize(int width, int height) { throw new RuntimeException("Stub!"); }
public  android.hardware.Camera.Size getPictureSize() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.hardware.Camera.Size> getSupportedPictureSizes() { throw new RuntimeException("Stub!"); }
public  void setPictureFormat(int pixel_format) { throw new RuntimeException("Stub!"); }
public  int getPictureFormat() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.Integer> getSupportedPictureFormats() { throw new RuntimeException("Stub!"); }
public  void setRotation(int rotation) { throw new RuntimeException("Stub!"); }
public  void setGpsLatitude(double latitude) { throw new RuntimeException("Stub!"); }
public  void setGpsLongitude(double longitude) { throw new RuntimeException("Stub!"); }
public  void setGpsAltitude(double altitude) { throw new RuntimeException("Stub!"); }
public  void setGpsTimestamp(long timestamp) { throw new RuntimeException("Stub!"); }
public  void setGpsProcessingMethod(java.lang.String processing_method) { throw new RuntimeException("Stub!"); }
public  void removeGpsData() { throw new RuntimeException("Stub!"); }
public  java.lang.String getWhiteBalance() { throw new RuntimeException("Stub!"); }
public  void setWhiteBalance(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedWhiteBalance() { throw new RuntimeException("Stub!"); }
public  java.lang.String getColorEffect() { throw new RuntimeException("Stub!"); }
public  void setColorEffect(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedColorEffects() { throw new RuntimeException("Stub!"); }
public  java.lang.String getTouchAfAec() { throw new RuntimeException("Stub!"); }
public  void setTouchAfAec(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedTouchAfAec() { throw new RuntimeException("Stub!"); }
public  void setTouchIndexAec(int x, int y) { throw new RuntimeException("Stub!"); }
public  android.hardware.Camera.Coordinate getTouchIndexAec() { throw new RuntimeException("Stub!"); }
public  void setTouchIndexAf(int x, int y) { throw new RuntimeException("Stub!"); }
public  android.hardware.Camera.Coordinate getTouchIndexAf() { throw new RuntimeException("Stub!"); }
public  int getSharpness() { throw new RuntimeException("Stub!"); }
public  void setSharpness(int sharpness) { throw new RuntimeException("Stub!"); }
public  int getMaxSharpness() { throw new RuntimeException("Stub!"); }
public  int getDefaultSharpness() { throw new RuntimeException("Stub!"); }
public  int getContrast() { throw new RuntimeException("Stub!"); }
public  void setContrast(int contrast) { throw new RuntimeException("Stub!"); }
public  int getMaxContrast() { throw new RuntimeException("Stub!"); }
public  int getDefaultContrast() { throw new RuntimeException("Stub!"); }
public  int getSaturation() { throw new RuntimeException("Stub!"); }
public  void setSaturation(int saturation) { throw new RuntimeException("Stub!"); }
public  int getMaxSaturation() { throw new RuntimeException("Stub!"); }
public  int getDefaultSaturation() { throw new RuntimeException("Stub!"); }
public  int getBrightness() { throw new RuntimeException("Stub!"); }
public  void setBrightness(int brightness) { throw new RuntimeException("Stub!"); }
public  int getMaxBrightness() { throw new RuntimeException("Stub!"); }
public  int getDefaultBrightness() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAntibanding() { throw new RuntimeException("Stub!"); }
public  void setAntibanding(java.lang.String antibanding) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedAntibanding() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPreviewFrameRateMode() { throw new RuntimeException("Stub!"); }
public  void setPreviewFrameRateMode(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedPreviewFrameRateModes() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSceneMode() { throw new RuntimeException("Stub!"); }
public  void setSceneMode(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedSceneModes() { throw new RuntimeException("Stub!"); }
public  java.lang.String getFlashMode() { throw new RuntimeException("Stub!"); }
public  void setFlashMode(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedFlashModes() { throw new RuntimeException("Stub!"); }
public  java.lang.String getFocusMode() { throw new RuntimeException("Stub!"); }
public  void setFocusMode(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedFocusModes() { throw new RuntimeException("Stub!"); }
public  float getFocalLength() { throw new RuntimeException("Stub!"); }
public  float getHorizontalViewAngle() { throw new RuntimeException("Stub!"); }
public  float getVerticalViewAngle() { throw new RuntimeException("Stub!"); }
public  int getExposureCompensation() { throw new RuntimeException("Stub!"); }
public  void setExposureCompensation(int value) { throw new RuntimeException("Stub!"); }
public  int getMaxExposureCompensation() { throw new RuntimeException("Stub!"); }
public  int getMinExposureCompensation() { throw new RuntimeException("Stub!"); }
public  float getExposureCompensationStep() { throw new RuntimeException("Stub!"); }
public  int getZoom() { throw new RuntimeException("Stub!"); }
public  void setZoom(int value) { throw new RuntimeException("Stub!"); }
public  boolean isZoomSupported() { throw new RuntimeException("Stub!"); }
public  int getMaxZoom() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.Integer> getZoomRatios() { throw new RuntimeException("Stub!"); }
public  boolean isSmoothZoomSupported() { throw new RuntimeException("Stub!"); }
public  void getFocusDistances(float[] output) { throw new RuntimeException("Stub!"); }
public  java.lang.String getContinuousAf() { throw new RuntimeException("Stub!"); }
public  void setContinuousAf(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedContinuousAfModes() { throw new RuntimeException("Stub!"); }
public  java.lang.String getISOValue() { throw new RuntimeException("Stub!"); }
public  void setISOValue(java.lang.String iso) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedIsoValues() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLensShade() { throw new RuntimeException("Stub!"); }
public  void setLensShade(java.lang.String lensshade) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedLensShadeModes() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAutoExposure() { throw new RuntimeException("Stub!"); }
public  void setAutoExposure(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getSupportedAutoexposure() { throw new RuntimeException("Stub!"); }
public  void setSmartContrastEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isSmartContrastEnabled() { throw new RuntimeException("Stub!"); }
public static final java.lang.String WHITE_BALANCE_AUTO = "auto";
public static final java.lang.String WHITE_BALANCE_INCANDESCENT = "incandescent";
public static final java.lang.String WHITE_BALANCE_FLUORESCENT = "fluorescent";
public static final java.lang.String WHITE_BALANCE_WARM_FLUORESCENT = "warm-fluorescent";
public static final java.lang.String WHITE_BALANCE_DAYLIGHT = "daylight";
public static final java.lang.String WHITE_BALANCE_CLOUDY_DAYLIGHT = "cloudy-daylight";
public static final java.lang.String WHITE_BALANCE_TWILIGHT = "twilight";
public static final java.lang.String WHITE_BALANCE_SHADE = "shade";
public static final java.lang.String EFFECT_NONE = "none";
public static final java.lang.String EFFECT_MONO = "mono";
public static final java.lang.String EFFECT_NEGATIVE = "negative";
public static final java.lang.String EFFECT_SOLARIZE = "solarize";
public static final java.lang.String EFFECT_SEPIA = "sepia";
public static final java.lang.String EFFECT_POSTERIZE = "posterize";
public static final java.lang.String EFFECT_WHITEBOARD = "whiteboard";
public static final java.lang.String EFFECT_BLACKBOARD = "blackboard";
public static final java.lang.String EFFECT_AQUA = "aqua";
public static final java.lang.String TOUCH_AF_AEC_OFF = "touch-off";
public static final java.lang.String TOUCH_AF_AEC_ON = "touch-on";
public static final java.lang.String AUTO_EXPOSURE_FRAME_AVG = "meter-average";
public static final java.lang.String AUTO_EXPOSURE_CENTER_WEIGHTED = "meter-center";
public static final java.lang.String AUTO_EXPOSURE_SPOT_METERING = "meter-spot";
public static final java.lang.String ANTIBANDING_AUTO = "auto";
public static final java.lang.String ANTIBANDING_50HZ = "50hz";
public static final java.lang.String ANTIBANDING_60HZ = "60hz";
public static final java.lang.String ANTIBANDING_OFF = "off";
public static final java.lang.String ISO_AUTO = "auto";
public static final java.lang.String ISO_HJR = "deblur";
public static final java.lang.String ISO_100 = "100";
public static final java.lang.String ISO_200 = "200";
public static final java.lang.String ISO_400 = "400";
public static final java.lang.String ISO_800 = "800";
public static final java.lang.String ISO_1250 = "1250";
public static final java.lang.String LENSSHADE_ENABLE = "enable";
public static final java.lang.String LENSSHADE_DISABLE = "disable";
public static final java.lang.String FLASH_MODE_OFF = "off";
public static final java.lang.String FLASH_MODE_AUTO = "auto";
public static final java.lang.String FLASH_MODE_ON = "on";
public static final java.lang.String FLASH_MODE_RED_EYE = "red-eye";
public static final java.lang.String FLASH_MODE_TORCH = "torch";
public static final java.lang.String SCENE_MODE_AUTO = "auto";
public static final java.lang.String SCENE_MODE_ACTION = "action";
public static final java.lang.String SCENE_MODE_PORTRAIT = "portrait";
public static final java.lang.String SCENE_MODE_LANDSCAPE = "landscape";
public static final java.lang.String SCENE_MODE_NIGHT = "night";
public static final java.lang.String SCENE_MODE_NIGHT_PORTRAIT = "night-portrait";
public static final java.lang.String SCENE_MODE_THEATRE = "theatre";
public static final java.lang.String SCENE_MODE_BEACH = "beach";
public static final java.lang.String SCENE_MODE_SNOW = "snow";
public static final java.lang.String SCENE_MODE_SUNSET = "sunset";
public static final java.lang.String SCENE_MODE_STEADYPHOTO = "steadyphoto";
public static final java.lang.String SCENE_MODE_FIREWORKS = "fireworks";
public static final java.lang.String SCENE_MODE_SPORTS = "sports";
public static final java.lang.String SCENE_MODE_PARTY = "party";
public static final java.lang.String SCENE_MODE_CANDLELIGHT = "candlelight";
public static final java.lang.String SCENE_MODE_BARCODE = "barcode";
public static final java.lang.String FOCUS_MODE_AUTO = "auto";
public static final java.lang.String FOCUS_MODE_INFINITY = "infinity";
public static final java.lang.String FOCUS_MODE_MACRO = "macro";
public static final java.lang.String FOCUS_MODE_FIXED = "fixed";
public static final java.lang.String FOCUS_MODE_EDOF = "edof";
public static final java.lang.String FOCUS_MODE_CONTINUOUS_VIDEO = "continuous-video";
public static final int FOCUS_DISTANCE_NEAR_INDEX = 0;
public static final int FOCUS_DISTANCE_OPTIMAL_INDEX = 1;
public static final int FOCUS_DISTANCE_FAR_INDEX = 2;
public static final int PREVIEW_FPS_MIN_INDEX = 0;
public static final int PREVIEW_FPS_MAX_INDEX = 1;
public static final java.lang.String CAF_OFF = "caf-off";
public static final java.lang.String CAF_ON = "caf-on";
}
Camera() { throw new RuntimeException("Stub!"); }
public static native  int getNumberOfCameras();
public static native  void getCameraInfo(int cameraId, android.hardware.Camera.CameraInfo cameraInfo);
public static  android.hardware.Camera open(int cameraId) { throw new RuntimeException("Stub!"); }
public static  android.hardware.Camera open() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public final  void release() { throw new RuntimeException("Stub!"); }
public final native  void unlock();
public final native  void lock();
public final native  void reconnect() throws java.io.IOException;
public final  void setPreviewDisplay(android.view.SurfaceHolder holder) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final native  void startPreview();
public final native  void stopPreview();
public final  void setPreviewCallback(android.hardware.Camera.PreviewCallback cb) { throw new RuntimeException("Stub!"); }
public final  void setOneShotPreviewCallback(android.hardware.Camera.PreviewCallback cb) { throw new RuntimeException("Stub!"); }
public final  void setPreviewCallbackWithBuffer(android.hardware.Camera.PreviewCallback cb) { throw new RuntimeException("Stub!"); }
public final native  void addCallbackBuffer(byte[] callbackBuffer);
public final  void autoFocus(android.hardware.Camera.AutoFocusCallback cb) { throw new RuntimeException("Stub!"); }
public final  void cancelAutoFocus() { throw new RuntimeException("Stub!"); }
public final  void takePicture(android.hardware.Camera.ShutterCallback shutter, android.hardware.Camera.PictureCallback raw, android.hardware.Camera.PictureCallback jpeg) { throw new RuntimeException("Stub!"); }
public final  void takePicture(android.hardware.Camera.ShutterCallback shutter, android.hardware.Camera.PictureCallback raw, android.hardware.Camera.PictureCallback postview, android.hardware.Camera.PictureCallback jpeg) { throw new RuntimeException("Stub!"); }
public final native  void startSmoothZoom(int value);
public final native  void stopSmoothZoom();
public final native  void setDisplayOrientation(int degrees);
public final  void setZoomChangeListener(android.hardware.Camera.OnZoomChangeListener listener) { throw new RuntimeException("Stub!"); }
public final  void setErrorCallback(android.hardware.Camera.ErrorCallback cb) { throw new RuntimeException("Stub!"); }
public  void setParameters(android.hardware.Camera.Parameters params) { throw new RuntimeException("Stub!"); }
public  android.hardware.Camera.Parameters getParameters() { throw new RuntimeException("Stub!"); }
public static final int CAMERA_ERROR_UNKNOWN = 1;
public static final int CAMERA_ERROR_SERVER_DIED = 100;
}
