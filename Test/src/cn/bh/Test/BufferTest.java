package cn.bh.Test;

import java.nio.*;

public class BufferTest {

	public static void main(String args[]){
		CharBuffer cBuff = CharBuffer.allocate(100);
		
		System.out.println("capacity:" + cBuff.capacity());
		System.out.println("limit:" + cBuff.limit());
		System.out.println("position:" + cBuff.position());
		
		cBuff.put("a");
		cBuff.put("b");
		cBuff.put("c");
		cBuff.put("d");
		System.out.println("add three element position:" + cBuff.position());
		System.out.println("add three element limit:" + cBuff.limit());
		
		cBuff.flip();
		System.out.println("after flip position:" + cBuff.position());
		System.out.println("after flip limit:" + cBuff.limit());
		
		cBuff.get();
		System.out.println("get one element position:" + cBuff.position());
		
		cBuff.clear();
		System.out.println("after clear position:" + cBuff.position());
		System.out.println("after clear limit:" + cBuff.limit());
		
		System.out.println("get index 2 element:" + cBuff.get(2));
		System.out.println("after get position:" + cBuff.position());
		
		
	}
}
