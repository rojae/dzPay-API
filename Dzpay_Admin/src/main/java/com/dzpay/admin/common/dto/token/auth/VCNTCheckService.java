package com.dzpay.admin.common.dto.token.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectVcntTrade2", propOrder = {"arg0"})
public class VCNTCheckService {
	protected VCNTCheckModel arg0;
	
	public VCNTCheckModel getArg0(){
		return this.arg0;
	}
	
	public void setArg0(VCNTCheckModel value){
		this.arg0 = value;
	}

}
