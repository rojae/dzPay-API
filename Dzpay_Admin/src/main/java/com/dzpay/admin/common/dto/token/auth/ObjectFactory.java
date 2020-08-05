package com.dzpay.admin.common.dto.token.auth;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
	private static final QName _CardBINCheckServiceResponse_QNAME = new QName("http://testapi.duzonpay.com/",
			"CardBINCheckServiceResponse");
	private static final QName _CardBINCheckService_QNAME = new QName("http://testapi.duzonpay.com/",
			"CardBINCheckService");
	private static final QName _VCNTCheckServiceResponse_QNAME = new QName("http://testapi.duzonpay.com/",
			"selectVcntTradeResponse");
	private static final QName _VCNTCheckService_QNAME = new QName("http://testapi.duzonpay.com/",
			"selectVcntTrade");

	public BINCheckServiceResponse createCardBINCheckServiceResponse() {
		return new BINCheckServiceResponse();
	}
	
	public VCNTCheckServiceResponse createSelectVcntTradeResponse(){
		return new VCNTCheckServiceResponse();
	}
	
	public BINCheckService createCardBINCheckService() {
		return new BINCheckService();
	}
	
	public VCNTCheckService createSelectVcntTrade(){
		return new VCNTCheckService();
	}

	public BINCheckResult createCardBINCheckResult() {
		return new BINCheckResult();
	}
	
	public VCNTCheckResult createTblvcntTradeResult(){
		return new VCNTCheckResult();
	}

	public BINCheckModel createCardBINCheckModel() {
		return new BINCheckModel();
	}
	
	public VCNTCheckModel createTblvcntTradeModel(){
		return new VCNTCheckModel();
	}

	@XmlElementDecl(namespace = "http://testapi.duzonpay.com/", name = "CardBINCheckServiceResponse")
	public JAXBElement<BINCheckServiceResponse> createCardBINCheckServiceResponse(
			BINCheckServiceResponse value) {
		return new JAXBElement<BINCheckServiceResponse>(_CardBINCheckServiceResponse_QNAME, BINCheckServiceResponse.class, (Class<?>) null,
				value);
	}

	@XmlElementDecl(namespace = "http://testapi.duzonpay.com/", name = "CardBINCheckService")
	public JAXBElement<BINCheckService> createCardBINCheckService(BINCheckService value) {
		return new JAXBElement<BINCheckService>(_CardBINCheckService_QNAME, BINCheckService.class, (Class<?>) null, value);
	}
	
	@XmlElementDecl(namespace = "http://testapi.duzonpay.com/", name = "selectVcntTradeResponse")
	public JAXBElement<VCNTCheckServiceResponse> createSelectVcntTradeResponse(
			VCNTCheckServiceResponse value) {
		return new JAXBElement<VCNTCheckServiceResponse>(_VCNTCheckServiceResponse_QNAME, VCNTCheckServiceResponse.class, (Class<?>) null,
				value);
	}

	@XmlElementDecl(namespace = "http://testapi.duzonpay.com/", name = "selectVcntTrade")
	public JAXBElement<VCNTCheckService> createSelectVcntTrade(VCNTCheckService value) {
		return new JAXBElement<VCNTCheckService>(_VCNTCheckService_QNAME, VCNTCheckService.class, (Class<?>) null, value);
	}
}