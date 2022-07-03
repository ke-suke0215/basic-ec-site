package com.example.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * ユーザー登録時の情報を受け取ります.
 * @author isodakeisuke
 *
 */
public class SignupForm {
	/* 名前 */
	@NotBlank(message = "名前を入力してください")
	private String name;
	/* メールアドレス */
	@NotBlank(message = "メールアドレスを入力してください")
	@Email(message = "メールアドレスの形式が不正です")
	private String email;
	/* パスワード */
	@NotBlank(message = "パスワードを入力してください")
	@Size(min = 8, max = 16, message = "パスワードは８文字以上１６文字以内で設定してください")
	private String password;
	/* 確認用パスワード */
	@NotBlank(message = "確認用パスワードを入力してください")
	private String confirmPassword;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "SignupForm [name=" + name + ", email=" + email + ", password=" + password + ", confirmPassword="
				+ confirmPassword + "]";
	}

}
