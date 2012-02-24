package org.w3c.dom;
public interface DOMLocator
{
public abstract  int getLineNumber();
public abstract  int getColumnNumber();
public abstract  int getByteOffset();
public abstract  int getUtf16Offset();
public abstract  org.w3c.dom.Node getRelatedNode();
public abstract  java.lang.String getUri();
}
