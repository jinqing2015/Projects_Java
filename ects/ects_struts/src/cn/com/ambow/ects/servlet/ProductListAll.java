package cn.com.ambow.ects.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.ambow.ects.entity.Product;

public class ProductListAll extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
			doPost(request, response);
	}
			
			
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException 
	{
			response.setContentType("text/html");
			request.setCharacterEncoding("gbk");
			PrintWriter out = response.getWriter();
			
			//这个测试的是httplistener
			//List list = (List) request.getSession().getAttribute("productList");
			
			//这个测试的是servletContextListener
			List list = (List) request.getSession().getServletContext().getAttribute("productList");
			System.out.println("这个是在ProductListAll中的"+list.size());
			Product p =null;

			Iterator<Product> it =list.iterator();
			out.println("<html>");
			out.println("<head>");
			out.println("	<title>register</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("	<h2 align=\"center\">product</h2>");
			out.println("	<hr>");
			out.println("");
			out.println("");
			out.println("	<table width=\"600\" align=\"center\" border=\"1\" cellpadding=\"5\" cellspacing=\"0\">");
			out.println("		<tr>");
			out.println("			<td>ID</td>");
			out.println("			<td>NAME</td>");
			out.println("			<td>desc</td>");
			out.println("			");
			out.println("		</tr>");
			while(it.hasNext()){
				p = it.next();
				out.println("			<tr>");
				out.println("<td>");
				out.println(p.getId());
				out.println("</td>");
				out.println("<td>");
				out.println(p.getName());
				out.println("</td>");
				out.println("<td>");
				out.println(p.getDescriptions());
				out.println("</td>");
				out.println("			");
				out.println("		</tr>");
			}
			
			out.println("	</table>");
			out.println("	<a href=\"/testpro/servlet/day3/ModifyUserServlet\">Modify User</a>");
			out.println("	");
			out.println("");
			out.println("</body>");
			out.println("</html>");
			out.close();
			
	}
}
