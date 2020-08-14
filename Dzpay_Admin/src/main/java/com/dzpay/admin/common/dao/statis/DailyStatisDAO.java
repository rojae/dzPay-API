package com.dzpay.admin.common.dao.statis;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.dzpay.admin.common.dao.AbstractDAO;
import com.dzpay.admin.common.dto.statis.AcntDto;
import com.dzpay.admin.common.dto.statis.CardDto;
import com.dzpay.admin.common.dto.statis.EDIDto;
import com.dzpay.admin.common.dto.statis.MCashDto;
import com.dzpay.admin.common.dto.statis.VcntDto;

@Repository("dailyStatisDao")
public class DailyStatisDAO extends AbstractDAO {

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> getDailyEDI_Trade(EDIDto vo) throws Exception {
		return (List<Map<String, Object>>) selectList("statis_daliy_edi.getEDI_Trade", vo);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> getDailyEDI_Meip(EDIDto vo) throws Exception {
		return (List<Map<String, Object>>) selectList("statis_daliy_edi.getEDI_Meip", vo);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> getDailyCard_Trade(CardDto vo) throws Exception{
		return (List<Map<String, Object>>) selectList("statis_daily_card.getCard_Trade", vo);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> getDailyCard_Meip(CardDto vo) throws Exception{
		return (List<Map<String, Object>>) selectList("statis_daily_card.getCard_Meip", vo);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> getDailyAcnt_Trade(AcntDto vo) throws Exception{
		return (List<Map<String, Object>>) selectList("statis_daily_acnt.getAcnt_Trade", vo);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> getDailyVcnt_Trade(VcntDto vo) throws Exception{
		return (List<Map<String, Object>>) selectList("statis_daily_vcnt.getVcnt_Trade", vo);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> getDailyMCash_Trade(MCashDto vo) throws Exception{
		return (List<Map<String, Object>>) selectList("statis_daily_mcash.getMCash_Trade", vo);
	}
}
