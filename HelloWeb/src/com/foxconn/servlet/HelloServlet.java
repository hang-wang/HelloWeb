package com.foxconn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("========init without parmeters1========");
		super.init();
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("========init with parmeters1========");
		super.init(config);
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("========service========");
		PrintWriter pw=resp.getWriter();
		pw.println("hello worls");
		pw.close();
	}

	@Override
	public void destroy() {
		System.out.println("========destory========");
		super.destroy();
	}

	

}
