package cn.com.ambow.ects.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.ambow.ects.dao.IProductDao;
import cn.com.ambow.ects.dao.impl.ProductDaoImpl;
import cn.com.ambow.ects.entity.Product;

public class ProductById extends HttpServlet{

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);
		
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		
		IProductDao pDao=new ProductDaoImpl();
		
		String id=(String) req.getSession().getAttribute("id");
		
		Product p=pDao.findById(Integer.parseInt(id));
		out.println("这个是"+id+"产品的详细信息");
		out.print(p.getName());
		out.println(p.getDescriptions());
		
	}

}
