package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.SignupForm;
import com.example.service.UserService;

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
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public SignupForm setUpForm() {
		return new SignupForm();
	}

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
	 * ユーザー登録をします.
	 * 
	 * @param form 入力されたユーザー情報
	 * @param result 入力値チェック
	 * @return 成功の場合ログイン画面 失敗の場合ユーザー登録画面
	 */
	@PostMapping("/signup")
	public String signup(@Validated SignupForm form, BindingResult result) {
		System.out.println("ポストリクエスト送られてきました.");
		if(!form.getConfirmPassword().equals(form.getPassword())) {
			result.rejectValue("confirmPassword", null, "パスワードが一致しません");
		}
		if(result.hasErrors()) {
			return toSignup();
		}
		
		User user = new User();
		BeanUtils.copyProperties(form, user);
		
		userService.insert(user);
		
		return "redirect:/user/toLogin";
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
