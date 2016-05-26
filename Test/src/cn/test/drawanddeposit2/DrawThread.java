package cn.test.drawanddeposit2;

public class DrawThread extends Thread{
	
	private Account account;
	private int drawAmount;
	
	public DrawThread(Account acc, String name, int dra){
		super(name);
		this.account = acc;
		this.drawAmount = dra;
	}
	
	@Override
	public void run() {
		while(true){
			account.draw(drawAmount);
		}
	}

}
