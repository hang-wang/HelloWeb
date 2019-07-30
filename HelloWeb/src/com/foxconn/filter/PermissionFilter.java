package com.foxconn.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet Filter implementation class PermissionFilter
 */
public class PermissionFilter implements Filter {

    /**
     * Default constructor. 
     */
    public PermissionFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("权限校验过滤器 { ");
		// 将ServletRequest转换为HttpServletRequest      
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String servletPath = request.getServletPath();
		System.out.println("Servlet Path ==> " + servletPath);

		// 获取HttpSession中的信息   
		HttpSession session = request.getSession();
		String flag = (String) session.getAttribute("flag");

		//权限校验
		if (servletPath != null
				&& (servletPath.equals("/05/login.jsp") || servletPath.equals("/loginServlet05") || servletPath
						.equals("/05/index.jsp"))) {
			chain.doFilter(servletRequest, servletResponse);
		} else {
			//访问非登录页面时
			if (flag != null && flag.equals("login_success")) {
				chain.doFilter(servletRequest, servletResponse);
			} else if (flag != null && flag.equals("login_error")) {
				request.setAttribute("msg", "登陆失败，请重新登录!<br/>");
				request.setAttribute("return_uri", servletPath);
				RequestDispatcher rd = request.getRequestDispatcher("/05/login.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("msg", "您尚未登陆！<br/>");
				request.setAttribute("return_uri", servletPath);
				RequestDispatcher rd = request.getRequestDispatcher("/05/login.jsp");
				rd.forward(request, response);
			}
		}
		System.out.println("权限校验过滤器 } ");
	
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
