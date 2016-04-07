package cn.com.ambow.ects.dao.impl;

import cn.com.ambow.ects.dao.IUserDao;
import cn.com.ambow.ects.entity.ContcatInfo;
import cn.com.ambow.ects.entity.Country;
import cn.com.ambow.ects.entity.Province;
import cn.com.ambow.ects.entity.User;

public class TestUser {

	public static void main(String[] args) {
		IUserDao userDaoImpl=new UserDaoImpl();
		
		//测试user的update，国家和省份由于关系是单向的，所以是更改不了的
		/*Country country =new Country();
		country.setId(2);
		country.setName("美国");
		
		Province province =new Province();
		province.setCountry(country);
		province.setId(100);
		province.setName("夏威夷");
		
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
		
				
		//测试user中的login
		/*User user=userDaoImpl.login("admin2","admin2");
		System.out.println(user.getName());
		System.out.println(user.getInfo().getCellPhone());
		System.out.println(user.getInfo().getCountry().getName());
		System.out.println(user.getInfo().getProvince().getName());
		System.out.println(user.getInfo().getProvince().getCountry().getName());*/
		
		
		//测试user中的findbyid
		/*User user=userDaoImpl.findById(17);
		
		System.out.println(user.getName());
		System.out.println(user.getInfo().getCellPhone());
		System.out.println(user.getInfo().getCountry().getName());
		System.out.println(user.getInfo().getProvince().getName());
		*/

		//测试user中的add方法
		/*Country country =new Country();
		country.setId(1);
		country.setName("中国");
		
		Province province =new Province();
		province.setCountry(country);
		province.setId(25);
		province.setName("山东");
		
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
