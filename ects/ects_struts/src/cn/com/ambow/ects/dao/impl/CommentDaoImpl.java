package cn.com.ambow.ects.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.com.ambow.ects.dao.IComment;
import cn.com.ambow.ects.entity.Comment;
import cn.com.ambow.ects.entity.Order;
import cn.com.ambow.ects.entity.OrderLine;
import cn.com.ambow.ects.entity.User;
import cn.com.ambow.ects.exception.ManagerOrderException;
import cn.com.ambow.ects.util.HibernateUtil;

public class CommentDaoImpl implements IComment{

	public void addComment(Comment comment) {
		Session session=null;
		Transaction tran=null;
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			session.save(comment);
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}finally{
			HibernateUtil.closeSession(session);
		}

		
	}

	public List findByProduct(int pid) {
		Session session = null;
		Transaction tran = null;
		List list = new ArrayList();
		Query query = null;
		
		try{
			session = HibernateUtil.getSession();
			//开始事务
			tran = session.beginTransaction();
			//do some work
			//hql sql select * from test_user
			String hql ="from Comment comment where comment.productId=?";
			query = session.createQuery(hql);
			query.setInteger(0, pid);
			list = query.list();
			
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}finally{
			if(session != null) session.close();
			
		}
		return list;

	}

	public static void main(String[] args) {
		IComment dao = new CommentDaoImpl();
		
		List list  = new ArrayList();
		list = dao.findByProduct(2);
		Iterator it = list.iterator();
		while(it.hasNext()){
			Comment comment = (Comment)it.next();
			System.out.println(comment.getComment());
		}
	}
	
}
