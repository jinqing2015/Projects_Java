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
   
	//此方法用于根据条件动态查询商品信息
	/*public  List   find(Product product,int start,int max)throws ManagerProductException;
	public  int   getTotal(Product product)throws  ManagerProductException;*/
}
