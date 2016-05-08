package cn.bh.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String args[]){
		
		TreeSet<String> ts1 = new TreeSet<>(new Comparator<Object>(){
			@Override
			public int compare(Object arg0, Object arg1) {
				// TODO Auto-generated method stub
				return arg0.hashCode() > arg1.hashCode() ? 1 : (arg0.hashCode() < arg1.hashCode() ? -1 : 0);
			}
		});
		
		ts1.add("hello");
		ts1.add("world1");
		System.out.println(ts1);
		
		TreeSet<String> ts2 = new TreeSet<>(new Comparator<String>(){
			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				return arg0.length() > arg1.length() ? 1 : (arg0.length() < arg1.length() ? -1 : 0);
			}
		});
		
		ts2.add("hello");
		ts2.add("world1");
		System.out.println(ts2);
	}
}
