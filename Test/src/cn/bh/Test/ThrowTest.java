package cn.bh.Test;

import java.io.*;

public class ThrowTest {

	public static void main(String arsg[]){
		
		try {
			throwChecked(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		throwRuntime(3);
		
	}
	//
	public static void throwChecked(int a) throws Exception{
		
		if(a > 0){
			throw new Exception("a的值大于0，不符合要求");
		}
	}
	//
	public static void throwRuntime(int a){
		
		if(a > 0){
			throw new RuntimeException("a的值大于0，不符合要求");
		}
	}
	
}
