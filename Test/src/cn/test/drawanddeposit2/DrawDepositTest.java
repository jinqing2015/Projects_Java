package cn.test.drawanddeposit2;

public class DrawDepositTest {

	public static void main(String args[]){
		Account acc = new Account("10086", 1000);
		
		DepositThread deposit1 = new DepositThread(acc, "���1", 800);
		
		DrawThread draw1 = new DrawThread(acc, "ȡ��1", 800);
		DrawThread draw2 = new DrawThread(acc, "ȡ��2", 800);
		DrawThread draw3 = new DrawThread(acc, "ȡ��3", 800);
		DrawThread draw4 = new DrawThread(acc, "ȡ��4", 800);
		
		deposit1.start();
		draw1.start();
		draw2.start();
		draw3.start();
		draw4.start();
		
		
	}
}
