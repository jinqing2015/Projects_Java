package cn.com.ambow.ects.dao.impl;


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.hibernate.CacheMode;
import org.hibernate.FlushMode;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.type.Type;

import cn.com.ambow.ects.dao.IUserDao;
import cn.com.ambow.ects.entity.User;
import cn.com.ambow.ects.exception.ManagerUserException;
import cn.com.ambow.ects.util.HibernateUtil;

public class UserDaoImpl implements IUserDao{

	public void add(User user) throws ManagerUserException {
		Session session=null;
		Transaction tran=null;
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			session.save(user);
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}finally{
			HibernateUtil.closeSession(session);
		}
		
	}

	public User findById(Integer id) throws ManagerUserException {
		Session session=null;
		Transaction tran=null;
		Query query=null;
		User user=null;
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			//select * from user where user_id=id
			String hql="from User user where user.id=?";
			query=session.createQuery(hql);
			query.setInteger(0, id);
			user=(User) query.uniqueResult();
			Hibernate.initialize(user.getInfo().getCountry());
			Hibernate.initialize(user.getInfo().getProvince().getCountry());
			Hibernate.initialize(user.getInfo().getProvince());
			Hibernate.initialize(user.getInfo());
			
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
			
		}finally{
			HibernateUtil.closeSession(session);
		}
		return user;
	}

	public User login(String name, String passwd) throws ManagerUserException {
		Session session= null;
		Transaction tran=null;
		Query query=null;
		User user=null;
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			//select * from user where name=? and passwd=?
			String hql="from User user where user.name=? and user.passwd=?";
			query=session.createQuery(hql);
			query.setString(0, name);
			query.setString(1, passwd);
			user=(User) query.uniqueResult();
			Hibernate.initialize(user.getInfo().getCountry());
			Hibernate.initialize(user.getInfo().getProvince().getCountry());
			Hibernate.initialize(user.getInfo().getProvince());
			Hibernate.initialize(user.getInfo());
			tran.commit();
		}catch(Exception e){ 
			e.printStackTrace();
			tran.rollback();
		}finally{
			HibernateUtil.closeSession(session);
		}
		return user;
}

	public void update(User user) throws ManagerUserException {
		Session session=null;
		Transaction tran=null;
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			session.update(user);
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}finally{
			HibernateUtil.closeSession(session);
		}
		
	}
	
	public User findByName(String name) throws ManagerUserException {
		Session session=null;
		Transaction tran=null;
		Query query=null;
		User user=null;
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			//select * from user where user_id=id
			String hql="from User user where user.name=?";
			query=session.createQuery(hql);
			query.setString(0, name);
			user=(User) query.uniqueResult();
			Hibernate.initialize(user.getInfo().getCountry());
			Hibernate.initialize(user.getInfo().getProvince().getCountry());
			Hibernate.initialize(user.getInfo().getProvince());
			Hibernate.initialize(user.getInfo());
			
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}finally{
			HibernateUtil.closeSession(session);
		}
		return user;
	}

}
