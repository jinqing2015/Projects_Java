package cn.com.ambow.ects.web.servlet.handler;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;



import cn.com.ambow.ects.dao.IOrderDao;
import cn.com.ambow.ects.dao.IProductDao;
import cn.com.ambow.ects.dao.IUserDao;
import cn.com.ambow.ects.dao.impl.OrderDaoImpl;
import cn.com.ambow.ects.dao.impl.ProductDaoImpl;
import cn.com.ambow.ects.dao.impl.UserDaoImpl;
import cn.com.ambow.ects.entity.ContcatInfo;
import cn.com.ambow.ects.entity.Order;
import cn.com.ambow.ects.entity.OrderLine;
import cn.com.ambow.ects.entity.OrderStatus;
import cn.com.ambow.ects.entity.PayWay;
import cn.com.ambow.ects.entity.User;
import cn.com.ambow.ects.web.controller.PageController;
import cn.com.ambow.ects.web.struts.form.PageForm;

public class OrderHandler extends MappingDispatchAction{

	public ActionForward createOrder(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		ActionForward forward = null;
		try{		
				//联系人
				double totalPrice=Double.parseDouble(req.getSession().getAttribute("totalPrice").toString());
				
				User user=(User) req.getSession().getAttribute("user");
				
				String cellPhone=req.getParameter("cellphone");
				String name=req.getParameter("name");
				String street1=req.getParameter("street1");
				
				IUserDao userDao= new UserDaoImpl();
				
				user=userDao.findById(user.getId());
				user.setName(name);
				user.getInfo().setCellPhone(cellPhone);
				user.getInfo().setStreet1(street1);
				
				userDao.update(user);
				
				user=userDao.findById(user.getId());
				
				
				//cost
				double cost=0;
				
				//PayWay
				PayWay payWay=new PayWay();
				Integer payWayId=Integer.parseInt(req.getParameter("payWay"));
				payWay.setId(payWayId);
				
				//这里需要改进
				switch (payWayId) {
				case 1:
					payWay.setPayStyle("现金付款");
					break;
				case 2:
					payWay.setPayStyle("网上付款");
					break;
				default:
					payWay.setPayStyle("电汇付款");
					break;
				}
				
				//orderStatus
				OrderStatus orderStatus=new OrderStatus();
				orderStatus.setId(1);		
				orderStatus.setName("配货状态");
				orderStatus.setDescriptions("单正在配货状态三天内将回应");
				
				
				
				//购物车
				Map shopCart=(Map) req.getSession().getAttribute("shopCart");
				
				System.out.println(shopCart.size());
				//orderlines
				Set orderLines=new HashSet();
				
				Set set=shopCart.entrySet();
				Iterator it=set.iterator();
				while(it.hasNext())
				{
					Entry entry=(Entry) it.next();
					orderLines.add(entry.getValue());
					cost=cost+((OrderLine)entry.getValue()).getProduct().getBasePrice()*((OrderLine)entry.getValue()).getAmount();
				}
				//order
				Order order=new Order();
				order.setName(user.getName());
				order.setUser(user);	
				order.setCost(cost);
				order.setPayWay(payWay);
				order.setStatus(orderStatus);
				
				//orderline里面加入order
				Iterator orderLineIt=orderLines.iterator();
				while(orderLineIt.hasNext())
				{
					OrderLine ol=(OrderLine) orderLineIt.next();
					ol.setOrder(order);
				}
				
				order.setOrderlines(orderLines);
				
				IOrderDao  orderDao=new OrderDaoImpl();
				
				orderDao.addOrder(order);
				
				
				//将shopCart清空
				shopCart.clear();
				totalPrice=0;
				req.getSession().setAttribute("totalPrice", totalPrice);
				req.getSession().setAttribute("order", order);
				req.getSession().setAttribute("shopCart", shopCart);
				req.getSession().setAttribute("user", user);
				
				forward =  mapping.findForward("success");
		}catch(Exception e){
			forward =  mapping.findForward("error");
		}
		
		return forward;
		
	}

