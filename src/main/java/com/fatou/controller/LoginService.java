package com.fatou.controller;

import org.springframework.stereotype.Service;

@Service

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("senegal") && password.equals("lion");
	}

}
