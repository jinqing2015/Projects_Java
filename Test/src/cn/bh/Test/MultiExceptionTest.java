package cn.bh.Test;

public class MultiExceptionTest {

	public static void main(String args[]){
		
		try{
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			
		}catch(IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie){
			
			System.out.println("IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie");
			//������쳣ʱ���쳣�Ѿ�ͨ��final���Σ����Բ��ܽ����޸�
			//ie = new ArithmeticException("test");
		}catch(Exception e){
			
			System.out.println("δ֪�쳣");
			e = new RuntimeException("Test");
		}
		
		
	}
}