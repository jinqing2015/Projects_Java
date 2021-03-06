package cn.bh.Test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVistorTest {

	public static void main(String args[]) throws Exception{
		
		Files.walkFileTree(Paths.get("D:/Projects"), new SimpleFileVisitor<Path>(){

			@Override
			public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes arg1) throws IOException {
				
				System.out.println("preVisitDirectory正在访问：" + file + "文件");
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes arg1) throws IOException {
				
				System.out.println("visitFile正在访问：" + file + "文件");
				return FileVisitResult.CONTINUE;
			}
			
			
		});
		
	}
}
