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
		
		
		
		
		
		//����Ƕ�product�е�findbyid���еĲ���
		/*Product p=productImpl.findById(1);
		
		System.out.println(p.getName());
		System.out.println(p.getCategory().getName());
		System.out.println(p.getCategory().getDescriptions());*/

		//����Ƕ�product�е�findall���еĲ���
		/*List list=productImpl.findAll();
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Product p=(Product) it.next();
			System.out.println(p.getCategory().getDescriptions());
		}
		
		System.out.println(list.size());*/
		//����Ƕ�product findCategoryId
		/*List list=productImpl.findByCategoryId(1);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Product p=(Product) it.next();
			System.out.println(p.getCategory().getDescriptions());
		}*/
		
	}
}
