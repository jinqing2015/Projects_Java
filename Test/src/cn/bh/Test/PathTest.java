package cn.bh.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
	
	public static void main(String args[]){
		Path path = Paths.get(".");
		System.out.println("path numbers : " + path.getNameCount());
		System.out.println("path root : " + path.getRoot());
		
		//获取path对应的绝对路径
		Path absolutePath = path.toAbsolutePath();
		System.out.println("absolutePath ：" + absolutePath);
		
		//获取绝对路径的根路径
		System.out.println("absolutePath root : " + absolutePath.getRoot());
		System.out.println("absolutePath num : " + absolutePath.getNameCount());
		System.out.println("absolutePath 3 : " + absolutePath.getName(3));
		
		//多个String来构造Path对象
		Path path2 = Paths.get("g:", "hello");
		System.out.println(path2);
	}
}
