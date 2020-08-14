package com.dzpay.admin.common.service.statis;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dzpay.admin.common.dao.statis.DailyStatisDAO;
import com.dzpay.admin.common.dto.statis.AcntDto;
import com.dzpay.admin.common.dto.statis.CardDto;
import com.dzpay.admin.common.dto.statis.EDIDto;
import com.dzpay.admin.common.dto.statis.MCashDto;
import com.dzpay.admin.common.dto.statis.VcntDto;
import com.dzpay.admin.common.utils.ClientUtils;

@Service("dailyStatisService")
public class DailyStatisServiceImpl implements DailyStatisService {

	@Resource(name = "dailyStatisDao")
	private DailyStatisDAO dailyStatisDao;

	@Override
	public String getCard_Trade(CardDto vo) throws Exception {
		vo.convertColumn(vo.getRtn_sts());

		List<Map<String, Object>> list = dailyStatisDao.getDailyCard_Trade(vo);

		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getCard_Meip(CardDto vo) throws Exception {
		vo.convertColumn(vo.getRtn_sts());

		List<Map<String, Object>> list = dailyStatisDao.getDailyCard_Meip(vo);

		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getCard_ALL(CardDto vo) throws Exception {

		// 승인 일
		vo.setRtn_sts("dp");
		vo.convertColumn(vo.getRtn_sts());
		List<Map<String, Object>> list = dailyStatisDao.getDailyCard_Trade(vo);

		// 승인 취소 일
		vo.setRtn_sts("dc");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyCard_Trade(vo));

		// 금월 매입건
		vo.setRtn_sts("dm");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyCard_Meip(vo));

		// 금일 매입 취소 건
		vo.setRtn_sts("dmc");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyCard_Meip(vo));

		// 승인 월
		vo.setRtn_sts("mp");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyCard_Trade(vo));

		// 승인 취소 월
		vo.setRtn_sts("mc");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyCard_Trade(vo));

		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getEDI_Trade(EDIDto vo) throws Exception {
		vo.convertColumn(vo.getRtn_sts());

		List<Map<String, Object>> list = dailyStatisDao.getDailyEDI_Trade(vo);
		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getEDI_Meip(EDIDto vo) throws Exception {
		vo.convertColumn(vo.getRtn_sts());

		List<Map<String, Object>> list = dailyStatisDao.getDailyEDI_Meip(vo);

		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getEDI_ALL(EDIDto vo) throws Exception {
		// 승인 일
		vo.setRtn_sts("dp");
		vo.convertColumn(vo.getRtn_sts());
		List<Map<String, Object>> list = dailyStatisDao.getDailyEDI_Trade(vo);

		// 승인 취소 일
		vo.setRtn_sts("dc");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyEDI_Trade(vo));

		// 금월 매입건
		vo.setRtn_sts("dm");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyEDI_Meip(vo));

		// 금일 매입 취소 건
		vo.setRtn_sts("dmc");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyEDI_Meip(vo));

		// 승인 월
		vo.setRtn_sts("mp");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyEDI_Trade(vo));

		// 승인 취소 월
		vo.setRtn_sts("mc");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyEDI_Trade(vo));

		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getAcnt_Trade(AcntDto vo) throws Exception {
		vo.convertColumn(vo.getRtn_sts());

		List<Map<String, Object>> list = dailyStatisDao.getDailyAcnt_Trade(vo);

		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getAcnt_All(AcntDto vo) throws Exception {

		// 승인 일
		vo.setRtn_sts("dp");
		vo.convertColumn(vo.getRtn_sts());
		List<Map<String, Object>> list = dailyStatisDao.getDailyAcnt_Trade(vo);

		// 승인 취소 일
		vo.setRtn_sts("dc");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyAcnt_Trade(vo));

		// 승인 월
		vo.setRtn_sts("mp");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyAcnt_Trade(vo));

		// 승인 취소 월
		vo.setRtn_sts("mc");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyAcnt_Trade(vo));

		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getVcnt_Trade(VcntDto vo) throws Exception {
		vo.convertColumn(vo.getRtn_sts());

		List<Map<String, Object>> list = dailyStatisDao.getDailyVcnt_Trade(vo);

		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getVcnt_All(VcntDto vo) throws Exception {
		// 승인 일
		vo.setRtn_sts("dp");
		vo.convertColumn(vo.getRtn_sts());
		List<Map<String, Object>> list = dailyStatisDao.getDailyVcnt_Trade(vo);

		// 승인 취소 일
		vo.setRtn_sts("dc");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyVcnt_Trade(vo));

		// 승인 월
		vo.setRtn_sts("mp");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyVcnt_Trade(vo));

		// 승인 취소 월
		vo.setRtn_sts("mc");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyVcnt_Trade(vo));

		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getMCash_Trade(MCashDto vo) throws Exception {
		vo.convertColumn(vo.getRtn_sts());

		List<Map<String, Object>> list = dailyStatisDao.getDailyMCash_Trade(vo);

		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getMCash_ALL(MCashDto vo) throws Exception {
		// 승인 일
		vo.setRtn_sts("dp");
		vo.convertColumn(vo.getRtn_sts());
		List<Map<String, Object>> list = dailyStatisDao.getDailyMCash_Trade(vo);

		// 승인 취소 일
		vo.setRtn_sts("dc");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyMCash_Trade(vo));

		// 승인 월
		vo.setRtn_sts("mp");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyMCash_Trade(vo));

		// 승인 취소 월
		vo.setRtn_sts("mc");
		vo.convertColumn(vo.getRtn_sts());
		list.addAll(dailyStatisDao.getDailyMCash_Trade(vo));

		return ClientUtils.convertJsonObject(list);
	}
}
