package cn.test.drawanddeposit;

public class Account {

	private String accountNo;
	private int balance;
	private boolean flag = false; //表示没有存好钱
	
	public Account(){};
	
	public Account(String acc, int bal){
		this.accountNo = acc;
		this.balance = bal;
	}
	//取钱
	public synchronized void draw(int drawAmount){
		try {
			if(!flag){
				wait();
			}else{
				System.out.println(Thread.currentThread().getName() + "取钱" + drawAmount);
				setBalance(getBalance() - drawAmount);
				flag = false;
				notifyAll();
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//存钱
	public synchronized void deposit(int depositAmount){
		try{
			if(flag){
				wait();
			}else{
				System.out.println(Thread.currentThread().getName() + "存钱" + depositAmount);
				setBalance(getBalance() + depositAmount);
				flag = true;
				notifyAll();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
