package cn.bh.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String args[])throws IOException{
		
		ServerSocket ss = new ServerSocket(33333);
		while(true){
			
			Socket s = ss.accept();
			PrintStream ps = new PrintStream(s.getOutputStream());
			ps.println("hello i am server");
			
			ps.close();
			s.close();
		}
		
	}
}
