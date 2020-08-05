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
	@XmlElement(name = "API_KEY")	// Ŭ������ ��������� XML�� ��ȯ�Ͽ� ��������� ����ִ� ���� ǥ���� �� ���
	protected String apikey;
	@XmlElement(name = "SITE_CD")
	protected String sitecd;
	@XmlElement(name = "ACCOUNT_NO")
	protected String accountNo;
	@XmlElement(name = "v_TRADE_NO")
	protected String vTradeNo;
}
