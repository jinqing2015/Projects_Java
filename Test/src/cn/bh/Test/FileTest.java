package cn.bh.Test;

import java.io.*;

public class FileTest {
	public static void main(String args[])throws IOException
	{
		File file = new File(".");
		System.out.println(file.getName());
		
		System.out.println(file.getParent());
		
		System.out.println(file.getAbsolutePath());
		
		System.out.println(file.getAbsoluteFile().getParent());
		
		File tempFile = File.createTempFile("aaa", ".txt", file);
		
		tempFile.deleteOnExit();
		
		File newFile = new File(System.currentTimeMillis()+".txt");
		System.out.println("file exist():" + newFile.exists());
		
		newFile.createNewFile();
		
		newFile.mkdir();
		
		String[] fileList = file.list();
		for(String str : fileList)
		{
			System.out.println("filename:" + str);
		}
		System.out.println("=================root file==================");
		File[] roots = File.listRoots();
		for(File str : roots)
		{
			System.out.println("filename:" + str);
		}
		
	}
}
