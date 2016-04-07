package cn.com.ambow.ects.servlet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import cn.com.ambow.ects.dao.IProductDao;
import cn.com.ambow.ects.dao.impl.ProductDaoImpl;
import cn.com.ambow.ects.entity.Product;

public class TestListener implements HttpSessionListener,ServletContextListener,ServletRequestListener{

	public void sessionCreated(HttpSessionEvent e) {
		IProductDao dao=new ProductDaoImpl();
		List productListAll=dao.findAll();
		List productListLast=new ArrayList();
		List productListSale=new ArrayList();
		
		productListLast.add(productListAll.get(1));
		productListLast.add(productListAll.get(2));
		
		productListSale.add(productListAll.get(3));
		productListSale.add(productListAll.get(4));
		productListSale.add(productListAll.get(5));
		productListSale.add(productListAll.get(6));
		
		Map shopCart=new HashMap();
		double totalPrice=0;
		
		e.getSession().setAttribute("totalPrice", totalPrice);
		e.getSession().setAttribute("shopCart", shopCart);
		e.getSession().setAttribute("productListLast", productListLast);
		e.getSession().setAttribute("productListSale", productListSale);
		e.getSession().setAttribute("productListAll", productListAll);	
		
	}

	public void sessionDestroyed(HttpSessionEvent e) {
		/*	
		 * System.out.println("--------------------------------------------------");
		System.out.println("HttpSessionListener");*/
		
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		
		//System.out.println("ServletContextListener");
	}

	public void contextInitialized(ServletContextEvent e) {
		/*
		IProductDao dao=new ProductDaoImpl();
		System.out.println("pppppppppppppppppppppppppppppppppppppppppppppppp");
		List productList=dao.findAll();
		e.getServletContext().setAttribute("productList", productList);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("这个是在listener中的"+productList.size());
		*/
	}

	public void requestDestroyed(ServletRequestEvent arg0) {
		/*System.out.println("____________________________________________________________");
		System.out.println("requestDestroyed");*/
		
	}

	public void requestInitialized(ServletRequestEvent arg0) {
		/*System.out.println("____________________________________________________________");
		System.out.println("requestInitialized");
		*/
	}

}
