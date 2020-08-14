package com.dzpay.admin.common.service.statis;


import com.dzpay.admin.common.dto.statis.AcntDto;
import com.dzpay.admin.common.dto.statis.CardDto;
import com.dzpay.admin.common.dto.statis.EDIDto;
import com.dzpay.admin.common.dto.statis.MCashDto;
import com.dzpay.admin.common.dto.statis.VcntDto;

public interface DailyStatisService {

	// Card ���� ��� ��Ȳ
	public String getCard_Trade(CardDto vo) throws Exception;

	public String getCard_Meip(CardDto vo) throws Exception;

	public String getCard_ALL(CardDto vo) throws Exception;

	// EDI ���� ��� ��Ȳ
	public String getEDI_Trade(EDIDto vo) throws Exception;

	public String getEDI_Meip(EDIDto vo) throws Exception;

	public String getEDI_ALL(EDIDto vo) throws Exception;

	// Acnt ������ü
	// ���� ��� ��Ȳ
	public String getAcnt_Trade(AcntDto vo) throws Exception;

	public String getAcnt_All(AcntDto vo) throws Exception;

	// vcnt �������
	public String getVcnt_Trade(VcntDto vo) throws Exception;

	public String getVcnt_All(VcntDto vo) throws Exception;

	// Mcash �޴���
	public String getMCash_Trade(MCashDto vo) throws Exception;

	public String getMCash_ALL(MCashDto vo) throws Exception;

	
	
}
