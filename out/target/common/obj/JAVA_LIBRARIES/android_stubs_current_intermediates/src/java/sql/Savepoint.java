package java.sql;
public interface Savepoint
{
public abstract  int getSavepointId() throws java.sql.SQLException;
public abstract  java.lang.String getSavepointName() throws java.sql.SQLException;
}
