package com.dzpay.admin.common.service.statis;


import com.dzpay.admin.common.dto.statis.CardDto;
import com.dzpay.admin.common.dto.statis.EDIDto;

public interface DailyStatisService {

	// Card 금일 통계 현황
	public String getCard_Trade(CardDto vo) throws Exception;

	public String getCard_Meip(CardDto vo) throws Exception;

	public String getCard_ALL(CardDto vo) throws Exception;

	// EDI 금일 통계 현황
	public String getEDI_Trade(EDIDto vo) throws Exception;

	public String getEDI_Meip(EDIDto vo) throws Exception;

	public String getEDI_ALL(EDIDto vo) throws Exception;




}
