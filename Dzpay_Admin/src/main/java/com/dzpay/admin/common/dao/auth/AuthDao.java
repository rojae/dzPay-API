package com.dzpay.admin.common.dao.auth;

import org.springframework.stereotype.Repository;

import com.dzpay.admin.common.dao.AbstractDAO;
import com.dzpay.admin.common.dto.token.auth.AuthDto;

@Repository("authDao")
public class AuthDao extends AbstractDAO{

	public Object insertAuth(AuthDto authDto) throws Exception{
		return insert("authMapper.insertAuth", authDto);
	}
	
	public AuthDto selectAuth(String accessToken) throws Exception{
		AuthDto authDto = (AuthDto) selectOne("authMapper.selectAuth", accessToken);
		if(authDto.equals(null)) {
			System.out.println("존재하지 않는 토큰");
			return null;
		}
		return authDto;
	}
	
	public int updateAuth(AuthDto authDto) throws Exception{
		int res = (int) update("authMapper.updateAuth", authDto);
		System.out.println(res);
		if(res != 1) {
			System.out.println("업데이트 실패");
		}
		return res;
	}
	
	public AuthDto checkSitecdApikey(AuthDto authDto) throws Exception{
		AuthDto authDto2 = (AuthDto) selectOne("authMapper.checkSitecdApikey", authDto);
		if(authDto2 == null || authDto2.equals(null)) {
			System.out.println("최초 접근 api 키");
			return authDto2;
		}
		else {
			System.out.println("이미 존재하는 api 키");
			return authDto2;
		}
	}
	
	public AuthDto checkApikey(String apikey) throws Exception{
		AuthDto authDto = new AuthDto();
		authDto = (AuthDto) selectOne("authMapper.checkApikey", apikey);
		
		if(authDto == null) {
			System.out.println("최초로 접근하는 api 키");
		}
		return authDto;
	}
	
	public AuthDto checkSitecd(String sitecd) throws Exception{
		AuthDto authDto = new AuthDto();
		authDto = (AuthDto) selectList("authMapper.checkSitecd", sitecd).get(0);
		if(authDto == null || authDto.equals(null)) {
			System.out.println("존재하지 않는 사이트 코드");
		}
		return authDto;
	}

}
