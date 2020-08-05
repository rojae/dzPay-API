package com.dzpay.admin.common.dto.token.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tblvcntTradeModel", propOrder = {"apikey","sitecd","accountNo", "vTradeNo"})
public class VCNTCheckModel {
	@XmlElement(name = "API_KEY")	// 클래스의 멤버변수를 XML로 변환하여 멤버변수에 들어있는 값을 표현할 때 사용
	protected String apikey;
	@XmlElement(name = "SITE_CD")
	protected String sitecd;
	@XmlElement(name = "ACCOUNT_NO")
	protected String accountNo;
	@XmlElement(name = "v_TRADE_NO")
	protected String vTradeNo;
}
