package cn.bh.Test;

public class MultiExceptionTest {

	public static void main(String args[]){
		
		try{
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			
		}catch(IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie){
			
			System.out.println("IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie");
			//捕获多异常时，异常已经通过final修饰，所以不能进行修改
			//ie = new ArithmeticException("test");
		}catch(Exception e){
			
			System.out.println("未知异常");
			e = new RuntimeException("Test");
		}
		
		
	}
}
