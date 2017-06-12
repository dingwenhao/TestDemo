package com.hy.service.impl;

import com.hy.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public boolean isLogin(String userName, String password) {
		if ("1".equals(userName) && "1".equals(password)) {
			return true;
		} else {
			return false;
		}
	}

}
