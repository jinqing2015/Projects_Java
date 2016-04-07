package cn.com.ambow.ects.entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Order implements Comparable{

	private  Integer  id;
	private  String  name;
	private  double  cost;
	
	private   User   user;
	private   PayWay payWay ;
	private   OrderStatus status ;
	private  Set   orderlines = new HashSet();
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set getOrderlines() {
		return orderlines;
	}
	public void setOrderlines(Set orderlines) {
		this.orderlines = orderlines;
	}
	public PayWay getPayWay() {
		return payWay;
	}
	public void setPayWay(PayWay payWay) {
		this.payWay = payWay;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int  getCount(){
		int  count = 0;
		Iterator it = orderlines.iterator();
		while(it.hasNext()){
			OrderLine line = (OrderLine) it.next();
			count +=  line.getAmount();
		}
		return  count;
	}

	public String toString() {
		return "Order cost=" + cost + ", id=" + id + ", name=" + name
				+ ", orderlines=" + orderlines + ", payWay=" + payWay
				+ ", status=" + status + ", user=" + user;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (Double.doubleToLongBits(cost) != Double
				.doubleToLongBits(other.cost))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public int compareTo(Object o) {
		Order order=(Order) o;
		if(this.id>order.getId())
			return -1;
		else
			return 1;
	}
	
}
