package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ユーザーを管理するコントローラーです.
 * 
 * @author isodakeisuke
 *
 */
@Controller
@RequestMapping("/auth")
public class UserController {

	/**
	 * ログイン画面を表示します.
	 * 
	 * @return ログイン画面
	 */
	@GetMapping("/toLogin")
	public String toLogin() {
		return "user/login";
	}
	
	/**
	 * ユーザー登録画面を表示します.
	 * 
	 * @return ユーザー登録画面
	 */
	@GetMapping("/toSignup")
	public String toSignup() {
		return "user/signup";
	}
}
