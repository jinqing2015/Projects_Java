package cn.bh.Test;

import java.io.*;
public class ThrowsTest2 {

	public static void main(String args[]) throws IOException{
		
		//��Ϊtest�������׳����쳣�ȵ�������main�����׳����쳣��Χ��
		//������Ҫ��test()���쳣�ڽ��д���try cathch ���� throws
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
