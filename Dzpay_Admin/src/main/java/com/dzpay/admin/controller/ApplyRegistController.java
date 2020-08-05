package com.dzpay.admin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzpay.admin.common.service.ApplyRegistService;
import com.dzpay.admin.model.skypg.TblapplyRegist;

@Controller
public class ApplyRegistController {

	private static final Logger logger = LoggerFactory.getLogger(ApplyRegistController.class);

	@Resource(name = "applyRegistService")
	ApplyRegistService applyRegistService;

	// ID 중복성 검사
	@RequestMapping(value = "/dzapi/apply", method = RequestMethod.POST)
	@ResponseBody
	public String applyRegist(TblapplyRegist vo, HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		if (!applyRegistService.applyRegist(vo)) {
			logger.info("실패");
			return "FAIL";
		} else {
			logger.info("성공");
			return "SUCC";
		}
	}
}
