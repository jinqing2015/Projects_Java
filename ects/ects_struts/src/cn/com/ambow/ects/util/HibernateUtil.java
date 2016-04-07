package cn.com.ambow.ects.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sf = null;
	
	static{
		//读取hibernate.cfg.xml这个代码要求hibernate.cfg.xml必须在src目录下
		Configuration cfg = new Configuration().configure();
		//创建sessionFactory
		sf = cfg.buildSessionFactory();
		
	}

	public static Session getSession(){
		
		return sf.openSession();
	}
	public static void closeSession(Session session){
		if(session != null) session.close();
	} 
}






