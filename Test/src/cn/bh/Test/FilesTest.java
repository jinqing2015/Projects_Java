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
		
		System.out.println("a.txt 是否为隐藏文件：" + Files.isHidden(Paths.get("a.txt")));
		
		//一次性读取a.txt的所有行
		List<String> lines = Files.readAllLines(Paths.get("a.txt"), Charset.forName("GBK"));
		System.out.println(lines);
		System.out.println("----------------------------------");
		
		//判断指定文件的大小
		System.out.println("a.txt size : " + Files.size(Paths.get("a.txt")));
		
		List<String> poem = new ArrayList<>();
		poem.add("锄禾日当午");
		poem.add("汗滴禾下土");
		Files.write(Paths.get("a.txt"), poem, Charset.forName("GBK"));
		
		//获取D盘的相关信息
		FileStore cStore = Files.getFileStore(Paths.get("D:"));
		System.out.println("D:可用空间：" + cStore.getUsableSpace());
		System.out.println("D:空间：" + cStore.getTotalSpace());
	}
}
