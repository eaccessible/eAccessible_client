/**
 * ServeiWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Facade;

public interface ServeiWebService extends javax.xml.rpc.Service {
    public java.lang.String getServeiWebPortAddress();

    public Facade.ServeiWeb getServeiWebPort() throws javax.xml.rpc.ServiceException;

    public Facade.ServeiWeb getServeiWebPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
