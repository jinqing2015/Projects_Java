package cn.bh.Test;

import java.io.*;
public class ThrowsTest2 {

	public static void main(String args[]) throws IOException{
		
		//因为test方法中抛出的异常比调用它的main函数抛出的异常范围大
		//所以需要对test()的异常在进行处理try cathch 或者 throws
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test() throws Exception{
		System.out.println("In Test");
	}
}
