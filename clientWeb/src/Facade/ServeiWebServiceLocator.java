/**
 * ServeiWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Facade;

public class ServeiWebServiceLocator extends org.apache.axis.client.Service implements Facade.ServeiWebService {

    public ServeiWebServiceLocator() {
    }


    public ServeiWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServeiWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServeiWebPort
    private java.lang.String ServeiWebPort_address = "http://localhost:8080/serverWeb/ServeiWeb";

    public java.lang.String getServeiWebPortAddress() {
        return ServeiWebPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServeiWebPortWSDDServiceName = "ServeiWebPort";

    public java.lang.String getServeiWebPortWSDDServiceName() {
        return ServeiWebPortWSDDServiceName;
    }

    public void setServeiWebPortWSDDServiceName(java.lang.String name) {
        ServeiWebPortWSDDServiceName = name;
    }

    public Facade.ServeiWeb getServeiWebPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServeiWebPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServeiWebPort(endpoint);
    }

    public Facade.ServeiWeb getServeiWebPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Facade.ServeiWebServiceSoapBindingStub _stub = new Facade.ServeiWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getServeiWebPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServeiWebPortEndpointAddress(java.lang.String address) {
        ServeiWebPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Facade.ServeiWeb.class.isAssignableFrom(serviceEndpointInterface)) {
                Facade.ServeiWebServiceSoapBindingStub _stub = new Facade.ServeiWebServiceSoapBindingStub(new java.net.URL(ServeiWebPort_address), this);
                _stub.setPortName(getServeiWebPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServeiWebPort".equals(inputPortName)) {
            return getServeiWebPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Facade/", "ServeiWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Facade/", "ServeiWebPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServeiWebPort".equals(portName)) {
            setServeiWebPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
