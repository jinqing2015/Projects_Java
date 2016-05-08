package cn.schema.Singleton;

//ͬ��getInstance����
public class Singleton {

	private static Singleton uniqueInstance;
	
	private Singleton(){};
	
	//��һ�ַ�ʽ
	public static synchronized Singleton getInstance(){
		
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
}
