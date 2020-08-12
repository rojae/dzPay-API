package com.dzpay.admin.common.token.service;

import java.util.Map;

public interface JwtService {
	/*
	 * <T> String accessTokenCreate(String key, T data, String issuer, String audi,
	 * String subject, int term_time); <T> String refreshTokenCreate(String key, T
	 * data, String issuer, String audi, String subject, int term_time);
	 */
	
	<T> String tokenCreate(String key, T data, String issuer, String audi, String subject, int term_time);
	
	boolean getExpToken(String jwt);
	
	Map<String, Object> get(String key);
	boolean isUsable(String jwt);

	String getAccessToken();
	String getRefreshToken();
	
	String getSiteCode();
	String getStatus();
	String getExpireDate();
	
	boolean validationToken();
}
