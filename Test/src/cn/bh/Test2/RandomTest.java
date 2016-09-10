package cn.bh.Test2;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args){
		ArrayList<Integer> ret = new ArrayList<>();
		Random rd = new Random();
		for(int i = 0; i < 10; i++)
			ret.add(rd.nextInt(10));
		System.out.println(ret);
		
		ArrayList<Integer> ret2 = new ArrayList<>();
		for(int i=0; i<10; i++)
			ret2.add((int)(Math.random()*10));
		System.out.println(ret2);

	}
}
