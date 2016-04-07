package cn.com.ambow.ects.dao;

import java.util.Collection;
import java.util.List;

import cn.com.ambow.ects.entity.Product;
import cn.com.ambow.ects.exception.ManagerProductException;


public interface IProductDao {

	public  Product  findById(Integer  id )throws ManagerProductException;
	public  Product  findByName(String name)throws ManagerProductException;
	public  List   findAll( )throws ManagerProductException;
	public List findByCategoryId(Integer  id )throws ManagerProductException;
	
	public  Collection   find(int start, int max)throws  ManagerProductException;
	public  int   getTotal()throws  ManagerProductException;
   
	//�˷������ڸ���������̬��ѯ��Ʒ��Ϣ
	/*public  List   find(Product product,int start,int max)throws ManagerProductException;
	public  int   getTotal(Product product)throws  ManagerProductException;*/
}
