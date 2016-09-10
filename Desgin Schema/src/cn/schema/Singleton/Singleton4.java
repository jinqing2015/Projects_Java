package cn.schema.Singleton;

import java.io.Serializable;

public class Singleton4 implements Serializable{

	private Singleton4(){}
	
	private static final Singleton4 INSTANCE = new Singleton4();
	
	public Singleton4 getInstance(){
		return INSTANCE;
	}
	
	//为了防止反序列化时产生多个实例对象，导致假冒的单例
	private Object readResolve(){
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
