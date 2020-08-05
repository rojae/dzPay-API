package com.duzonpay.testapi;

public class APIWebserviceProxy implements com.duzonpay.testapi.APIWebservice {
  private String _endpoint = null;
  private com.duzonpay.testapi.APIWebservice aPIWebservice = null;
  
  public APIWebserviceProxy() {
    _initAPIWebserviceProxy();
  }
  
  public APIWebserviceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAPIWebserviceProxy();
  }
  
  private void _initAPIWebserviceProxy() {
    try {
      aPIWebservice = (new com.duzonpay.testapi.DuzonPayWebServiceLocator()).getAPIWebserviceImplPort();
      if (aPIWebservice != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aPIWebservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aPIWebservice)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aPIWebservice != null)
      ((javax.xml.rpc.Stub)aPIWebservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.duzonpay.testapi.APIWebservice getAPIWebservice() {
    if (aPIWebservice == null)
      _initAPIWebserviceProxy();
    return aPIWebservice;
  }
  
  public com.duzonpay.testapi.AcmsServiceResult acmsService(com.duzonpay.testapi.AcmsServiceModel arg0) throws java.rmi.RemoteException{
    if (aPIWebservice == null)
      _initAPIWebserviceProxy();
    return aPIWebservice.acmsService(arg0);
  }
  
  public com.duzonpay.testapi.CardBINCheckResult cardBINCheckService(com.duzonpay.testapi.CardBINCheckModel arg0) throws java.rmi.RemoteException{
    if (aPIWebservice == null)
      _initAPIWebserviceProxy();
    return aPIWebservice.cardBINCheckService(arg0);
  }
  
  public com.duzonpay.testapi.TblvcntTradeResult selectVcntTrade(com.duzonpay.testapi.TblvcntTradeModel arg0) throws java.rmi.RemoteException{
    if (aPIWebservice == null)
      _initAPIWebserviceProxy();
    return aPIWebservice.selectVcntTrade(arg0);
  }
  
  public com.duzonpay.testapi.ApplyIdcheckResult idcheckService(com.duzonpay.testapi.ApplyIdcheckModel arg0) throws java.rmi.RemoteException{
    if (aPIWebservice == null)
      _initAPIWebserviceProxy();
    return aPIWebservice.idcheckService(arg0);
  }
  
  public com.duzonpay.testapi.SubscribeResult subscribeService(com.duzonpay.testapi.SubscribeModel arg0) throws java.rmi.RemoteException{
    if (aPIWebservice == null)
      _initAPIWebserviceProxy();
    return aPIWebservice.subscribeService(arg0);
  }
  
  
}