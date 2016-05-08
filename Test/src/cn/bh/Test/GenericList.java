package cn.bh.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String args[])
	{
		List<String> strList = new ArrayList<>();
		
		strList.add("Hello");
		strList.add("World");
		strList.add("jin");

		
		for(int i = 0; i < strList.size(); i++) 
		{
			System.out.println(strList.get(i));
		}
		
	}
}
