/*
 * written by : rojae
 * description : API 금일 통계 현황 서비스
 */
package com.dzpay.admin.controller.sample;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * api 서비스 금일 통계 현황판 결제 수단 별 통계 서비스
 */
@Controller
@RequestMapping("dzapi")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * 샘플 페이지
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "TEST";
	}

	/*
	 * --------------------------------------------------------- 결제 현황 : EDI 수기
	 * ../custom의 경우 모든 파라미터 필요 ../*.do의 경우 불 필요
	 * ---------------------------------------------------------
	 */

}
