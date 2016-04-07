package cn.com.ambow.ects.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.ambow.ects.dao.IProductDao;
import cn.com.ambow.ects.entity.Order;
import cn.com.ambow.ects.entity.Product;
import cn.com.ambow.ects.entity.User;

public class TestProduct {
	public static void main(String[] args) {
		IProductDao productImpl=new ProductDaoImpl();
		
		
		
		
		
		//这个是对product中的findbyid进行的测试
		/*Product p=productImpl.findById(1);
		
		System.out.println(p.getName());
		System.out.println(p.getCategory().getName());
		System.out.println(p.getCategory().getDescriptions());*/

		//这个是对product中的findall进行的测试
		/*List list=productImpl.findAll();
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Product p=(Product) it.next();
			System.out.println(p.getCategory().getDescriptions());
		}
		
		System.out.println(list.size());*/
		//这个是对product findCategoryId
		/*List list=productImpl.findByCategoryId(1);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Product p=(Product) it.next();
			System.out.println(p.getCategory().getDescriptions());
		}*/
		
	}
}
