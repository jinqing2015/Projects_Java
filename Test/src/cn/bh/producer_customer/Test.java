package cn.bh.producer_customer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {

	public static void main(String args[]){
		
		BlockingQueue bq = new ArrayBlockingQueue(3);
		
		new Producer(bq).start();
		new Customer(bq).start();
		new Customer(bq).start();
		new Customer(bq).start();
		new Customer(bq).start();
	}
}
