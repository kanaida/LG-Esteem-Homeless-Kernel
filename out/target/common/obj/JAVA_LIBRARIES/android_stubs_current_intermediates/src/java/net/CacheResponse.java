package java.net;
public abstract class CacheResponse
{
public  CacheResponse() { throw new RuntimeException("Stub!"); }
public abstract  java.io.InputStream getBody() throws java.io.IOException;
public abstract  java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() throws java.io.IOException;
}
