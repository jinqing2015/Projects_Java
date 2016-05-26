package cn.bh.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public boolean isHappy(int n) {
	       
		Set<Integer> loopNum = new HashSet<>();
		int sum;
		while(n != 1 && !loopNum.contains(n)){
			loopNum.add(n);
			sum = 0;
			while(n != 0){
				sum += (int) Math.pow(n%10, 2);
				n /= 10;
			}
			n = sum;
			
		}
		if(n == 1) return true;
		else return false;
	}
	public static void main(String args[]){
		System.out.println(new HappyNumber().isHappy(7));
	}

}
