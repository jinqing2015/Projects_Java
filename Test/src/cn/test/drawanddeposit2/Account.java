package cn.test.drawanddeposit2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

	private final Lock lock = new ReentrantLock();
	private final Condition con = lock.newCondition();
	
	private String accountNo;
	private int balance;
	private boolean flag = false; //表示没有存好钱
	
	public Account(){};
	
	public Account(String acc, int bal){
		this.accountNo = acc;
		this.balance = bal;
	}
	//取钱
	public void draw(int drawAmount){
		lock.lock();
		try {
			if(!flag){
				con.await();
			}else{
				System.out.println(Thread.currentThread().getName() + "取钱" + drawAmount);
				setBalance(getBalance() - drawAmount);
				flag = false;
				con.signalAll();
				
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	//存钱
	public synchronized void deposit(int depositAmount){
		lock.lock();
		try{
			if(flag){
				con.await();
			}else{
				System.out.println(Thread.currentThread().getName() + "存钱" + depositAmount);
				setBalance(getBalance() + depositAmount);
				flag = true;
				con.signalAll();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}

	@Override
	public int hashCode() {
		return accountNo.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && obj.getClass() == Account.class){
			Account target = (Account)obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
