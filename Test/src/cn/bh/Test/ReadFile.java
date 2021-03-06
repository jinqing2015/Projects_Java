package cn.bh.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class ReadFile {

	public static void main(String args[]){
		File f = new File("a.txt");
		try(
				FileInputStream fileInput = new FileInputStream(f);
				FileChannel fChannel = fileInput.getChannel();
				)
		{
			ByteBuffer buffer = ByteBuffer.allocate(64);
			
			while(fChannel.read(buffer) != -1){
				buffer.flip();
				
				Charset charset = Charset.forName("UTF-8");
				CharsetDecoder decoter = charset.newDecoder();
				CharBuffer charbuffer = decoter.decode(buffer);
				
				System.out.print(charbuffer);
				buffer.clear();
				
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	}
}
