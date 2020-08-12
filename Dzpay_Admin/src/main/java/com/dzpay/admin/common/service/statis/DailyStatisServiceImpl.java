package com.dzpay.admin.common.service.statis;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dzpay.admin.common.dao.statis.DailyStatisDAO;
import com.dzpay.admin.common.dto.statis.CardDto;
import com.dzpay.admin.common.dto.statis.EDIDto;
import com.dzpay.admin.common.service.ApplyRegistService;
import com.dzpay.admin.common.utils.ClientUtils;


@Service("dailyStatisService")
public class DailyStatisServiceImpl implements DailyStatisService {
	private static final Logger logger = LoggerFactory.getLogger(ApplyRegistService.class);

	@Resource(name = "dailyStatisDao")
	private DailyStatisDAO dailyStatisDao;

	@Override
	public String getCard_Trade(CardDto vo) throws Exception{
		logger.info("Daily Card Trade statistics : " + vo.toString());
		vo.convertColumn(vo.getRtn_sts());
		
		List<Map<String, Object>> list = dailyStatisDao.getDailyCard_Trade(vo);
		
		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getCard_Meip(CardDto vo) throws Exception{
		logger.info("Daily Card Meip statistics : " + vo.toString());
		vo.convertColumn(vo.getRtn_sts());
	
		List<Map<String, Object>> list = dailyStatisDao.getDailyCard_Meip(vo);
		
		return ClientUtils.convertJsonObject(list);
	}
	

	@Override
	public String getCard_ALL(CardDto vo) throws Exception {
		logger.info("Daily EDI statistics ALL DATA : " + vo.toString());
		
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
		logger.info("Daily EDI Trade statistics  : " + vo.toString());
		vo.convertColumn(vo.getRtn_sts());
		
		List<Map<String, Object>> list = dailyStatisDao.getDailyEDI_Trade(vo);
		return ClientUtils.convertJsonObject(list);
	}

	@Override
	public String getEDI_Meip(EDIDto vo) throws Exception {
		logger.info("Daily EDI Meip statistics  : " + vo.toString());
		vo.convertColumn(vo.getRtn_sts());
		
		List<Map<String, Object>> list = dailyStatisDao.getDailyEDI_Meip(vo);
		
		return ClientUtils.convertJsonObject(list);
	}
	
	@Override
	public String getEDI_ALL(EDIDto vo) throws Exception {
		logger.info("Daily EDI statistics ALL DATA : " + vo.toString());
		
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
}
