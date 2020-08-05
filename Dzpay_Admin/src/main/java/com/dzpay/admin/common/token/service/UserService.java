package com.dzpay.admin.common.token.service;

import java.util.HashMap;

import com.dzpay.admin.common.dto.token.auth.UserDto;


public interface UserService {
	public boolean checkUser(HashMap<String, String> param);
	public int insertUser(UserDto userDto);
}
