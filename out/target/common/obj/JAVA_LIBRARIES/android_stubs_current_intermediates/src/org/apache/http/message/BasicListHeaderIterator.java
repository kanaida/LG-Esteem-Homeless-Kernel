package org.apache.http.message;
public class BasicListHeaderIterator
  implements org.apache.http.HeaderIterator
{
public  BasicListHeaderIterator(java.util.List headers, java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  int findNext(int from) { throw new RuntimeException("Stub!"); }
protected  boolean filterHeader(int index) { throw new RuntimeException("Stub!"); }
public  boolean hasNext() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header nextHeader() throws java.util.NoSuchElementException { throw new RuntimeException("Stub!"); }
public final  java.lang.Object next() throws java.util.NoSuchElementException { throw new RuntimeException("Stub!"); }
public  void remove() throws java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
protected final java.util.List allHeaders;
protected int currentIndex;
protected int lastIndex;
protected java.lang.String headerName;
}
