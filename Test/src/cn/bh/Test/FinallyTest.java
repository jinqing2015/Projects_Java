package cn.bh.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyTest {

	public static void main(String args[]){
		
		FileInputStream fis = null;
		
		try{
			
			fis = new FileInputStream("a.txt");
		}catch(IOException ioe){
			
			System.out.println(ioe.getMessage());
			//return;
			//如果这里使用exit，表示程序退出虚拟机，不会去执行finally块里的代码
			System.exit(1);
		}finally{
			
			if(fis != null){	
				try{
					fis.close();
				}catch(IOException ioe){
					ioe.printStackTrace();
				}
			}
			System.out.println("执行finally块里的代码");
		}
		
		
	}
}
