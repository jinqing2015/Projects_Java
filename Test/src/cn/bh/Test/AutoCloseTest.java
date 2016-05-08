package cn.bh.Test;

import java.io.*;

public class AutoCloseTest {

	public static void main(String args[]) throws IOException{
			
		try(
				BufferedReader br = new BufferedReader(new FileReader("a.txt"));
				PrintStream ps = new PrintStream(new FileOutputStream("b.txt"));
				)
		{
			System.out.println(br.readLine());
			ps.print("Hello");
		}
		
	}
}
