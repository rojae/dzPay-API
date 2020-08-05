package com.dzpay.admin.common.dto.token.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardBINCheckServiceResponse2", propOrder = {"_return"})
public class BINCheckServiceResponse {
	@XmlElement(name = "return")
	protected BINCheckResult _return;

	public BINCheckResult getReturn() {
		return this._return;
	}

	public void setReturn(BINCheckResult value) {
		this._return = value;
	}
}