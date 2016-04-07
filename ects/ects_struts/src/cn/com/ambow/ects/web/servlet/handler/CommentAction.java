package cn.com.ambow.ects.web.servlet.handler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import cn.com.ambow.ects.dao.IComment;
import cn.com.ambow.ects.dao.IProductDao;
import cn.com.ambow.ects.dao.impl.CommentDaoImpl;
import cn.com.ambow.ects.dao.impl.ProductDaoImpl;
import cn.com.ambow.ects.entity.Comment;
import cn.com.ambow.ects.entity.Product;
import cn.com.ambow.ects.entity.User;

public class CommentAction extends MappingDispatchAction{

	public ActionForward addComment(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		req.setCharacterEncoding("gbk");
		resp.setCharacterEncoding("gbk");
		Comment comment = new Comment();
		
		comment.setComment(req.getParameter("comment"));
		System.out.println("====="+req.getParameter("comment"));
		comment.setUserName(((User)req.getSession().getAttribute("user")).getName());
		
		comment.setProductId((Integer)req.getSession().getAttribute("productId"));
		
		IComment dao = new CommentDaoImpl();
		dao.addComment(comment);
		
		return mapping.findForward("success");
	}
	
	public ActionForward findAllComment(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		
		IComment dao = new CommentDaoImpl();
		
		List commentList = dao.findByProduct(Integer.parseInt(req.getParameter("productId")));
		
		req.getSession().setAttribute("commentList", commentList);
		
		return mapping.findForward("success");
	}
	
	public ActionForward turnToComment(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		
		Integer productId= Integer.parseInt(req.getParameter("productId"));
		
		IProductDao productDao=new ProductDaoImpl();
		Product product=productDao.findById(productId);
		
		req.getSession().setAttribute("product",product);
		req.getSession().setAttribute("productId",productId);
		System.out.println(Integer.parseInt(req.getParameter("productId")) + "turnToCommentturnToCommentturnToCommentturnToComment");
		return mapping.findForward("success");
	}

}
