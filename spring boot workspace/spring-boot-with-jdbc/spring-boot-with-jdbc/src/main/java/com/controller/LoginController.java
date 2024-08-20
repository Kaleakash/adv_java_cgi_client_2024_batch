package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Login;

@Controller
public class LoginController {

	// http://localhost:8080/
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String loginPage(Login ll,Model mm) {			// DI for Login class as well as Model object 
		mm.addAttribute("login", ll);			// request.setAttribute("key",value);
		System.out.println("login page open");
		System.out.println(ll);   // toString method called to get default value of emailid and password. 
		return "login";
	}
}
