package cn.com.ambow.ects.web.servlet.handler;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
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
import cn.com.ambow.ects.dao.impl.OrderDaoImpl;
import cn.com.ambow.ects.dao.impl.ProductDaoImpl;
import cn.com.ambow.ects.entity.Order;
import cn.com.ambow.ects.entity.OrderLine;
import cn.com.ambow.ects.entity.Product;

public class ShoppingCarHandler extends MappingDispatchAction{

	public ActionForward ShowShopCart(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		
		ActionForward forward = null;
		
		Map shopCart=(Map) req.getSession().getAttribute("shopCart");
		req.getSession().setAttribute("shopCart", shopCart);
		forward =  mapping.findForward("success");
		
		return forward;
	}

	public ActionForward AddToCart(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException  {
		
		ActionForward forward = null;
		try{
				Integer id=Integer.parseInt(req.getParameter("id"));
				Map shopCart=(Map) req.getSession().getAttribute("shopCart");
				double totalPrice=Double.parseDouble(req.getSession().getAttribute("totalPrice").toString());
				OrderLine orderLine=null;
				
				if(shopCart.containsKey(id))
				{
					orderLine=(OrderLine) shopCart.get(id);
					orderLine.setAmount(orderLine.getAmount()+1);
				}else{
					IProductDao productDao=new ProductDaoImpl();
					Product product=productDao.findById(id);
					orderLine=new OrderLine();
					orderLine.setProduct(product);
					orderLine.setAmount(1);
					
					shopCart.put(id, orderLine);
				}
				
				//这里只要加入一个产品，就把这个产品的单价加入到总价中
				totalPrice=totalPrice+orderLine.getProduct().getBasePrice();
				req.getSession().setAttribute("totalPrice",totalPrice);
				req.getSession().setAttribute("shopCart", shopCart);
				forward =  mapping.findForward("success");
				
		}catch(Exception e){
			forward =  mapping.findForward("error");
		}
		return forward;
		
	}

	public ActionForward DeleteFromCart(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException  {
		ActionForward forward = null;
		try{
				Integer id=Integer.parseInt(req.getParameter("id"));
				Map shopCart=(Map) req.getSession().getAttribute("shopCart");
				
				//如果一个orderline的商品删除，则将总价减去这一行的价格
				double totalPrice=Double.parseDouble(req.getSession().getAttribute("totalPrice").toString());
				OrderLine orderLine=(OrderLine) shopCart.get(id);
				totalPrice=totalPrice-orderLine.getProduct().getBasePrice()*orderLine.getAmount();		
				
				shopCart.remove(id);
				req.getSession().setAttribute("totalPrice", totalPrice);
				req.getSession().setAttribute("shopCart", shopCart);
				forward =  mapping.findForward("success");
		}catch(Exception e){
				forward =  mapping.findForward("error");
		}
		
		return forward;
	}
	public ActionForward AddAmount(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ActionForward forward = null;
		
		double totalPrice=Double.parseDouble(req.getSession().getAttribute("totalPrice").toString());
		Integer id=Integer.parseInt(req.getParameter("id"));
		Map shopCart=(Map) req.getSession().getAttribute("shopCart");
		String amount=req.getParameter("amount");
		
		int num = Integer.parseInt(amount);
		
		OrderLine orderLine=(OrderLine) shopCart.get(id);
		orderLine.setAmount(num+1);
		
		//这里算总价
		double total=0;
		Set set=shopCart.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Entry entry=(Entry) it.next();
			OrderLine ol=(OrderLine) entry.getValue();		
			total=total+ol.getProduct().getBasePrice()*ol.getAmount();
		}
		totalPrice=total;
		req.getSession().setAttribute("totalPrice", totalPrice);
		req.getSession().setAttribute("shopCart", shopCart);
		forward=mapping.findForward("myorder");
		return forward;
	}
	public ActionForward ClearShopCart(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException  {
		ActionForward forward = null;
		
		Map shopCart=(Map) req.getSession().getAttribute("shopCart");		
		double totalPrice=Double.parseDouble(req.getSession().getAttribute("totalPrice").toString());		
		
		shopCart.clear();
		totalPrice=0;
		
		req.getSession().setAttribute("totalPrice", totalPrice);
		req.getSession().setAttribute("shopCart", shopCart);
		forward =  mapping.findForward("success");		
		return forward;
	}
		

}
