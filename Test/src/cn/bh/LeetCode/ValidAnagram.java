package cn.bh.LeetCode;

import java.nio.charset.Charset;
import java.util.Deque;
import java.util.LinkedList;

public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
        
		if(s.length() != t.length())
			return false;
		
		int[] map = new int[128];
		
		for(int i = 0; i < s.length(); i++){
			map[s.charAt(i)]++;
			map[t.charAt(i)]--;
		}
		for(int i = 0; i < map.length; i ++){
			if(map[i] != 0)
				return false;
		}
		
		return false;
    }
	
	 public boolean isAnagram_1(String s, String t) {
	        if (s.length() != t.length()) return false;
	        char[] cs = s.toCharArray();
	        char[] ct = t.toCharArray();
	        int[] map = new int[127];
	        int count = 0;
	        for (int i = 0; i < cs.length; i++) {
	            if(++map[cs[i]] == 1) count ++;
	            if(--map[ct[i]] == 0) count --;
	        }
	        return count == 0;
	 }
	 public static void main(String args[]){
		
		 int[] map = new int[100];
		 
		 map['a'] = 1;
		 
		 System.out.println(map['b']);
		 
		 
	 }
	 
	 
	 
}
