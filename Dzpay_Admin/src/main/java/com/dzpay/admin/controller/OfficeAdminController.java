package com.dzpay.admin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzpay.admin.common.service.OfficeAdminService;
import com.dzpay.admin.model.skypg.TblofficeAdmin;

@Controller
public class OfficeAdminController {

	private static final Logger logger = LoggerFactory.getLogger(OfficeAdminController.class);

	@Resource(name = "officeAdminService")
	OfficeAdminService officeAdminService;

	@RequestMapping(value = "/dzapi/office/admin", method = RequestMethod.GET)
	@ResponseBody
	public String selectAdmin(@RequestParam String adminId, HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		TblofficeAdmin res = officeAdminService.selectAdmin(adminId);
		if (res == null) {
			logger.info("존재하지 않는 아이디입니다.");
			return "FAIL";
		} else {
			logger.info("존재하는 아이디입니다.");
			return "SUCC";
		}
	}

	@RequestMapping(value = "/dzapi/office/admin", method = RequestMethod.POST)
	@ResponseBody
	public String insertAdmin(TblofficeAdmin vo, HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		TblofficeAdmin res = officeAdminService.selectAdmin(vo.getAdminId());
		if (res != null) {
			logger.info("이미 존재하는 아이디입니다.");
			return "USED ID";
		} 
		// 계정 추가 
		else {
			boolean res2 = officeAdminService.insertAdmin(vo);
			if (res2) {
				logger.info("관리자 계정 생성 성공");
				return "SUCC";
			} else {
				logger.info("계정 생성 실패");
				return "FAIL";
			}
		}
	}
}
