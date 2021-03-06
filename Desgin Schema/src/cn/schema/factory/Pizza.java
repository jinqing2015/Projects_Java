package cn.schema.factory;

import java.util.ArrayList;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList tops = new ArrayList();
	
	public void prepare(){
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough ...");
		System.out.println("Adding sauce ...");
		System.out.println("Adding topping ...");
		for(int i = 0; i<tops.size(); i++)
			System.out.println("Adding " + tops.get(i));
	}
	
	public void bake(){
		System.out.println(name + " bake");
	}
	
	public void cut(){
		System.out.println(name + " cut");
	}
	
	public void box(){
		System.out.println(name + " box");
	}
	
}
