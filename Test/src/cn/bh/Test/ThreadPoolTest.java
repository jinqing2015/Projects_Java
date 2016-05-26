package cn.bh.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadOne implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName() + " " +i);
		}
	}
}

public class ThreadPoolTest {
	
	public static void main(String args[]){
		
		ExecutorService pool = Executors.newFixedThreadPool(6);
		pool.submit(new MyThreadOne());
		pool.submit(new MyThreadOne());
		pool.submit(new MyThreadOne());
		
		pool.shutdown();
		
	}
}
