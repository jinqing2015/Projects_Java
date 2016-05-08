package cn.bh.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThirdThread implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int i;
		for(i = 0; i < 100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		return i;
	}
	
	//
	public static void main(String args[]){
		
		ThirdThread tt = new ThirdThread();
		FutureTask<Integer> task = new FutureTask<Integer>(tt);
		
		for(int i = 0; i < 100; i++){
			
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			if(i == 20){
				new Thread(task, "������ֵ���߳�").start();;
			}
		}
		
		try {
			System.out.println("���̵߳ķ���ֵ��" + task.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


}