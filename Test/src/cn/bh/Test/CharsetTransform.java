package cn.bh.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.*;

public class CharsetTransform {

	public static void main(String args[]) throws IOException{
		
		Charset cn = Charset.forName("GBK");
		CharsetDecoder decoder = cn.newDecoder();
		CharsetEncoder encoder = cn.newEncoder();
		
		CharBuffer buffer = CharBuffer.allocate(10);
		buffer.put('��');
		buffer.put('��');
		buffer.put('��');
		buffer.put('��');
		buffer.flip();
		
		ByteBuffer bytebuffer = encoder.encode(buffer);
		for(int i = 0; i < buffer.limit(); i++){
			System.out.print(bytebuffer.get(i) + " ");
		}
		System.out.println("\nDecoder result: " + decoder.decode(bytebuffer));
	}
}
