package com.dzpay.admin.common.dto.token.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectVcntTradeResponse2", propOrder = {"_return"})
public class VCNTCheckServiceResponse {
	@XmlElement(name = "return")
	protected VCNTCheckResult _return;
	
	public VCNTCheckResult getReturn(){
		return this._return;
	}
	
	public void setReturn(VCNTCheckResult value){
		this._return = value;
	}
}
