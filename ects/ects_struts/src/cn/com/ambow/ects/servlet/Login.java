package cn.com.ambow.ects.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.ambow.ects.dao.IUserDao;
import cn.com.ambow.ects.dao.impl.UserDaoImpl;
import cn.com.ambow.ects.entity.User;

public class Login extends HttpServlet{


	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		//从页面获得用户输入username password
		String name = req.getParameter("user");
		String password = req.getParameter("password");
		
		IUserDao userDao=new UserDaoImpl();
		User user=userDao.login(name, password);
		if(user!=null)
		{
			req.getSession().getServletContext().getRequestDispatcher("/onlineshopping/index.html").forward(req, resp);
		}else{
			req.getSession().getServletContext().getRequestDispatcher("/onlineshopping/login.html").forward(req, resp);
		}
		out.close();
	}

}
