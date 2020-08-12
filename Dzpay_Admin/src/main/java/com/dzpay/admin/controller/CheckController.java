package com.dzpay.admin.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzpay.admin.common.service.OfficeAdminService;
import com.dzpay.admin.controller.sample.HomeController;
import com.dzpay.admin.model.skypg.TblofficeAdmin;

@Controller
public class CheckController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Resource(name = "officeAdminService")
	OfficeAdminService officeAdminService;
	
	private Object res;		// select result
	private boolean res2;		// insert result
	
	// ID ��ȿ�� ���� 
	@RequestMapping(value = "/dzapi/apply/regist", method = RequestMethod.POST)
	@ResponseBody
	public String checkId(TblofficeAdmin vo) throws Exception {
		logger.info("------- ID CHECK -------");
		logger.info("------- GET ID : " + vo.getAdminId() + " ----");
		
		res = officeAdminService.selectAdmin(vo.getAdminId());
		
		if(res != null) {
			logger.info("���� �̹� ������� ���̵��Դϴ�");
			return "USED ID";
		}
		else {
			logger.info("�ߺ��Ǵ� ���̵� �����ϴ�");
			res2 = officeAdminService.insertAdmin(vo);

			if(res2) {
				logger.info("����", "���ó�� ��");
				return "SUCC ADD";
			}
		
		}
		logger.info("------- END CHECK -------");
		return "FAIL INSERT";
	}
}
