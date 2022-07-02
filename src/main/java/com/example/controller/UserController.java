package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class UserController {

	@GetMapping("/toLogin")
	public String toLogin() {
		return "user/login";
	}
	
	@GetMapping("/toSignup")
	public String toSignup() {
		return "user/signup";
	}
}
