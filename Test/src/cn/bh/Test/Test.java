package cn.bh.Test;

public class Test {
	
	private void test(){
		System.out.println("In father test");
	}
	
	public static void main(String args[]){
		Test t1 = new Test();
		Test t2 = new TestSon();
		TestSon t3 = new TestSon();
		t1.test();
		t2.test();
		t3.test();
		System.out.println(t1.getClass());
		
	}
}
class TestSon extends Test{
	public void test(){
		System.out.println("In son test");
	}
}

