package com.foxconn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	}

	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("进去get方法");
		doPost(req,resp);
			
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("进入post方法");
		String userName=req.getParameter("uname");
		String password=req.getParameter("upwd");
		System.out.println("用戶名=====>"+userName);
		System.out.println("密碼==>"+password);
		String forward=null;
		if(userName.equals("11")&&password.equals("11")) {
			//请求重定向，可以访问其他应用地址
			//resp.sendRedirect(req.getContextPath()+"/02/success.jsp");
		//请求转发,不能转发给其他应用地址
			forward="/02/success.jsp";
			RequestDispatcher rd=req.getRequestDispatcher(forward);
			rd.forward(req, resp);
		}else {
			//resp.sendRedirect(req.getContextPath()+"/02/error.jsp");
			
			forward="/02/error.jsp";
			RequestDispatcher rd=req.getRequestDispatcher(forward);
			rd.forward(req, resp);
		}
			
	}
	

}
