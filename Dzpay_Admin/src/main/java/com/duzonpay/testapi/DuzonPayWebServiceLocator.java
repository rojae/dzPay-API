/**
 * DuzonPayWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.duzonpay.testapi;

public class DuzonPayWebServiceLocator extends org.apache.axis.client.Service implements com.duzonpay.testapi.DuzonPayWebService {

    public DuzonPayWebServiceLocator() {
    }


    public DuzonPayWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DuzonPayWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for APIWebserviceImplPort
    private java.lang.String APIWebserviceImplPort_address = "https://testapi.duzonpay.com:8143/webservice/duzonpay";

    public java.lang.String getAPIWebserviceImplPortAddress() {
        return APIWebserviceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String APIWebserviceImplPortWSDDServiceName = "APIWebserviceImplPort";

    public java.lang.String getAPIWebserviceImplPortWSDDServiceName() {
        return APIWebserviceImplPortWSDDServiceName;
    }

    public void setAPIWebserviceImplPortWSDDServiceName(java.lang.String name) {
        APIWebserviceImplPortWSDDServiceName = name;
    }

    public com.duzonpay.testapi.APIWebservice getAPIWebserviceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(APIWebserviceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAPIWebserviceImplPort(endpoint);
    }

    public com.duzonpay.testapi.APIWebservice getAPIWebserviceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.duzonpay.testapi.DuzonPayWebServiceSoapBindingStub _stub = new com.duzonpay.testapi.DuzonPayWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAPIWebserviceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAPIWebserviceImplPortEndpointAddress(java.lang.String address) {
        APIWebserviceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.duzonpay.testapi.APIWebservice.class.isAssignableFrom(serviceEndpointInterface)) {
                com.duzonpay.testapi.DuzonPayWebServiceSoapBindingStub _stub = new com.duzonpay.testapi.DuzonPayWebServiceSoapBindingStub(new java.net.URL(APIWebserviceImplPort_address), this);
                _stub.setPortName(getAPIWebserviceImplPortWSDDServiceName());
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
        if ("APIWebserviceImplPort".equals(inputPortName)) {
            return getAPIWebserviceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://testapi.duzonpay.com/", "DuzonPayWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://testapi.duzonpay.com/", "APIWebserviceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("APIWebserviceImplPort".equals(portName)) {
            setAPIWebserviceImplPortEndpointAddress(address);
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
