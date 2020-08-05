package com.dzpay.admin.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzpay.admin.common.dto.token.auth.AuthDto;
import com.dzpay.admin.common.token.service.AuthService;
import com.dzpay.admin.common.token.service.JwtService;
import com.dzpay.admin.common.token.service.PgService;
import com.dzpay.admin.common.token.service.UserService;

@Controller
public class AuthController {

	private final int custom_term = 30 * 3600 * 1000; // 30일

	@Resource(name = "authService")
	private AuthService authService;

	@Resource(name = "jwtService")
	private JwtService jwtService;

	@Resource(name = "pgService")
	private PgService pgService;

	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(value = "/dzapi/auth", method = RequestMethod.POST)
	@ResponseBody
	public String authInsert(@RequestParam HashMap<String, String> param, AuthDto authDto, HttpServletResponse response,
			HttpServletRequest request) throws Exception {

		if (!userService.checkUser(param))
			return "not valid User";

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("expire_date", String.valueOf(custom_term));
		String accessToken = jwtService.tokenCreate("properties", map, "dzpay", "site", "dzpay accessToken", custom_term);
		String refreshToken = jwtService.tokenCreate("properties", map, "dzpay", "site", "dzpay refreshToken", custom_term);

		map.clear();

		authDto.setAccessToken(accessToken);
		authDto.setRefreshToken(refreshToken);
		
		// api key와 site code가 이미 토큰을 받음
		// 해당 부분을 update 하자
		if (authService.checkSitecdApikey(authDto)) {
			authDto.setModifiedDate(new Date());

			authService.updateAuth(authDto);
			System.out.println("업데이트 완료");
		} else {
			// 한번도 접근한 적이 없는 사이트
			// 신규 값 삽입
			authDto.setCreatedDate(new Date());

			authService.insertAuth(authDto);
			System.out.println("신규 인증 등록 완료");
		}

		ArrayList<Cookie> setCookie = new ArrayList<>();
		setCookie.add(new Cookie("accessToken", accessToken));
		setCookie.add(new Cookie("refreshToken", refreshToken));

		setCookie.add(new Cookie("status", "VALID"));
		setCookie.add(new Cookie("siteCode", param.get("sitecd")));

		for (Cookie cookie : setCookie)
			response.addCookie(cookie);

		System.out.println("accessToken :" + accessToken);
		System.out.println("refreshToken :" + refreshToken);
		System.out.println("status :" + "VALID");
		System.out.println("siteCode :" + param.get("sitecd"));
		System.out.println(new Date());

		return "SUCC AUTH";
	}

	@RequestMapping(value = "/dzapi/refresh", method = RequestMethod.POST)
	@ResponseBody
	public String refreshToken(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AuthDto authDto = new AuthDto();
		String accessToken = request.getHeader("Authorization").split("Bearer ")[1];
		authDto = authService.selectAuth(accessToken);
		System.out.println("기존 토큰 : " + accessToken);

		jwtService.isUsable(authDto.getRefreshToken());

		String newToken = jwtService.tokenCreate("properties", null, null, "site", "dzpay accessToken",
				3600 * 1000);

		authDto.setAccessToken(newToken);

		// api key와 site code가 이미 토큰을 받음
		// 해당 부분을 update 하자
		if (authService.checkApikey(request.getParameter("apikey"))
				&& authService.checkSitecd(request.getParameter("sitecd"))) {
			System.out.println("---- Auth Refresh ----");

			authDto.setModifiedDate(new Date());

			authService.updateAuth(authDto);
			System.out.println("업데이트 완료");

		}

		Cookie setCookie = new Cookie("accessToken", newToken);
		response.addCookie(setCookie);

		System.out.println("New AccessToken :" + newToken);
		System.out.println(new Date());

		return newToken;
	}

}

