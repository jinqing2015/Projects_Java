package cn.bh.Test;

import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FilesTest {

	public static void main(String args[])
		throws Exception
	{
		Files.copy(Paths.get("a.txt"), new FileOutputStream("b.txt"));
		
		System.out.println("a.txt �Ƿ�Ϊ�����ļ���" + Files.isHidden(Paths.get("a.txt")));
		
		//һ���Զ�ȡa.txt��������
		List<String> lines = Files.readAllLines(Paths.get("a.txt"), Charset.forName("GBK"));
		System.out.println(lines);
		System.out.println("----------------------------------");
		
		//�ж�ָ���ļ��Ĵ�С
		System.out.println("a.txt size : " + Files.size(Paths.get("a.txt")));
		
		List<String> poem = new ArrayList<>();
		poem.add("�����յ���");
		poem.add("���κ�����");
		Files.write(Paths.get("a.txt"), poem, Charset.forName("GBK"));
		
		//��ȡD�̵������Ϣ
		FileStore cStore = Files.getFileStore(Paths.get("D:"));
		System.out.println("D:���ÿռ䣺" + cStore.getUsableSpace());
		System.out.println("D:�ռ䣺" + cStore.getTotalSpace());
	}
}