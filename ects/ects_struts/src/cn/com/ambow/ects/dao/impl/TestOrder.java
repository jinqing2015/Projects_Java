package cn.com.ambow.ects.dao.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import cn.com.ambow.ects.dao.IOrderDao;
import cn.com.ambow.ects.dao.IProductDao;
import cn.com.ambow.ects.dao.IUserDao;
import cn.com.ambow.ects.entity.Category;
import cn.com.ambow.ects.entity.ContcatInfo;
import cn.com.ambow.ects.entity.Country;
import cn.com.ambow.ects.entity.Order;
import cn.com.ambow.ects.entity.OrderLine;
import cn.com.ambow.ects.entity.OrderStatus;
import cn.com.ambow.ects.entity.PayWay;
import cn.com.ambow.ects.entity.Product;
import cn.com.ambow.ects.entity.Province;
import cn.com.ambow.ects.entity.User;

public class TestOrder {
	public static void main(String[] args) {
		IOrderDao orderDaoImpl=new OrderDaoImpl();
		IUserDao userDaoImpl=new UserDaoImpl();
		IProductDao productDaoImpl=new ProductDaoImpl();
		//测试findall
		/*List orderList=orderDaoImpl.findAll("admin3");
		System.out.println(orderList.size());
		
		Iterator it=orderList.iterator();
		while(it.hasNext())
		{
			Order o=(Order) it.next();
			System.out.println(o.getName());
			System.out.println(o.getPayWay().getPayStyle());
			System.out.println(o.getUser().getName());
			System.out.println(o.getStatus().getDescriptions());
		}*/

		
		//测试findorderbyid
		/*Order o=orderDaoImpl.findById(1);
		
		System.out.println(o.getId());
		System.out.println(o.getUser().getId());
		System.out.println(o.getPayWay().getPayStyle());
		System.out.println(o.getStatus().getDescriptions());
		Set so=o.getOrderlines();
		Iterator it=so.iterator();
		while(it.hasNext())
		{
			OrderLine ol=(OrderLine) it.next();
			System.out.println(ol.getProduct().getName());
			System.out.println(ol.getProduct().getCategory().getDescriptions());
		}
		System.out.println(so.size());*/

		
		//测试addorder		
		/*Order o=new Order();
		
		User user=userDaoImpl.findById(10);
		o.setUser(user);
		
		PayWay payWay=new PayWay();
		payWay.setId(1);
		payWay.setPayStyle("现金付款");
		
		o.setPayWay(payWay);
		
		OrderStatus os=new OrderStatus();
		os.setId(1);
		os.setName("配货状态");
		os.setDescriptions("正在配货状态三天内将发出");
		
		o.setStatus(os);
		
		Product product1=productDaoImpl.findById(1);
		Product product2=productDaoImpl.findById(2);
		
		OrderLine ol1=new OrderLine();
		ol1.setAmount(30);
		ol1.setOrder(o);
		ol1.setProduct(product1);
		OrderLine ol2=new OrderLine();
		ol2.setAmount(40);
		ol2.setOrder(o);
		ol2.setProduct(product2);
		
		Set setOrderLine=new HashSet();
		setOrderLine.add(ol1);
		setOrderLine.add(ol2);
		
		o.setOrderlines(setOrderLine);
		
		orderDaoImpl.addOrder(o);*/
		
		

		
		
		
		
	}
}
