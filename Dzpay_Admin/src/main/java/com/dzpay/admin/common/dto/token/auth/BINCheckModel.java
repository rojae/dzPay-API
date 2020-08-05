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
@XmlAccessorType(XmlAccessType.FIELD)		// XML로 만들 범위 결정 (필드는 모두 추출)
@XmlType(name = "cardBINCheckModel", propOrder = {"apikey", "cardno", "sitecd"})	// 클래스를 XML로 변환할 때 이 XML의 이름과 namespace를 정의
public class BINCheckModel {
	@XmlElement(name = "API_KEY")	// 클래스의 멤버변수를 XML로 변환하여 멤버변수에 들어있는 값을 표현할 때 사용
	protected String apikey;
	@XmlElement(name = "CARD_NO")
	protected String cardno;
	@XmlElement(name = "SITE_CD")
	protected String sitecd;
}
