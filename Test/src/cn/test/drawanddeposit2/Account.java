package cn.test.drawanddeposit2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

	private final Lock lock = new ReentrantLock();
	private final Condition con = lock.newCondition();
	
	private String accountNo;
	private int balance;
	private boolean flag = false; //��ʾû�д��Ǯ
	
	public Account(){};
	
	public Account(String acc, int bal){
		this.accountNo = acc;
		this.balance = bal;
	}
	//ȡǮ
	public void draw(int drawAmount){
		lock.lock();
		try {
			if(!flag){
				con.await();
			}else{
				System.out.println(Thread.currentThread().getName() + "ȡǮ" + drawAmount);
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
	//��Ǯ
	public synchronized void deposit(int depositAmount){
		lock.lock();
		try{
			if(flag){
				con.await();
			}else{
				System.out.println(Thread.currentThread().getName() + "��Ǯ" + depositAmount);
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
