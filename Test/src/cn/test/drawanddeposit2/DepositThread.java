package cn.test.drawanddeposit2;

public class DepositThread extends Thread{
	
	private Account account;
	private int depositAmount;
	
	public DepositThread(Account acc, String name, int dep){
		super(name);
		this.account = acc;
		this.depositAmount = dep;
	}
	@Override
	public void run() {
		while(true){
			account.deposit(depositAmount);
		}
	}

}
