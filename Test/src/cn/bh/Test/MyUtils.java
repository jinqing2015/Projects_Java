package cn.bh.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyUtils {
	
	//
	//src������dest�У����ҷ������һ��Ԫ��
	//
	public static <T> T copyArray(Collection<? super T> dest, Collection<T> src){
		
		T last = null;
		for(T ele : src){
			dest.add(ele);
			last = ele;
		}
		return last;
	}
	
	public static void main(String args[]){
		
		List<Number> ln = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		
		li.add(1);
		li.add(2);
		li.add(3);
		
		System.out.println(copyArray(ln, li));
		
	}
}
