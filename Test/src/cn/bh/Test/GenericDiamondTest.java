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
		
		//���������ʽָ���˷��͹����������������Ͳ�����ʵ�����ͣ��򲻿���ʹ�á����Ρ��﷨
		//MyClass<String> m3 = new <Integer>MyClass<>(7);

	}
}
