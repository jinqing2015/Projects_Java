package cn.com.ambow.ects.entity;

import java.io.Serializable;

public class Product implements  Serializable,Comparable{

	private   Integer   id;
	private  String  name="";//�˴���Ĭ��ֵ���㶯̬��ѯ
	private  String  author="";//�˴���Ĭ��ֵ���㶯̬��ѯ
	private  int     pages;
	private  String  images;
	private  String  publish="";//�˴���Ĭ��ֵ���㶯̬��ѯ
	private  double  basePrice;
	private   String descriptions;
	private  Category  category;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public int compareTo(Object o) {
		Product p=(Product)o;
		
		if(this.pages>p.getPages())
			return -1;
		else
			return 1;
	}
	
	
}
