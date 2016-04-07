package cn.com.ambow.ects.web.servlet.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import cn.com.ambow.ects.dao.IProductDao;
import cn.com.ambow.ects.dao.impl.ProductDaoImpl;
import cn.com.ambow.ects.entity.Product;
import cn.com.ambow.ects.web.controller.PageController;
import cn.com.ambow.ects.web.struts.form.PageForm;

public class ProductHandler extends MappingDispatchAction{

	public ActionForward productList(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException  {
		ActionForward forward = null;
		try{

			Integer id=Integer.parseInt((String)req.getParameter("categoryId"));			
			List productList=new ProductDaoImpl().findByCategoryId(id);
			req.getSession().setAttribute("productList", productList);
			if(id==1){
				forward =  mapping.findForward("success1");
			}
			if(id==2){
				forward =  mapping.findForward("success2");
			}
		}catch(Exception e){
			forward =  mapping.findForward("error");
		}
		return forward;
	}

	public ActionForward productById(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		ActionForward forward = null;
		try{
			Integer id=Integer.parseInt((String) req.getParameter("id"));
			IProductDao productDao=new ProductDaoImpl();
			
			Product p=productDao.findById(id);
			req.getSession().setAttribute("product", p);
			forward =  mapping.findForward("success");
		}catch(Exception e){
			forward =  mapping.findForward("error");
		}
		return forward;
	}
	public ActionForward findAll(ActionMapping mapping, ActionForm form1,javax.servlet.http.HttpServletRequest request,javax.servlet.http.HttpServletResponse response)
			throws java.lang.Exception {
		try{
			PageForm  form = (PageForm)form1;
			if(form.getCurrentPageNo()<=0){
				form.setCurrentPageNo(1);
			}
			if(form.getToPageNo()<=0){
				form.setToPageNo(1);
			}
			IProductDao productDao=new ProductDaoImpl();
			int total = productDao.getTotal();
			PageController pc = new PageController(total, form.getToPageNo());
			Collection list = productDao.find(pc.getPageStartRow(), pc.getPageSize());
			pc.setData(list);
			request.setAttribute("pageController", pc);
			request.setAttribute("productList", list);
		//Collection list = biz.findAll();
		//request.setAttribute("list",list);
		}catch(Exception e){
			e.printStackTrace();
			return mapping.findForward("error");
		}
		
		return mapping.findForward("showlist");
		
		
	}
	public ActionForward productByName(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		ActionForward forward = null;
		try{
			String name= req.getParameter("search");
			IProductDao productDao=new ProductDaoImpl();
			
			Product p=productDao.findByName(name);
			req.getSession().setAttribute("product", p);
			System.out.println(p.getImages());
			forward =  mapping.findForward("success");
		}catch(Exception e){
			forward =  mapping.findForward("error");
		}
		return forward;
	}
	public ActionForward productListForSale(ActionMapping mapping, ActionForm form1,javax.servlet.http.HttpServletRequest req,javax.servlet.http.HttpServletResponse resp)
	throws java.lang.Exception {

		ActionForward forward = null;
		try{
			
			IProductDao productDao=new ProductDaoImpl();
			
			List list=productDao.findAll();
			Set set=new TreeSet();
			
			Iterator it=list.iterator();
			while(it.hasNext())
			{
				Product p=(Product) it.next();
				set.add(p);
				
			}
			System.out.println("===================================");
			req.getSession().setAttribute("set", set);
			forward =  mapping.findForward("success");
		}catch(Exception e){
			e.printStackTrace();
			forward =  mapping.findForward("error");
		}
		return forward;


}
	
	

}
