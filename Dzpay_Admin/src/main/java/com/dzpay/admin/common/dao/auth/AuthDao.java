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
			System.out.println("�������� �ʴ� ��ū");
			return null;
		}
		return authDto;
	}
	
	public int updateAuth(AuthDto authDto) throws Exception{
		int res = (int) update("authMapper.updateAuth", authDto);
		System.out.println(res);
		if(res != 1) {
			System.out.println("������Ʈ ����");
		}
		return res;
	}
	
	public AuthDto checkSitecdApikey(AuthDto authDto) throws Exception{
		AuthDto authDto2 = (AuthDto) selectOne("authMapper.checkSitecdApikey", authDto);
		if(authDto2 == null || authDto2.equals(null)) {
			System.out.println("���� ���� api Ű");
			return authDto2;
		}
		else {
			System.out.println("�̹� �����ϴ� api Ű");
			return authDto2;
		}
	}
	
	public AuthDto checkApikey(String apikey) throws Exception{
		AuthDto authDto = new AuthDto();
		authDto = (AuthDto) selectOne("authMapper.checkApikey", apikey);
		
		if(authDto == null) {
			System.out.println("���ʷ� �����ϴ� api Ű");
		}
		return authDto;
	}
	
	public AuthDto checkSitecd(String sitecd) throws Exception{
		AuthDto authDto = new AuthDto();
		authDto = (AuthDto) selectList("authMapper.checkSitecd", sitecd).get(0);
		if(authDto == null || authDto.equals(null)) {
			System.out.println("�������� �ʴ� ����Ʈ �ڵ�");
		}
		return authDto;
	}

}
