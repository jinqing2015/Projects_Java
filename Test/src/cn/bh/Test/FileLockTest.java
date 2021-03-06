package cn.bh.Test;

import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLockTest {

	public static void main(String args[]){
		
		try(
				FileOutputStream output = new FileOutputStream("a.txt");
				FileChannel outChannel = output.getChannel();
				)
		{
			FileLock lock = outChannel.lock();
			Thread.sleep(10000);
			lock.release();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
