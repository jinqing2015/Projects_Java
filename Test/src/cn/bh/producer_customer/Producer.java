package cn.bh.producer_customer;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
	
	private BlockingQueue bq;
	
	public Producer(BlockingQueue bq){
		this.bq = bq;
	}
	
	@Override
	public void run() {
		while(true){
			System.out.println(getName() + "Éú²ú");
			try {
				bq.put("Hello");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
