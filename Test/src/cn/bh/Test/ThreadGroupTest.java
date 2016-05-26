package cn.bh.Test;

class MyThread extends Thread {

	public MyThread(String name){
		super(name);
	}
	public MyThread(ThreadGroup tg, String name){
		super(tg, name);
	}
	@Override
	public void run() {
		int i = 1;
		while(i > 0 && i < 100){
			System.out.println(Thread.currentThread().getName() + "变量i = " + i);
			i++;
		}
	}
}
public class ThreadGroupTest {

	public static void main(String args[]){
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("主线程组的名字" + mainGroup.getName());
		System.out.println("主线程是否为后台线程" + mainGroup.isDaemon());
		
		new MyThread("主线程组中的线程").start();
		
		ThreadGroup tg = new ThreadGroup("新线程组");
		tg.setDaemon(true);
		
		System.out.println("新线程组的名字" + tg.getName());
		System.out.println("新线程是否为后台线程" + tg.isDaemon());
		
		new MyThread(tg, "tg组线程 甲").start();
		new MyThread(tg, "tg组线程 乙").start();
		
	}
}
