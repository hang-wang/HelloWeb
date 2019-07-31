package com.foxconn.action;

import com.foxconn.pojo.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author admin
    *标签实现模型驱动
 */
public class SLoginAction extends ActionSupport {

	private User us;
	@Override
	public String execute() throws Exception {
		System.out.println(us.getUsername());
		System.out.println(us.getPassword());
		return "success";
	}
	public User getUs() {
		return us;
	}
	public void setUs(User us) {
		this.us = us;
	}

	
	
}
