package java.nio.channels;
public interface Channel
  extends java.io.Closeable
{
public abstract  boolean isOpen();
public abstract  void close() throws java.io.IOException;
}
