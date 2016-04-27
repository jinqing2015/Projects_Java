package cn.schema.simplefactory;

public abstract class Pizza {

	String name;
	
	public void prepare(){
		System.out.println(name + "prepare");
	}
	public void bake(){
		System.out.println(name + "bake");
	}
	public void cut(){
		System.out.println(name + "cut");
	}
	public void box(){
		System.out.println(name + "box");
	}
	
}
