package cn.bh.Test;


import java.io.*;
import java.io.IOException;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;


public class FileChannelTest {
	public static void main(String args[]){
		File f = new File("src/cn/bh/Test/FileInputStreamTest.java");
		try(
				FileChannel inChannel  = new FileInputStream(f).getChannel();
				FileChannel outChannel = new FileOutputStream("a.txt").getChannel();
				)
		{
			MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
			outChannel.write(buffer);
			buffer.flip();
			
			//使用解码是将bytebuffer转换成charbuffer
			Charset charset = Charset.forName("GBK");
			CharsetDecoder decoder = charset.newDecoder();
			CharBuffer charbuffer = decoder.decode(buffer);
			System.out.println(charbuffer);	
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	}
}
