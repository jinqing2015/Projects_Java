package cn.bh.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Client {
public static void main(String args[])throws IOException{
		

		Socket s = new Socket("127.0.0.1", 33333);
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		System.out.println(br.readLine());

		br.close();
		s.close();
	}
}
