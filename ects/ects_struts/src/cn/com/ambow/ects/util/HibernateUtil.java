package cn.com.ambow.ects.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sf = null;
	
	static{
		//��ȡhibernate.cfg.xml�������Ҫ��hibernate.cfg.xml������srcĿ¼��
		Configuration cfg = new Configuration().configure();
		//����sessionFactory
		sf = cfg.buildSessionFactory();
		
	}

	public static Session getSession(){
		
		return sf.openSession();
	}
	public static void closeSession(Session session){
		if(session != null) session.close();
	} 
}






