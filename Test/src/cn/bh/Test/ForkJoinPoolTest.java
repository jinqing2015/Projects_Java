package cn.bh.Test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

class PrintTask extends RecursiveAction{
	
	private static final int THREADHOLD = 50;
	int start;
	int end;
	
	public PrintTask(int s, int e){
		this.start = s;
		this.end = e;
	}
	@Override
	protected void compute() {
		if(end - start < THREADHOLD){
			for(int i = start; i < end; i++){
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}else{
			int middle = (start + end)/2;
			PrintTask left = new PrintTask(start, middle);
			PrintTask right = new PrintTask(middle + 1, end);
			
			left.fork();
			right.fork();	
		}
	}
}

public class ForkJoinPoolTest {
	
	public static void main(String args[]){
		ForkJoinPool pool = new ForkJoinPool();
	
		pool.submit(new PrintTask(0, 10000));
		
		try {
			pool.awaitTermination(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.shutdown();
	}
}
