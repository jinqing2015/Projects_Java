package cn.bh.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashMapTest {

	public static void main(String[] args)  {
		
		LinkedHashMap<Integer, Integer> socres = new LinkedHashMap<Integer, Integer>();
		socres.put(2, 12);
		socres.put(1, 32);
		socres.put(3, 34);
		
		Set<Entry<Integer, Integer>> me = socres.entrySet();
		Iterator<Entry<Integer, Integer>> it = me.iterator();
		while(it.hasNext()){
			Entry<Integer, Integer> temp = it.next();
			System.out.println(temp.getKey()+"---->"+temp.getValue());
		}
		

	}
}  
