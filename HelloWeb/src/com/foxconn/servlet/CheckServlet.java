package com.foxconn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foxconn.dto.User;
import com.foxconn.service.CheckUserService;

public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CheckUserService cku=new CheckUserService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname=request.getParameter("uname");
		String passwd=request.getParameter("upwd");
		
		RequestDispatcher rd=null;
		String forward=null;
		if(uname==null||passwd==null) {
			request.setAttribute("msg", "用户或密码错误");
			rd=request.getRequestDispatcher("/03/error.jsp");
			rd.forward(request, response);
		}else {
			User user=new User();
			user.setName(uname);
			user.setPassword(passwd);
			boolean bool=cku.check(user);
			
			if(bool) {
				forward="/03/success.jsp";
			}else {
				request.setAttribute("msg", "用户或密码错误");
				forward="/03/error.jsp";
			}
			rd=request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}
	}

}
