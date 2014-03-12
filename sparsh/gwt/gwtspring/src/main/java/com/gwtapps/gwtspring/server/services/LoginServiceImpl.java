package com.gwtapps.gwtspring.server.services;

import org.springframework.stereotype.Service;

import com.gwtapps.gwtspring.shared.services.LoginService;
@Service("loginService")
public class LoginServiceImpl  implements
		LoginService {

	@Override
	public boolean login(String user, String password) {
		if (user.equalsIgnoreCase("yunus") && password.equals("yunus"))
		return true;
		else return false;
	}

}
