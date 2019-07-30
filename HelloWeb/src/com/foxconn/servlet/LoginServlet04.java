package com.foxconn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet04
 */
public class LoginServlet04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet04() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("进入post方法");
		String userName=request.getParameter("uname");
		String password=request.getParameter("upwd");
		System.out.println("用戶名=====>"+userName);
		System.out.println("密碼==>"+password);
		String forward=null;
		if(userName.equals("哇")&&password.equals("121")) {
			//请求重定向，可以访问其他应用地址
			//resp.sendRedirect(req.getContextPath()+"/02/success.jsp");
		//请求转发,不能转发给其他应用地址
			forward="/04/success.jsp";
			RequestDispatcher rd=request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}else {
			//resp.sendRedirect(req.getContextPath()+"/02/error.jsp");
			
			forward="/04/error.jsp";
			RequestDispatcher rd=request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}
	}

}
