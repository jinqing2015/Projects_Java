package cn.com.ambow.ects.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.com.ambow.ects.dao.IProductDao;
import cn.com.ambow.ects.entity.Product;
import cn.com.ambow.ects.entity.User;
import cn.com.ambow.ects.exception.ManagerProductException;
import cn.com.ambow.ects.util.HibernateUtil;

public class ProductDaoImpl implements IProductDao{

	public List findAll() throws ManagerProductException {
		Session session=null;
		Transaction tran=null;
		Query query =null;
		List list=new ArrayList();
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			//select * from product
			String hql="from Product";
			query=session.createQuery(hql);
			list=query.list();
			Iterator it=list.iterator();
			while(it.hasNext())//这个地方是对product中的category进行初始化
			{
				Product p=(Product) it.next();
				Hibernate.initialize(p.getCategory());
			}
			
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}finally{
			HibernateUtil.closeSession(session);
		}
		return list;
		
	}

	public Product findById(Integer id) throws ManagerProductException {
		Session session=null;
		Transaction tran=null;
		Query query=null;
		Product product=null;
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			//select * from product where product_id=id
			String hql="from Product product where product.id=?";
			query=session.createQuery(hql);
			query.setInteger(0, id);
			product=(Product) query.uniqueResult();
			Hibernate.initialize(product.getCategory());//这个很重要
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
			
		}finally{
			HibernateUtil.closeSession(session);
		}
		
		return product;
	}

	public List findByCategoryId(Integer id) throws ManagerProductException {
		Session session=null;
		Transaction tran=null;
		Query query =null;
		List list=new ArrayList();
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			String hql="from Product product where product.category=?";
			query=session.createQuery(hql);
			query.setInteger(0, id);
			list=query.list();
			Iterator it=list.iterator();
			while(it.hasNext())//这个地方是对product中的category进行初始化
			{
				Product p=(Product) it.next();
				Hibernate.initialize(p.getCategory());
			}
			
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}finally{
			HibernateUtil.closeSession(session);
		}
		return list;
	}

	public Collection find(int start, int max) throws ManagerProductException {
		Session session = null;
		Transaction tran = null;
		Collection list = null;
		try {
			session = HibernateUtil.getSession();
			tran = session.beginTransaction();
			Query query = session.createQuery(" from Product ");
			query.setFirstResult(start);
			query.setMaxResults(max);
			list = query.list();
			tran.commit();
		} catch (Exception e) {
			tran.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			return list;
		}
		
	}

	public int getTotal() throws ManagerProductException {
		Session session = null;
		Transaction tran = null;
		int total = 0;
		try {
			session = HibernateUtil.getSession();
			tran = session.beginTransaction();
			Query query = session.createQuery("select count(*) from Product ");
			//这个地方老师的出问题
			total = Integer.parseInt(query.uniqueResult().toString());
			tran.commit();
		} catch (Exception e) {
			tran.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			return total;
		}
	}
	public Product findByName(String name) throws ManagerProductException {
		Session session=null;
		Transaction tran=null;
		Query query=null;
		Product product=null;
		try{
			session=HibernateUtil.getSession();
			tran=session.beginTransaction();
			System.out.println("=========================="+name);
			//select * from product where product_id=id
			String hql="from Product product where product.name=?";
			query=session.createQuery(hql);
			query.setString(0, name);
			product=(Product) query.uniqueResult();
			Hibernate.initialize(product.getCategory());//这个很重要
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
			
		}finally{
			HibernateUtil.closeSession(session);
		}
		
		return product;
	}
	/*public static void main(String[] args) {
		IProductDao  pd=new ProductDaoImpl();
		Product p=pd.findByName("别墅4");
		
		System.out.println(p.getImages());
	}*/
}
