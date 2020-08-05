package com.dzpay.admin.common.token.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.dzpay.admin.common.dto.token.auth.BINCheckModel;
import com.dzpay.admin.common.dto.token.auth.BINCheckResult;
import com.dzpay.admin.common.dto.token.auth.ObjectFactory;
import com.dzpay.admin.common.dto.token.auth.VCNTCheckModel;
import com.dzpay.admin.common.dto.token.auth.VCNTCheckResult;

@WebService(targetNamespace = "http://testapi.duzonpay.com/", name = "APIWebservice")
@XmlSeeAlso({ObjectFactory.class})
public interface APIWebservice {
	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "CardBINCheckService", targetNamespace = "http://testapi.duzonpay.com/", className = "com.duzonpay.testapi.CardBINCheckService")
	@WebMethod(operationName = "CardBINCheckService")
	@ResponseWrapper(localName = "CardBINCheckServiceResponse", targetNamespace = "http://testapi.duzonpay.com/", className = "com.duzonpay.testapi.CardBINCheckServiceResponse")
	BINCheckResult BINCheckService(@WebParam(name = "arg0", targetNamespace = "") BINCheckModel var1);
	
	
	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "selectVcntTrade", targetNamespace = "http://testapi.duzonpay.com/", className = "com.duzonpay.testapi.selectVcntTrade")
	@WebMethod(operationName = "selectVcntTrade")
	@ResponseWrapper(localName = "selectVcntTradeResponse", targetNamespace = "http://testapi.duzonpay.com/", className = "com.duzonpay.testapi.selectVcntTradeResponse")
	VCNTCheckResult VCNTCheckService(@WebParam(name = "arg0", targetNamespace = "") VCNTCheckModel var1);
}
