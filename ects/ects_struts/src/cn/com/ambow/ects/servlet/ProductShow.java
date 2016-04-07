package cn.com.ambow.ects.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.ambow.ects.dao.IProductDao;
import cn.com.ambow.ects.dao.impl.ProductDaoImpl;
import cn.com.ambow.ects.entity.Product;

public class ProductShow extends  HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);

	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		IProductDao productDao=new ProductDaoImpl();
		 
		List list=new ArrayList();
		list=productDao.findAll();
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Product p=(Product)it.next();
			out.print(p.getId()+":");
			out.print(p.getName()+",");
			out.print(p.getDescriptions());
			out.print("\n");
				
		}
		
		out.close();
	}

}

