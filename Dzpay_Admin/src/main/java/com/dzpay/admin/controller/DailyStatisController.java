package com.dzpay.admin.controller;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzpay.admin.common.dto.statis.AcntDto;
import com.dzpay.admin.common.dto.statis.CardDto;
import com.dzpay.admin.common.dto.statis.EDIDto;
import com.dzpay.admin.common.dto.statis.MCashDto;
import com.dzpay.admin.common.dto.statis.VcntDto;
import com.dzpay.admin.common.logger.LoggerCustom;
import com.dzpay.admin.common.service.statis.DailyStatisService;
import com.dzpay.admin.common.utils.ClientUtils;

@Controller
public class DailyStatisController {


	@Resource(name = "dailyStatisService")
	DailyStatisService dailyStatisService;
	
	
	ArrayList<Map<String, Object>> result = new ArrayList<Map<String, Object>>();

	// �ſ�ī�� ����
	@RequestMapping(value = "/dzapi/statis/daily/card", method = RequestMethod.GET)
	public @ResponseBody String card_trade(CardDto vo, HttpServletRequest request) throws Exception {
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("--------------- Daily Statistics CARD ------------------");
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(ClientUtils.getRemoteIP(request));
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("Param : " + ClientUtils.getVOvalue(vo));
		
		String res = "";

		if(vo.getRtn_sts().equals("dm") || vo.getRtn_sts().equals("dmc")) {
			res = dailyStatisService.getCard_Meip(vo);
		}else {
			res = dailyStatisService.getCard_Trade(vo);
		}
		
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(res.toString());

		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("---------------------------------------------------------");
		return res;
	}
	
	// �ſ�ī�� ����
	@RequestMapping(value = "/dzapi/statis/daily-all/card", method = RequestMethod.GET)
	public @ResponseBody String card_all(CardDto vo, HttpServletRequest request) throws Exception {
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("--------------- Daily Statistics CARD ALL ------------------");
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(ClientUtils.getRemoteIP(request));
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("Param : " + ClientUtils.getVOvalue(vo));
		
		String res = dailyStatisService.getCard_ALL(vo);

		// �����͸� �����ؼ� ��������
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(res.toString());

		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("---------------------------------------------------------");
		return res;
	}
	
	// ���� edi ��� 
	// ���� ��ȸ
	@RequestMapping(value = "/dzapi/statis/daily/edi", method = RequestMethod.GET)
	public @ResponseBody String edi_trade(EDIDto vo, HttpServletRequest request) throws Exception {
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("--------------- Daily Statistics EDI  ------------------");
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(ClientUtils.getRemoteIP(request));
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("Param : " + ClientUtils.getVOvalue(vo));

		
		String res = "";

		if (vo.getRtn_sts().equals("dm") || vo.getRtn_sts().equals("dmc"))
			res = dailyStatisService.getEDI_Meip(vo);
		else
			res = dailyStatisService.getEDI_Trade(vo);

		// �����͸� �����ؼ� ��������
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(res.toString());

		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("---------------------------------------------------------");
		return res;
	}

	// ���� edi ���
	// ��� ��ȸ
	@RequestMapping(value = "/dzapi/statis/daily-all/edi", method = RequestMethod.GET)
	public @ResponseBody String edi_all(EDIDto vo, HttpServletRequest request) throws Exception {
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("--------------- Daily Statistics EDI All------------------");
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(ClientUtils.getRemoteIP(request));
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("Param : " + ClientUtils.getVOvalue(vo));
	
		String res = dailyStatisService.getEDI_ALL(vo);

		// �����͸� �����ؼ� ��������
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(res.toString());

		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("---------------------------------------------------------");
		return res;
	}

	// ���� ������ü 
	// ���� ��ȸ
	@RequestMapping(value = "/dzapi/statis/daily/acnt", method = RequestMethod.GET)
	public @ResponseBody String acnt_trade(AcntDto vo, HttpServletRequest request) throws Exception {
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("--------------- Daily Statistics Acnt ------------------");
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(ClientUtils.getRemoteIP(request));
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("Param : " + ClientUtils.getVOvalue(vo));
	
		String res = dailyStatisService.getAcnt_Trade(vo);

		// �����͸� �����ؼ� ��������
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(res.toString());

		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("---------------------------------------------------------");
		return res;
	}

	// ���� ������ü ��� 
	// ��� ��ȸ
	@RequestMapping(value = "/dzapi/statis/daily-all/acnt", method = RequestMethod.GET)
	public @ResponseBody String acnt_All(AcntDto vo, HttpServletRequest request) throws Exception {
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("--------------- Daily Statistics Acnt All------------------");
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(ClientUtils.getRemoteIP(request));
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("Param : " + ClientUtils.getVOvalue(vo));
	
		String res = dailyStatisService.getAcnt_All(vo);

		// �����͸� �����ؼ� ��������
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(res.toString());

		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("---------------------------------------------------------");
		return res;
	}

	// ���� �������  
	// ���� ��ȸ
	@RequestMapping(value = "/dzapi/statis/daily/vcnt", method = RequestMethod.GET)
	public @ResponseBody String vcnt_Trade(VcntDto vo, HttpServletRequest request) throws Exception {
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("--------------- Daily Statistics Vcnt ------------------");
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(ClientUtils.getRemoteIP(request));
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("Param : " + ClientUtils.getVOvalue(vo));
	
		String res = dailyStatisService.getVcnt_Trade(vo);

		// �����͸� �����ؼ� ��������
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(res.toString());

		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("---------------------------------------------------------");
		return res;
	}
	
	// ���� �������  
	// ��� ����
	@RequestMapping(value = "/dzapi/statis/daily-all/vcnt", method = RequestMethod.GET)
	public @ResponseBody String vcnt_All(VcntDto vo, HttpServletRequest request) throws Exception {
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("--------------- Daily Statistics Vcnt All------------------");
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(ClientUtils.getRemoteIP(request));
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("Param : " + ClientUtils.getVOvalue(vo));
	
		String res = dailyStatisService.getVcnt_All(vo);

		// �����͸� �����ؼ� ��������
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(res.toString());

		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("---------------------------------------------------------");
		return res;
	}
	
	// ���� �޴��� ����
	// ���� ��ȸ
	@RequestMapping(value = "/dzapi/statis/daily/mcash", method = RequestMethod.GET)
	public @ResponseBody String mcash_Trade(MCashDto vo, HttpServletRequest request) throws Exception {
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("--------------- Daily Statistics MCash ------------------");
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(ClientUtils.getRemoteIP(request));
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("Param : " + ClientUtils.getVOvalue(vo));
	
		String res = dailyStatisService.getMCash_Trade(vo);

		// �����͸� �����ؼ� ��������
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(res.toString());

		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("---------------------------------------------------------");
		return res;
	}
	
	// ���� �޴��� ����
	// ��� ����
	@RequestMapping(value = "/dzapi/statis/daily-all/mcash", method = RequestMethod.GET)
	public @ResponseBody String mcash_All(MCashDto vo, HttpServletRequest request) throws Exception {
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("--------------- Daily Statistics MCash All------------------");
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(ClientUtils.getRemoteIP(request));
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("Param : " + ClientUtils.getVOvalue(vo));
		
		String res = dailyStatisService.getMCash_ALL(vo);

		// �����͸� �����ؼ� ��������
		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog(res.toString());

		LoggerCustom.DzAPI_ConsoleLog_AND_FileLog("---------------------------------------------------------");
		return res;
	}
}