	public ActionForward checkOrder(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ActionForward forward = null;
		try{
				User user=(User) req.getSession().getAttribute("user");
				Map shopCart=(Map) req.getSession().getAttribute("shopCart");
				if(user==null)
				{
					req.getSession().getServletContext().getRequestDispatcher("/onlineshopping_jsp/login.jsp").forward(req, resp);	
				}else{
					req.getSession().setAttribute("user", user);
					req.getSession().setAttribute("shopCart", shopCart);
					if(shopCart.size()==0){
						forward =  mapping.findForward("shopcartnull");
					}else{
						forward =  mapping.findForward("checkorder");
					}
				}
		}catch(Exception e){
			forward =  mapping.findForward("error");
		}
		
		return forward;
	}

	public ActionForward orderMoreDetails(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		ActionForward forward = null;
		try{
				Integer orderId=Integer.parseInt(req.getParameter("orderId"));
				User userToContact=(User) req.getSession().getAttribute("userToContact");
				User user=(User) req.getSession().getAttribute("user");
				IOrderDao orderDao=new OrderDaoImpl();
				Order order=orderDao.findById(orderId);
				Set orderLines=order.getOrderlines();
				
				
				
				Map shopCart=(Map) req.getSession().getAttribute("shopCart");
				
				req.getSession().setAttribute("orderLines", orderLines);
				req.getSession().setAttribute("orderId", orderId);
				req.getSession().setAttribute("order", order);
				req.getSession().setAttribute("shopCart", shopCart);
				req.getSession().setAttribute("user", user);
				req.getSession().setAttribute("userToContact", userToContact);
				
				forward=mapping.findForward("orderdetailsmore");
		}catch(Exception e){
				forward=mapping.findForward("error");
		}		
		return forward;
	}

	public ActionForward orderSuccess(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ActionForward forward = null;
		try{	
				User user=(User) req.getSession().getAttribute("user");
				Integer orderId=Integer.parseInt(req.getParameter("orderId"));
				//交易成功
				
				IOrderDao  orderDao=new OrderDaoImpl();
				Order order=orderDao.findById(orderId);
				
				order.getStatus().setId(2);
				order.getStatus().setName("成功状态");
				order.getStatus().setDescriptions("订单交易已成功");
				orderDao.updateOrder(order);
				
				req.getSession().setAttribute("orderId", orderId);
				req.getSession().setAttribute("user", user);
				forward=mapping.findForward("ordersuccess");
				
		}catch(Exception e){
			forward=mapping.findForward("error");
		}
		return forward;
	}

	public ActionForward showUserOrders(ActionMapping mapping, ActionForm form2,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException  {
		ActionForward forward = null;
		try{	
				User user=(User) req.getSession().getAttribute("user");
				IOrderDao  orderDao=new OrderDaoImpl();
				ArrayList userOrdersALL=(ArrayList) orderDao.findAll(user.getName());
								
				PageForm  orderForm = (PageForm)form2;
				if(orderForm.getCurrentPageNo()<=0){
					orderForm.setCurrentPageNo(1);
				}
				if(orderForm.getToPageNo()<=0){
					orderForm.setToPageNo(1);
				}
			
			
			
				int total = orderDao.getTotal(user.getId());
				PageController pc = new PageController(total, orderForm.getToPageNo());
				Collection list = orderDao.find(pc.getPageStartRow(), pc.getPageSize(),user.getId());
				pc.setData(list);
				
				req.getSession().setAttribute("user", user);
				req.setAttribute("pageController", pc);
				req.setAttribute("userOrdersList", list);
				
				forward=mapping.findForward("userorders");
				
				
				/*//后来改的,这里是为了实现order的倒序输出，重写了order中的
				Set userOrdersList=new TreeSet();
				Iterator it=userOrdersALL.iterator();
				while(it.hasNext())
				{
					Order o=(Order) it.next();
					userOrdersList.add(o);
				}
				
				
				req.getSession().setAttribute("user", user);
				req.getSession().setAttribute("userOrdersList", userOrdersList);
				forward=mapping.findForward("userorders");*/
		}catch(Exception e){
				e.printStackTrace();
				forward=mapping.findForward("error");
		}
		return forward;
	}

}
