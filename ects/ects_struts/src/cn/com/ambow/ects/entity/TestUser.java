package cn.com.ambow.ects.entity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.com.ambow.ects.util.HibernateUtil;

public class TestUser {
	public static int test(String name) throws Exception{
		Session session = null;
		Transaction tran = null;
		User user =null;
		Query query = null;
		
		try{
			session = HibernateUtil.getSession();
			//开始事务
			tran = session.beginTransaction();
			//do some work
			//hql sql select * from test_user
			String hql ="from User  user where user.name=?";
			query = session.createQuery(hql);
			query.setString(0,name);
			user =(User) query.uniqueResult();
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}finally{
			if(session != null) session.close();
			
		}
		if(user!=null)
			return 0;
		else return 1;
		
		
		
	}

}
