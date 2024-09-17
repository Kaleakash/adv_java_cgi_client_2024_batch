package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RequestMapping("admin")
//@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	@GetMapping(value = "")
	public String greeting() {
		return "admin";
	}
}
