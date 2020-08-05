package com.dzpay.admin.common.token.service;

import com.dzpay.admin.common.dto.token.auth.AuthDto;

public interface AuthService {
	public void insertAuth(AuthDto auth) throws Exception;

	public AuthDto selectAuth(String accessToken) throws Exception;

	public boolean checkToken(String accessToken) throws Exception;
	
	public boolean checkApikey(String apikey) throws Exception;
	
	public boolean checkSitecd(String sitecd) throws Exception;
	
	public void updateAuth(AuthDto auth) throws Exception;

	boolean checkSitecdApikey(AuthDto auth) throws Exception;
}