package javax.security.auth;
public interface Destroyable
{
public abstract  void destroy() throws javax.security.auth.DestroyFailedException;
public abstract  boolean isDestroyed();
}
