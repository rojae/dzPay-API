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
@XmlType(name = "cardBINCheckResult", propOrder = {"apikey", "cardcd", "cardnm", "cardno", "cardonwer", "cardtype",
		"resultcode", "resultmsg", "sitecd"})
public class BINCheckResult {
	@XmlElement(name = "API_KEY")
	protected String apikey;
	@XmlElement(name = "CARD_CD")
	protected String cardcd;
	@XmlElement(name = "CARD_NM")
	protected String cardnm;
	@XmlElement(name = "CARD_NO")
	protected String cardno;
	@XmlElement(name = "CARD_ONWER")
	protected String cardonwer;
	@XmlElement(name = "CARD_TYPE")
	protected String cardtype;
	@XmlElement(name = "RESULT_CODE")
	protected String resultcode;
	@XmlElement(name = "RESULT_MSG")
	protected String resultmsg;
	@XmlElement(name = "SITE_CD")
	protected String sitecd;
}