package com.example.domain;

/**
 * ユーザー情報を格納します.
 * @author isodakeisuke
 *
 */
public class User {
	/* 名前 */
	private Integer id;
	/* 名前 */
	private String name;
	/* メールアドレス */
	private String email;
	/* パスワード */
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

}
