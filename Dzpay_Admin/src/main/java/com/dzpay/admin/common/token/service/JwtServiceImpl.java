package com.dzpay.admin.common.token.service;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Component(value = "jwtService")
public class JwtServiceImpl implements JwtService {

	private static final String SALT = "saltPapper";

	/*
	 * @Override public <T> String accessTokenCreate(String key, T data, String
	 * issuer, String audi, String subject, int term_time) { String jwt =
	 * Jwts.builder().setHeaderParam("typ", "JWT").setHeaderParam("regDate",
	 * System.currentTimeMillis())
	 * .setIssuer(issuer).setAudience(audi).setSubject(subject) .setExpiration(new
	 * Date(System.currentTimeMillis() + term_time * 1000)).claim(key, data)
	 * .signWith(SignatureAlgorithm.HS256, this.generateKey()).compact(); return
	 * jwt; }
	 * 
	 * @Override public <T> String refreshTokenCreate(String key, T data, String
	 * issuer, String audi, String subject, int term_time) { String jwt =
	 * Jwts.builder().setHeaderParam("typ", "JWT").setHeaderParam("regDate",
	 * System.currentTimeMillis())
	 * .setIssuer(issuer).setAudience(audi).setSubject(subject) .setExpiration(new
	 * Date(System.currentTimeMillis() + term_time * 1000)).claim(key, data)
	 * .signWith(SignatureAlgorithm.HS256, this.generateKey()).compact(); return
	 * jwt; }
	 */

	@Override
	public <T> String tokenCreate(String key, T data, String issuer, String audi, String subject, int term_time) {
		String jwt = Jwts.builder().setHeaderParam("typ", "JWT").setHeaderParam("regDate", System.currentTimeMillis())
				.setIssuer(issuer).setAudience(audi).setSubject(subject)
				.setExpiration(new Date(System.currentTimeMillis() + term_time * 1000)).claim(key, data)
				.signWith(SignatureAlgorithm.HS256, this.generateKey()).compact();
		return jwt;
	}

	private byte[] generateKey() {
		byte[] key = null;
		try {
			key = SALT.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("Making JWT Key Error ::: {}");
		}
		return key;
	}

	@Override
	public Map<String, Object> get(String key) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
				.getRequest();
		String jwt = request.getHeader("Authorization").split(" ")[1];
		System.out.println(jwt);
		Jws<Claims> claims = null;
		try {
			claims = Jwts.parser().setSigningKey(SALT.getBytes("UTF-8")).parseClaimsJws(jwt);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("토큰 유효 기간 만료");
		}
		@SuppressWarnings("unchecked")
		Map<String, Object> value = (LinkedHashMap<String, Object>) claims.getBody().get(key);
		System.out.println("value: " + value);
		return value;
	}

	@Override
	public String getAccessToken() {
		return (String) this.get("token").get("accessToken");
	}

	@Override
	public String getRefreshToken() {
		return (String) this.get("token").get("refreshToken");
	}

	@Override
	public String getSiteCode() {
		return (String) this.get("token").get("siteCode");
	}

	@Override
	public String getStatus() {
		return (String) this.get("token").get("refreshToken");
	}

	// accessToken, refreshToken의 경우
	@Override
	public String getExpireDate() {
		return (String) this.get("properties").get("expire_term");
	}

	@Override
	public boolean isUsable(String jwt) {
		try {
			Jwts.parser().setSigningKey(this.generateKey()).parseClaimsJws(jwt);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("토큰 유효 기간 만료");
		}
		return false;
	}

	@Override
	public boolean validationToken() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
				.getRequest();
		boolean res = false;

		String jwt = request.getHeader("Authorization").split(" ")[1];

		System.out.println("---- validate check ----");

		Jws<Claims> claims = null;

		try {
			claims = Jwts.parser().setSigningKey(SALT.getBytes("UTF-8")).parseClaimsJws(jwt);
			res = true;
		} catch (ClaimJwtException e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("JWT 권한 claim 검사 실패");
		} catch (MalformedJwtException e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("토큰 구조적인 에러");
		} catch (SignatureException e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("토큰 검증 실패");
		} catch (UnsupportedJwtException e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("서비스 형식에 맞지 않는 토큰");
		} catch (IllegalArgumentException | UnsupportedEncodingException e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("허용되지 않은 인자 혹은 인코딩 형식");
		}

		return res;
	}

	@Override
	public boolean getExpToken(String jwt) {
		return false;
	}

}
