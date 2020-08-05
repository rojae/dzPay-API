package com.dzpay.admin.common.dao.auth;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dzpay.admin.common.dto.token.auth.UserDto;

@Component(value = "userDao")
public class UserDao {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public UserDto selectUserByApikey(String apikey) {
		SqlSession session = sqlSessionFactory.openSession();
		
		UserDto userDto = new UserDto();

		try {
			System.out.println("API Ű�� ���� ���� ��ȸ");
			userDto = session.selectOne("UserMapper.selectUserByApikey", apikey);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		return userDto;
	}
	
	public UserDto selectUserBySitecd(String sitecd) throws Exception{
		SqlSession session = sqlSessionFactory.openSession();
		
		UserDto userDto = new UserDto();
		
		try {
			System.out.println("Site code�� ���� ���� ��ȸ");
			userDto = (UserDto) session.selectList("UserMapper.selectUserBySitecd", sitecd).get(0);	// ù��° �͸� ���������� ����, ���� ������ ����
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		return userDto;
	}
	
	
	
	
	public UserDto selectUserBySitecdApikey(UserDto userDto) throws Exception{
		SqlSession session = sqlSessionFactory.openSession();
		
		UserDto result = new UserDto();
		
		try {
			System.out.println("APIŰ�� Site code �� ���� ���� ��ȸ");
			result = session.selectOne("UserMapper.selectUserBySitecdApikey", userDto);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		return result;
	}
	
	
	public int insertUser(UserDto userDto) throws Exception{
		SqlSession session = sqlSessionFactory.openSession();
		int res = 0;
		try {
			res = session.selectOne("UserMapper.insertUser", userDto);
			System.out.println("insertUser Result : " + res);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return res;
	}
}
