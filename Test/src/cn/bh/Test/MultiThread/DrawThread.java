package cn.bh.Test.MultiThread;

public class DrawThread extends Thread{
	
	private Account account;
	private int drawAmount;
	
	public DrawThread(String name, Account ac, int number){
		super(name);
		this.account = ac;
		this.drawAmount = number;
	}
	
	@Override
	public void run() {
		account.draw(drawAmount);	
	/*
	 synchronized(account){
	 
			if(account.getBalance() >= drawAmount){
				
				System.out.println(Thread.currentThread().getName() + "取钱成功" + drawAmount);
				
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				account.setBalance(account.getBalance() - drawAmount);
				System.out.println(Thread.currentThread().getName() + "余额为" + account.getBalance());
			}else{
				System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足" );
			}
		}
	*/
	}
	
	public static void main(String args[]){
		
		Account ac = new Account();
		ac.setAccountNo("Hello");
		ac.setBalance(2000);
		
		DrawThread dt1 = new DrawThread("客户1", ac, 600);
		DrawThread dt2 = new DrawThread("客户2", ac, 600);
		DrawThread dt3 = new DrawThread("客户3", ac, 600);
		DrawThread dt4 = new DrawThread("客户4", ac, 600);
		DrawThread dt5 = new DrawThread("客户5", ac, 600);
		DrawThread dt6 = new DrawThread("客户6", ac, 600);
		
		dt1.start();
		dt2.start();
		dt3.start();
		dt4.start();
		dt5.start();
		dt6.start();
	}
	
	
}
