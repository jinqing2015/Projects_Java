package cn.bh.Test;

public class ThreadExceptionTest implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		firstMethod();
	}
	
	public void firstMethod(){
		secondMethod();
	}
	
	public void secondMethod(){
		int a = 5 / 0;
		a++;
	}
	
	public static void main(String args[]){
		new Thread(new ThreadExceptionTest()).start();
	}

}
