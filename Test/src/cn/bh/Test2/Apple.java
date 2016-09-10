package cn.bh.Test2;

class Fruit{
	public void info(){
		System.out.println("fruit info...");
	}
}
public class Apple extends Fruit{
	
	@Override
	public void info(){
		System.out.println("apple info...");
	}
	
	@Deprecated
	public void deprecated(){
		System.out.println("apple deprecated...");
	}
	
	public static void main(String []args){
		Fruit f = new Apple();
		f.info();
		
		new Apple().deprecated();
	}
}
