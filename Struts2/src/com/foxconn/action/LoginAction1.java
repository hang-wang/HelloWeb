package com.foxconn.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction1 extends ActionSupport {
	/**
	 * 属性驱动
	 */
	@Override
	public String execute() throws Exception {
		System.out.println(username);
		System.out.println(password);
		return "success";
	}
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}
