package cn.bh.Test;

import java.util.*;
import java.io.*;

public class TestScanner {
	
	public static void main(String args[])throws IOException{
		Process p = Runtime.getRuntime().exec("javac");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			
		String buff = null;
		while((buff = br.readLine()) != null){
			System.out.println(buff);
		}
				
		 
		
	
	}
}