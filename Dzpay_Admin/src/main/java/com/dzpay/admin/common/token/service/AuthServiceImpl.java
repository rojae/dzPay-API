package com.dzpay.admin.common.token.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dzpay.admin.common.dao.auth.AuthDao;
import com.dzpay.admin.common.dto.token.auth.AuthDto;

@Service(value = "authService")
public class AuthServiceImpl implements AuthService {

	@Resource(name = "authDao")
	private AuthDao authDao;

	@Override
	public void insertAuth(AuthDto auth) throws Exception {
		System.out.println("---- INSERT AUTH ----");
		authDao.insertAuth(auth);
	}

	@Override
	public AuthDto selectAuth(String accessToken) throws Exception {
		System.out.println("---- SELECT AUTH ----");
		return authDao.selectAuth(accessToken);
	}

	@Override
	public boolean checkToken(String accessToken) throws Exception {
		System.out.println("---- CHECK AUTH ----");
		if (authDao.selectAuth(accessToken) != null)
			return true;
		else
			System.out.println("[������ ��ū] ��ū �߱� ����");
		return false;
	}

	@Override
	public void updateAuth(AuthDto auth) throws Exception {
		System.out.println("---- UPDATE AUTH ----");
		authDao.updateAuth(auth);
	}

	@Override
	public boolean checkSitecdApikey(AuthDto auth) throws Exception {
		System.out.println("---- Check APIKEY AND SITECODE ----");
		if(authDao.checkSitecdApikey(auth) != null)
			return true;
		else
			System.out.println("Already USED || NOT VALID API KEY, SITE CODE");
		return false;
	}
	
	@Override
	public boolean checkApikey(String apikey) throws Exception {
		System.out.println("----- Check APIKEY -----");
		if(authDao.checkApikey(apikey) != null)
			return true;
		else
			System.out.println("[������ API KEY] API KEY üũ ����");
		return false;
	}

	@Override
	public boolean checkSitecd(String sitecd) throws Exception {
		System.out.println("----- Check SITECD -----");
		if(authDao.checkSitecd(sitecd) != null)
			return true;
		else
			System.out.println("[������ ����Ʈ�ڵ�] SITE CODE üũ ����");
		return false;
	}
	
	

}
