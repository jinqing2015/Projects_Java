package cn.bh.Test.MultiThread;

public class JoinThread extends Thread{
	
	public JoinThread(String name){
		super(name);
	}
	@Override
	public void run() {
		for(int i = 0; i < 20; i++)
			System.out.println(Thread.currentThread().getName() + " " + i);
	}
	
	public static void main(String args[]){
		
		JoinThread jt = new JoinThread("新线程");
		jt.start();
		
		for(int i = 0; i < 100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				
				JoinThread jt_1 = new JoinThread("被Join线程");
				jt_1.start();
				
				try {
					jt_1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
