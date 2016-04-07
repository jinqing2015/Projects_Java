package cn.com.ambow.ects.dao;
import java.util.Collection;
import java.util.List;

import cn.com.ambow.ects.entity.Order;
import cn.com.ambow.ects.exception.ManagerOrderException;
import cn.com.ambow.ects.exception.ManagerProductException;


public interface  IOrderDao {

	public  void  addOrder(Order order)throws ManagerOrderException;
	public  List  findAll(String   user_name)throws ManagerOrderException;
	public  Order  findById(Integer id)throws  ManagerOrderException;
	public Order findByName(String name) throws ManagerOrderException;
	public void updateOrder(Order order);
	
	public  Collection   find(int start, int max,Integer id)throws  ManagerProductException;
	public  int   getTotal(Integer id)throws  ManagerProductException;
	//¶¯Ì¬²éÑ¯
	//public  Collection  findAll(Order order);
}
