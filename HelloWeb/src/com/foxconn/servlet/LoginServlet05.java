package com.foxconn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet05
 */
public class LoginServlet05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet05() {
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
	    System.out.println("jkajajsjas");
		String uname=request.getParameter("uname");
		String passwd=request.getParameter("upwd");
		String returnUri=request.getParameter("return_uri");
		System.out.println("用户名："+uname);
		System.out.println("密码："+passwd);
		System.out.println("return_uri："+returnUri);
		
		RequestDispatcher rd=null;
		if(uname==null||passwd==null) {
			request.setAttribute("msg", "用户名或密码为空");
			rd=request.getRequestDispatcher("/05/login.jsp");
			rd.forward(request, response);
		}else {
			if(uname.equals("哇") &&passwd.equals("121")) {
				request.getSession().setAttribute("flag", "login_success");
				if(returnUri!=null) {
					rd=request.getRequestDispatcher(returnUri);
					rd.forward(request, response);
				}else{
					rd=request.getRequestDispatcher("/05/index.jsp");
					rd.forward(request, response);
				}
			}else {
				request.getSession().setAttribute("flag", "login_error");
				request.setAttribute("msg", "用户名或密码输入错误！！");
				rd=request.getRequestDispatcher("/05/login.jsp");
				rd.forward(request, response);
					
			}
			
		}
	}

}
