package com.foxconn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.foxconn.pojo.User;

public class ControlFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request=(HttpServletRequest) arg0;
		//1.接收用户请求的地址
		String url=request.getServletPath();
		//System.out.println("sssssssssss"+url);
		//2.判断用户请求的地址，并执行相应的程序
		if(url.equals("/01/register.action")) {
			request.getRequestDispatcher("/01/register.jsp").forward(arg0, arg1);
			return;
		}else if(url.equals("/01/saveUser.action")) {
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			String password1=request.getParameter("password1");
			if(password.equals(password1)) {
				User us=new User();
				us.setUsername(username);
				us.setPassword(password);
				//执行相关DAO持久化操作
				request.getRequestDispatcher("/01/end.jsp").forward(arg0, arg1);
				return;
			}else {
				request.getRequestDispatcher("/01/register.jsp").forward(arg0, arg1);
				return;
			}
		}
		//3.跳转到相应的结果界面
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
