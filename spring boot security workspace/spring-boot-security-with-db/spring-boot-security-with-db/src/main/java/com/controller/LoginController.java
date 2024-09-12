package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Login;
import com.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@Autowired
	PasswordEncoder passwordEncode;
	
	@PostMapping(value = "signup",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signUp(@RequestBody Login login) {
		login.setPassword(passwordEncode.encode(login.getPassword()));		// encode format convert 
		return loginService.signUp(login);
	}
}
