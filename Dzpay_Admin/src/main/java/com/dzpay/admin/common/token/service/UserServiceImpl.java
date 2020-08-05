package com.dzpay.admin.common.token.service;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dzpay.admin.common.dao.auth.UserDao;
import com.dzpay.admin.common.dto.token.auth.UserDto;
import com.dzpay.admin.common.error.UnsameUserException;

@Service(value = "userService")
public class UserServiceImpl implements UserService{
	
	@Resource(name = "userDao")
	private UserDao userDao;
	
	public boolean checkUser(HashMap<String, String> param){
		boolean userCheck = false;
		
		UserDto userDto = new UserDto();
		userDto.setSitecd(param.get("sitecd"));
		userDto.setApikey(param.get("apikey"));
		
		try {
			if(userDao.selectUserBySitecdApikey(userDto).getId() >= 1)
				userCheck = true;
			else
				userCheck = false;
		} catch (Exception e) {
			throw new UnsameUserException();
		}
		if(userCheck)
			return true;
		else
			System.out.println("존재하지 않는 유저");
		return false;
	}
	
	public int insertUser(UserDto userDto) {
		int res = 0;
		try {
			res = userDao.insertUser(userDto);
		} catch (Exception e) {
			e.printStackTrace();
			return res;
		}
		return res;
	}
}
