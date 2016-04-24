package cn.bh.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
	
	public static void main(String args[]){
		Path path = Paths.get(".");
		System.out.println("path numbers : " + path.getNameCount());
		System.out.println("path root : " + path.getRoot());
		
		//��ȡpath��Ӧ�ľ���·��
		Path absolutePath = path.toAbsolutePath();
		System.out.println("absolutePath ��" + absolutePath);
		
		//��ȡ����·���ĸ�·��
		System.out.println("absolutePath root : " + absolutePath.getRoot());
		System.out.println("absolutePath num : " + absolutePath.getNameCount());
		System.out.println("absolutePath 3 : " + absolutePath.getName(3));
		
		//���String������Path����
		Path path2 = Paths.get("g:", "hello");
		System.out.println(path2);
	}
}