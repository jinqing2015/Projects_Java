package cn.bh.Test.MultiThread;

public class YieldThread extends Thread{

	public YieldThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i <10; i++ ){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 2){
				//将线程改成就绪状态
				yield();
			}
		}
	}
	
	public static void main(String args[]){
		
		YieldThread y1 = new YieldThread("高级");
		y1.setPriority(MAX_PRIORITY);
		
		YieldThread y2 = new YieldThread("低级");
		y2.setPriority(MIN_PRIORITY);
	
		y1.start();
		y2.start();
	}

	
}
