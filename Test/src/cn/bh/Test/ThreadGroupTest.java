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
			System.out.println(Thread.currentThread().getName() + "����i = " + i);
			i++;
		}
	}
}
public class ThreadGroupTest {

	public static void main(String args[]){
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("���߳��������" + mainGroup.getName());
		System.out.println("���߳��Ƿ�Ϊ��̨�߳�" + mainGroup.isDaemon());
		
		new MyThread("���߳����е��߳�").start();
		
		ThreadGroup tg = new ThreadGroup("���߳���");
		tg.setDaemon(true);
		
		System.out.println("���߳��������" + tg.getName());
		System.out.println("���߳��Ƿ�Ϊ��̨�߳�" + tg.isDaemon());
		
		new MyThread(tg, "tg���߳� ��").start();
		new MyThread(tg, "tg���߳� ��").start();
		
	}
}
