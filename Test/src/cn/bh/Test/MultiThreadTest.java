package cn.bh.Test;

public class MultiThreadTest extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + "==" + i);
		}
	}
	public static int climbStairs(int n) {
        return fib(1, 2, n);
    }

    public static int fib(int a, int b, int n) {
        if (n <= 1) 
        	return a;
        else 
        	return fib(b, a+b, n-1);
    }
	public static void main(String[] args) {
		System.out.println(climbStairs(6) );
	}

}
