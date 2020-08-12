package com.dzpay.admin.controller;


import java.util.Date;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzpay.admin.common.dto.token.auth.UserDto;
import com.dzpay.admin.common.token.service.UserService;



@Controller
public class UserController {
	
	@Resource(name = "userService")
	private UserService userService;
	
	@RequestMapping(value = "/dzapi/user", method = RequestMethod.GET)
	@ResponseBody
	public String checkUser(@RequestParam HashMap<String, String> param, HttpServletResponse response, HttpServletRequest request) throws Exception{
		
		System.out.println(new Date());
		System.out.println("---- CHECK USER ----");
		
		String apikey = param.get("apikey").trim();
		String sitecd = param.get("sitecode").trim();
		
		System.out.println("APIKEY : " + apikey);
		System.out.println("SITE CODE : " + sitecd);
		
		UserDto userDto = new UserDto();
		
		userDto.setApikey(apikey);
		userDto.setSitecd(sitecd);
		userDto.setCreatedDate(new Date());
		
		if (!userService.checkUser(param))
			return "not valid User";		
		else
			return "valid User";

	}
	
	@RequestMapping(value = "/dzapi/user", method = RequestMethod.POST)
	@ResponseBody
	public String insertUser(@RequestParam HashMap<String, String> param, HttpServletResponse response, HttpServletRequest request) throws Exception{
		
		System.out.println(new Date());
		System.out.println("---- INSERT USER ----");
		
		String apikey = param.get("apikey").trim();
		String sitecd = param.get("sitecode").trim();
		
		System.out.println("APIKEY : " + apikey);
		System.out.println("SITE CODE : " + sitecd);
		
		UserDto userDto = new UserDto();
		
		userDto.setApikey(apikey);
		userDto.setSitecd(sitecd);
		userDto.setCreatedDate(new Date());
		
		int status = userService.insertUser(userDto);
		
		System.out.println("---- INSERT USER END ----");

		if(status == 0)
			return "SUCC INSERT USER";
		else
			return "FAIL INSERT USER";
	}
}

