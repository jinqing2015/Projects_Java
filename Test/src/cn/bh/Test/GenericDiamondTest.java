package cn.bh.Test;

class MyClass<E>{

	public <T> MyClass(T t){
		System.out.println(t);
	}
}

public class GenericDiamondTest {

	public static void main(String args[]){
		
		MyClass<String> m1 = new MyClass<>(5);
		
		MyClass<String> m2 = new <Integer>MyClass<String>(6);
		
		//如果程序显式指定了泛型构造器中声明的类型参数的实际类型，则不可以使用“菱形”语法
		//MyClass<String> m3 = new <Integer>MyClass<>(7);

	}
}
