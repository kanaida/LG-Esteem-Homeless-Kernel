package java.sql;
public interface SQLInput
{
public abstract  java.lang.String readString() throws java.sql.SQLException;
public abstract  boolean readBoolean() throws java.sql.SQLException;
public abstract  byte readByte() throws java.sql.SQLException;
public abstract  short readShort() throws java.sql.SQLException;
public abstract  int readInt() throws java.sql.SQLException;
public abstract  long readLong() throws java.sql.SQLException;
public abstract  float readFloat() throws java.sql.SQLException;
public abstract  double readDouble() throws java.sql.SQLException;
public abstract  java.math.BigDecimal readBigDecimal() throws java.sql.SQLException;
public abstract  byte[] readBytes() throws java.sql.SQLException;
public abstract  java.sql.Date readDate() throws java.sql.SQLException;
public abstract  java.sql.Time readTime() throws java.sql.SQLException;
public abstract  java.sql.Timestamp readTimestamp() throws java.sql.SQLException;
public abstract  java.io.Reader readCharacterStream() throws java.sql.SQLException;
public abstract  java.io.InputStream readAsciiStream() throws java.sql.SQLException;
public abstract  java.io.InputStream readBinaryStream() throws java.sql.SQLException;
public abstract  java.lang.Object readObject() throws java.sql.SQLException;
public abstract  java.sql.Ref readRef() throws java.sql.SQLException;
public abstract  java.sql.Blob readBlob() throws java.sql.SQLException;
public abstract  java.sql.Clob readClob() throws java.sql.SQLException;
public abstract  java.sql.Array readArray() throws java.sql.SQLException;
public abstract  boolean wasNull() throws java.sql.SQLException;
public abstract  java.net.URL readURL() throws java.sql.SQLException;
public abstract  java.sql.NClob readNClob() throws java.sql.SQLException;
public abstract  java.lang.String readNString() throws java.sql.SQLException;
public abstract  java.sql.SQLXML readSQLXML() throws java.sql.SQLException;
public abstract  java.sql.RowId readRowId() throws java.sql.SQLException;
}
