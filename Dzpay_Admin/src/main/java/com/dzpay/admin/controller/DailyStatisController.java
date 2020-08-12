package com.dzpay.admin.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzpay.admin.common.dto.statis.CardDto;
import com.dzpay.admin.common.dto.statis.EDIDto;
import com.dzpay.admin.common.service.statis.DailyStatisService;

@Controller
public class DailyStatisController {
	private static final Logger logger = LoggerFactory.getLogger(OfficeAdminController.class);

	@Resource(name = "dailyStatisService")
	DailyStatisService dailyStatisService;

	// result.get(0) = 금일 결제 건수
	// result.get(1) = 금일 취소 건수

	// result.get(1) = 건수, 금일 취소 금액,
	// result.get(1) = 금월 결제 금액[건수], 취소 금액[건수]
	ArrayList<Map<String, Object>> result = new ArrayList<Map<String, Object>>();

	// 신용카드 승인
	@RequestMapping(value = "/dzapi/statis/daily/card", method = RequestMethod.GET)
	public @ResponseBody String card_trade(CardDto vo) throws Exception {
		logger.info("--------------- Daily Statistics CARD ------------------");

		String res = "";
		
		if(vo.getRtn_sts().equals("dm") || vo.getRtn_sts().equals("dmc")) {
			res = dailyStatisService.getCard_Meip(vo);
		}else {
			res = dailyStatisService.getCard_Trade(vo);
		}

		// 데이터를 가공해서 내보내자
		System.out.println(res.toString());

		logger.info("---------- " + res.toString() + "-------------");
		return res;
	}
	
	// 신용카드 승인
	@RequestMapping(value = "/dzapi/statis/daily-all/card", method = RequestMethod.GET)
	public @ResponseBody String card_all(CardDto vo) throws Exception {
		logger.info("--------------- Daily Statistics CARD ------------------");

		String res = dailyStatisService.getCard_ALL(vo);

		// 데이터를 가공해서 내보내자
		System.out.println(res.toString());

		logger.info("---------- " + res.toString() + "-------------");
		return res;
	}
	
	// 금일 edi 통계 단일 조회
	@RequestMapping(value = "/dzapi/statis/daily/edi", method = RequestMethod.GET)
	public @ResponseBody String edi_trade(EDIDto vo) throws Exception {
		logger.info("--------------- Daily Statistics EDI  ------------------");

		String res = "";

		if (vo.getRtn_sts().equals("dm") || vo.getRtn_sts().equals("dmc"))
			res = dailyStatisService.getEDI_Meip(vo);
		else
			res = dailyStatisService.getEDI_Trade(vo);

		// 데이터를 가공해서 내보내자
		System.out.println(res.toString());

		logger.info("---------- " + res.toString() + "-------------");
		return res;
	}

	// 금일 edi 통계 모든 조회
	@RequestMapping(value = "/dzapi/statis/daily-all/edi", method = RequestMethod.GET)
	public @ResponseBody String edi_all(EDIDto vo) throws Exception {
		logger.info("--------------- Daily Statistics EDI All------------------");

		String res = dailyStatisService.getEDI_ALL(vo);

		// 데이터를 가공해서 내보내자
		System.out.println(res.toString());

		logger.info("---------- " + res.toString() + "-------------");
		return res;
	}


}
// 승인취소 일

// 승인취소 월

// 금월 매입건

// 금일 매입취소건
