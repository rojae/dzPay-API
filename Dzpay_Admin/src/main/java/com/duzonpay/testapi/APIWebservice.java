/**
 * APIWebservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.duzonpay.testapi;

import javax.jws.WebService;

@WebService
public interface APIWebservice extends java.rmi.Remote {
    public com.duzonpay.testapi.AcmsServiceResult acmsService(com.duzonpay.testapi.AcmsServiceModel arg0) throws java.rmi.RemoteException;
    public com.duzonpay.testapi.CardBINCheckResult cardBINCheckService(com.duzonpay.testapi.CardBINCheckModel arg0) throws java.rmi.RemoteException;
    public com.duzonpay.testapi.TblvcntTradeResult selectVcntTrade(com.duzonpay.testapi.TblvcntTradeModel arg0) throws java.rmi.RemoteException;
    public com.duzonpay.testapi.ApplyIdcheckResult idcheckService(com.duzonpay.testapi.ApplyIdcheckModel arg0) throws java.rmi.RemoteException;
    public com.duzonpay.testapi.SubscribeResult subscribeService(com.duzonpay.testapi.SubscribeModel arg0) throws java.rmi.RemoteException;
}
