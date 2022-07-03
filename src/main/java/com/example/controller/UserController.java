package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/user")
public class UserController {

	@Autowired
	private HttpSession session;

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
	
	/**
	 * ログアウトする.
	 * 
	 * @return 商品一覧画面
	 */
	@GetMapping("/logout")
	public String logout() {

		session.invalidate();
		return "redirect:/";
	}
}
