package cn.com.ambow.ects.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import cn.com.ambow.ects.dao.IOrderDao;
import cn.com.ambow.ects.entity.Order;
import cn.com.ambow.ects.entity.OrderLine;
import cn.com.ambow.ects.entity.User;
import cn.com.ambow.ects.exception.ManagerOrderException;
import cn.com.ambow.ects.exception.ManagerProductException;
import cn.com.ambow.ects.exception.ManagerUserException;
import cn.com.ambow.ects.util.HibernateUtil;

public class OrderDaoImpl implements IOrderDao {

	public void addOrder(Order order) throws ManagerOrderException {
		Session session=null;
		Transaction tran=null;
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			session.save(order);
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}finally{
			HibernateUtil.closeSession(session);
		}

	}

	public List findAll(String userName) throws ManagerOrderException {
		Session session = null;
		Transaction tran = null;
		List list = new ArrayList();
		Query query = null;
		UserDaoImpl userdaoimpl=new UserDaoImpl();
		//
		User user=userdaoimpl.findByName(userName);
		int user_id=user.getId();
		System.out.println(user_id);
		
		try{
			session = HibernateUtil.getSession();
			//开始事务
			tran = session.beginTransaction();
			//do some work
			//hql sql select * from test_user
			String hql ="from Order order where order.user=?";
			query = session.createQuery(hql);
			query.setInteger(0, user_id);
			list = query.list();
			Iterator it=list.iterator();
			while(it.hasNext())
			{
				Order order= (Order) it.next();
				Hibernate.initialize(order.getUser().getInfo().getCountry());
				Hibernate.initialize(order.getUser().getInfo().getProvince().getCountry());
				Hibernate.initialize(order.getUser().getInfo().getProvince());
				Hibernate.initialize(order.getUser().getInfo());
				Hibernate.initialize(order.getUser());
				Hibernate.initialize(order.getPayWay());
				Hibernate.initialize(order.getStatus());
				Iterator it1=order.getOrderlines().iterator();
				while(it1.hasNext())
				{
					OrderLine ol=(OrderLine) it1.next();
					Hibernate.initialize(ol.getProduct().getCategory());
					Hibernate.initialize(ol.getProduct());
					
				}
				
				Hibernate.initialize(order.getOrderlines());				
			}
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}finally{
			if(session != null) session.close();
			
		}
		return list;

	}

	public Order findById(Integer id) throws ManagerOrderException {
		Session session=null;
		Transaction tran=null;
		Query query=null;
		Order order=null;
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			String hql="from Order order where order.id=?";
			query=session.createQuery(hql);
			query.setInteger(0, id);
			order=(Order) query.uniqueResult();
			//这个地方也是
			Hibernate.initialize(order.getUser().getInfo().getCountry());
			Hibernate.initialize(order.getUser().getInfo().getProvince().getCountry());
			Hibernate.initialize(order.getUser().getInfo().getProvince());
			Hibernate.initialize(order.getUser().getInfo());
			Hibernate.initialize(order.getUser());
			Hibernate.initialize(order.getPayWay());
			Hibernate.initialize(order.getStatus());
			Iterator it=order.getOrderlines().iterator();
			while(it.hasNext())
			{
				OrderLine ol=(OrderLine) it.next();
				Hibernate.initialize(ol.getProduct().getCategory());
				Hibernate.initialize(ol.getProduct());
				
			}
			
			Hibernate.initialize(order.getOrderlines());
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
			
		}finally{
			HibernateUtil.closeSession(session);
		}
		
		return order;
	}
	public Order findByName(String name) throws ManagerOrderException {
		Session session=null;
		Transaction tran=null;
		Query query=null;
		Order order=null;
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			String hql="from Order order where order.name=?";
			query=session.createQuery(hql);
			query.setString(0, name);
			order=(Order) query.uniqueResult();
			//这个地方也是
			Hibernate.initialize(order.getUser().getInfo().getCountry());
			Hibernate.initialize(order.getUser().getInfo().getProvince().getCountry());
			Hibernate.initialize(order.getUser().getInfo().getProvince());
			Hibernate.initialize(order.getUser().getInfo());
			Hibernate.initialize(order.getUser());
			Hibernate.initialize(order.getPayWay());
			Hibernate.initialize(order.getStatus());
			Iterator it=order.getOrderlines().iterator();
			while(it.hasNext())
			{
				OrderLine ol=(OrderLine) it.next();
				Hibernate.initialize(ol.getProduct().getCategory());
				Hibernate.initialize(ol.getProduct());
				
			}
			
			Hibernate.initialize(order.getOrderlines());
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
			
		}finally{
			HibernateUtil.closeSession(session);
		}
		
		return order;
	}

	public void updateOrder(Order order) {
		
		Session session=null;
		Transaction tran=null;
		try{
				session=HibernateUtil.getSession();
				tran=session.beginTransaction();
				session.update(order);
				tran.commit();
		}catch(Exception e){
				e.printStackTrace();
				tran.rollback();
		}finally{
				HibernateUtil.closeSession(session);
		}
			
		
		
	}

	public Collection find(int start, int max,Integer userId) throws ManagerProductException {
		Session session = null;
		Transaction tran = null;
		Collection list = null;
		Query query = null;
		try {
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();

			String hql ="from Order order where order.user.id=?";
			query = session.createQuery(hql);
			
			System.out.println(hql);
			query.setInteger(0, userId);							
			query.setFirstResult(start);
			query.setMaxResults(max);
			list = query.list();
			System.out.println("==============================================="+list.size());
			Iterator it=list.iterator();
			while(it.hasNext())
			{
				Order order= (Order) it.next();
				Hibernate.initialize(order.getUser().getInfo().getCountry());
				Hibernate.initialize(order.getUser().getInfo().getProvince().getCountry());
				Hibernate.initialize(order.getUser().getInfo().getProvince());
				Hibernate.initialize(order.getUser().getInfo());
				Hibernate.initialize(order.getUser());
				Hibernate.initialize(order.getPayWay());
				Hibernate.initialize(order.getStatus());
				Iterator it1=order.getOrderlines().iterator();
				while(it1.hasNext())
				{
					OrderLine ol=(OrderLine) it1.next();
					Hibernate.initialize(ol.getProduct().getCategory());
					Hibernate.initialize(ol.getProduct());
					
				}
				
				Hibernate.initialize(order.getOrderlines());		
			
			}
			tran.commit();
		}catch (Exception e) {
			tran.rollback();
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession(session);
			
		}
		return list;
	}
	/*public static void main(String[] args) {
		List list=(List) new OrderDaoImpl().find(1, 5, 39);
		System.out.println(list.size());
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Order o=(Order) it.next();
			System.out.println(o.getId());
			Set ol=o.getOrderlines();
			System.out.println(ol.size());
			
		}
		System.out.println();
	}*/

	public int getTotal(Integer id) throws ManagerProductException {
		Session session = null;
		Transaction tran = null;
		List list = new ArrayList();
		Query query = null;
		int total=0;
		
		try{
			session = HibernateUtil.getSession();
			//开始事务
			tran = session.beginTransaction();
			//do some work
			//hql sql select * from test_user
			String hql ="from Order order where order.user=?";
			query = session.createQuery(hql);
			query.setInteger(0,id);
			list = query.list();
			Iterator it=list.iterator();
			while(it.hasNext())
			{
				Order order= (Order) it.next();
				Hibernate.initialize(order.getUser().getInfo().getCountry());
				Hibernate.initialize(order.getUser().getInfo().getProvince().getCountry());
				Hibernate.initialize(order.getUser().getInfo().getProvince());
				Hibernate.initialize(order.getUser().getInfo());
				Hibernate.initialize(order.getUser());
				Hibernate.initialize(order.getPayWay());
				Hibernate.initialize(order.getStatus());
				Iterator it1=order.getOrderlines().iterator();
				while(it1.hasNext())
				{
					OrderLine ol=(OrderLine) it1.next();
					Hibernate.initialize(ol.getProduct().getCategory());
					Hibernate.initialize(ol.getProduct());
					
				}
				
				Hibernate.initialize(order.getOrderlines());				
			}
			total=list.size();
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}finally{
			HibernateUtil.closeSession(session);
			return total;
		}
		
		
	}


	
}
