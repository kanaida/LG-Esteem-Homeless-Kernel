package org.w3c.dom;
public interface DocumentType
  extends org.w3c.dom.Node
{
public abstract  java.lang.String getName();
public abstract  org.w3c.dom.NamedNodeMap getEntities();
public abstract  org.w3c.dom.NamedNodeMap getNotations();
public abstract  java.lang.String getPublicId();
public abstract  java.lang.String getSystemId();
public abstract  java.lang.String getInternalSubset();
}
