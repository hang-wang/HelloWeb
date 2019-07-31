package com.foxconn.action;

import com.foxconn.pojo.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 
 * @author admin
 *ModelDriven<User>的泛型必须写即将封装的实体类型
 */
public class MLoginAction extends ActionSupport implements ModelDriven<User>{

	private User us=new User();
	/**
	 * 模型驱动
	 */
	@Override
	public String execute() throws Exception {
		System.out.println(us.getUsername());
		System.out.println(us.getPassword());
		// TODO Auto-generated method stub
		return "success";
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return us;
	}

	
}
