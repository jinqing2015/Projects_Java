package cn.bh.Test;

class MyExHandler implements Thread.UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println(t + "线程出现了异常" + e);
		e.printStackTrace();
	}
	
}

public class ExHandler {
	
	public static void main(String args[]){
		Thread.currentThread().setUncaughtExceptionHandler(new MyExHandler());
		

		int a = 6 / 0;

		
		System.out.println("end of main");
	}
}
