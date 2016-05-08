package cn.bh.Test;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {
	
	static <T> void fromArrayToCollection(T arr[], Collection<T> clo)
	{
		for(int i = 0; i < arr.length; i++)
		{
			clo.add(arr[i]);
		} 
	}
	//Test
	public static void main(String args[])
	{
		String[] strArray = new String[100];
		Collection<String> c = new ArrayList<>();
		
		fromArrayToCollection(strArray, c);
		
	} 
}
