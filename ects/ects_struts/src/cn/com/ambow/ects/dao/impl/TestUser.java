package cn.com.ambow.ects.dao.impl;

import cn.com.ambow.ects.dao.IUserDao;
import cn.com.ambow.ects.entity.ContcatInfo;
import cn.com.ambow.ects.entity.Country;
import cn.com.ambow.ects.entity.Province;
import cn.com.ambow.ects.entity.User;

public class TestUser {

	public static void main(String[] args) {
		IUserDao userDaoImpl=new UserDaoImpl();
		
		//����user��update�����Һ�ʡ�����ڹ�ϵ�ǵ���ģ������Ǹ��Ĳ��˵�
		/*Country country =new Country();
		country.setId(2);
		country.setName("����");
		
		Province province =new Province();
		province.setCountry(country);
		province.setId(100);
		province.setName("������");
		
		User user=userDaoImpl.findById(17);
		user.setName("admin3");
		
		ContcatInfo cInfo=user.getInfo();
		cInfo.setCellPhone("test_ten");
		cInfo.setCity("qingdao");
		cInfo.setCountry(country);
		cInfo.setProvince(province);
		
		cInfo.setUser(user);

		user.setInfo(cInfo);
		
		userDaoImpl.update(user);*/
		
				
		//����user�е�login
		/*User user=userDaoImpl.login("admin2","admin2");
		System.out.println(user.getName());
		System.out.println(user.getInfo().getCellPhone());
		System.out.println(user.getInfo().getCountry().getName());
		System.out.println(user.getInfo().getProvince().getName());
		System.out.println(user.getInfo().getProvince().getCountry().getName());*/
		
		
		//����user�е�findbyid
		/*User user=userDaoImpl.findById(17);
		
		System.out.println(user.getName());
		System.out.println(user.getInfo().getCellPhone());
		System.out.println(user.getInfo().getCountry().getName());
		System.out.println(user.getInfo().getProvince().getName());
		*/

		//����user�е�add����
		/*Country country =new Country();
		country.setId(1);
		country.setName("�й�");
		
		Province province =new Province();
		province.setCountry(country);
		province.setId(25);
		province.setName("ɽ��");
		
		User user = new User();
		user.setName("test7");
		user.setPasswd("test7");
		
		ContcatInfo cInfo=new ContcatInfo();
		cInfo.setCellPhone("test7");
		cInfo.setCity("qingdao7");
		cInfo.setCountry(country);
		cInfo.setProvince(province);
		
		cInfo.setUser(user);
		
		user.setInfo(cInfo);

		userDaoImpl.add(user);*/
		
		
	}
	
	
}
