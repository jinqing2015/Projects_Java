package cn.bh.Test;

public class SecondThread implements Runnable{
	
	private int i;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for( ; i < 100; i++){
			
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	public static void main(String args[]){
		
		for(int i = 0; i < 100; i++){
			
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 2){
				
				new Thread(new SecondThread(), "Thread_hello").start();
				
				new Thread(new SecondThread(), "Thread_world").start();
				
			}
		}
	}

}