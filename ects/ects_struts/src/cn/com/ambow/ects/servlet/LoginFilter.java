package cn.com.ambow.ects.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import cn.com.ambow.ects.entity.User;

public class LoginFilter implements Filter{

	public void destroy() {
		
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse resp=(HttpServletResponse) response;
		HttpSession session=req.getSession();
		
		User user=(User)session.getAttribute("user");
		if(user!=null)
		{
			chain.doFilter(req, resp);
		}else{
			req.getSession().getServletContext().getRequestDispatcher("/onlineshopping_jsp/login.jsp").forward(req, resp);
			
		}
		
		
		
		
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

}
