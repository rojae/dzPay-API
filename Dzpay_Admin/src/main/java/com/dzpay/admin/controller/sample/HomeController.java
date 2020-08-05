/*
 * written by : rojae
 * description : API ���� ��� ��Ȳ ����
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
 * api ���� ���� ��� ��Ȳ�� ���� ���� �� ��� ����
 */
@Controller
@RequestMapping("dzapi")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * ���� ������
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
	 * --------------------------------------------------------- ���� ��Ȳ : EDI ����
	 * ../custom�� ��� ��� �Ķ���� �ʿ� ../*.do�� ��� �� �ʿ�
	 * ---------------------------------------------------------
	 */

}