package cn.bh.Test;

public class InvokeRun extends Thread{
	
	private int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for( ; i < 10; i++){
			System.out.println(Thread.currentThread().getName() + " Invoke" + " " + i);
		}
	}
	
	//
	public static void main(String args[]){
		
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			if(i == 2){
				new InvokeRun().run();
				new InvokeRun().run();
				
				new InvokeRun().start();
				
				try{	
					Thread.currentThread().start();
				}catch(Exception ex){
					ex.printStackTrace();
				}
				
			}
			if(i == 3){
				new InvokeRun().start();
			}
			
		}
	}

	
}
