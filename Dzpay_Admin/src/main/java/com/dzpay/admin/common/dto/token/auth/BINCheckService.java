package com.dzpay.admin.common.dto.token.auth;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardBINCheckService2", propOrder = {"arg0"})
public class BINCheckService {
	protected BINCheckModel arg0;

	public BINCheckModel getArg0() {
		return this.arg0;
	}

	public void setArg0(BINCheckModel value) {
		this.arg0 = value;
	}
}