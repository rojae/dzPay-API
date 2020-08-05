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
@XmlType(name = "tblvcntTradeResult", propOrder={"accountNo", "vTradeNo", "bankCd","tradeMony", "regDt", "expiredDt", "ipkumDate", "corpId", "accountSts", "resultCode", "resultMsg"})
public class VCNTCheckResult {
	@XmlElement(name = "ACCOUNT_NO")
	protected String accountNo;
	@XmlElement(name = "v_TRADE_NO")
	protected String vTradeNo;
	@XmlElement(name = "BANK_CD")
	protected String bankCd;
	@XmlElement(name = "TRADE_MONY")
	protected String tradeMony;
	@XmlElement(name = "REG_DT")
	protected String regDt;
	@XmlElement(name = "EXPIRED_DT")
	protected String expiredDt;
	@XmlElement(name = "IPKUM_DATE")
	protected String ipkumDate;
	@XmlElement(name = "CORP_ID")
	protected String corpId;
	@XmlElement(name = "ACCOUNT_STS")
	protected String accountSts;
	@XmlElement(name = "RESULT_CODE")
	protected String resultCode;
	@XmlElement(name = "RESULT_MSG")
	protected String resultMsg;
}
