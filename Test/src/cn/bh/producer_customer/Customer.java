package cn.bh.producer_customer;

import java.util.concurrent.BlockingQueue;

public class Customer extends Thread{
	private BlockingQueue bq;
	public Customer(BlockingQueue bq){
		this.bq = bq;
	}
	@Override
	public void run() {
		while(true){
			System.out.println(getName() + "ฯ๛ทั");
			try {
				bq.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
