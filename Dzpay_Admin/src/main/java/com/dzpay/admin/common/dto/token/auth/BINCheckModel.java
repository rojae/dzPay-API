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
@XmlAccessorType(XmlAccessType.FIELD)		// XML�� ���� ���� ���� (�ʵ�� ��� ����)
@XmlType(name = "cardBINCheckModel", propOrder = {"apikey", "cardno", "sitecd"})	// Ŭ������ XML�� ��ȯ�� �� �� XML�� �̸��� namespace�� ����
public class BINCheckModel {
	@XmlElement(name = "API_KEY")	// Ŭ������ ��������� XML�� ��ȯ�Ͽ� ��������� ����ִ� ���� ǥ���� �� ���
	protected String apikey;
	@XmlElement(name = "CARD_NO")
	protected String cardno;
	@XmlElement(name = "SITE_CD")
	protected String sitecd;
}
