package com.foxconn.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterTwo
 */
public class FilterTwo implements Filter {

	 /**
     * Default constructor. 
     */
    public FilterTwo() {
        // TODO Auto-generated constructor stub
    	System.out.println("====FilterTwo构造函数====");
    }
    /**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("====FilterTwo初始化方法=====");
		String initParam=fConfig.getInitParameter("param");
		System.out.println("param== "+initParam);
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("====FilterTwo开始执行dofilter方法=====");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("====FilterTwo结束执行dofilter方法=====");
	}


	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("======FilterTwo销毁方法====");
	}

}
