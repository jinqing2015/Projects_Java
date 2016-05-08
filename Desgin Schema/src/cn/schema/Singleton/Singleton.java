package cn.schema.Singleton;

//同步getInstance方法
public class Singleton {

	private static Singleton uniqueInstance;
	
	private Singleton(){};
	
	//第一种方式
	public static synchronized Singleton getInstance(){
		
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
}
