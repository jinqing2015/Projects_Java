package cn.bh.Test.MultiThread;

public class Account {

	private String accountNo;
	private int balance;
	
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
	//ͬ������
	public synchronized void draw(int drawAmount){
		if(this.getBalance() >= drawAmount){
			
			System.out.println(Thread.currentThread().getName() + "ȡǮ�ɹ�" + drawAmount);
			/*
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			this.setBalance(this.getBalance() - drawAmount);
			System.out.println(Thread.currentThread().getName() + "���Ϊ" + this.getBalance());
		}else{
			System.out.println(Thread.currentThread().getName() + "ȡǮʧ�ܣ�����" );
		}
	}
	
	
}
