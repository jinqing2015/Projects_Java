package cn.bh.Test2;

import java.util.Scanner;

public class FindSubStringIndex {
	
	public static int findSubStringIndex(String str1, String str2){
		int str1Length = str1.length();
		int str2Length = str2.length();
		
		int i,j;
		for(i=0, j=0;i<str1Length&&j<str2Length;){
			if(str1.charAt(i) == str2.charAt(j)){
				i++;
				j++;
			}else{
				i = i-j+2;
				j = 0;
			}
		} 
		if(j>=str2Length)
			return i-j+1;
		return 0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(
				FindSubStringIndex.findSubStringIndex(sc.next(), sc.next())
		);
		String a = "1,2,3,4";
		
	}
	
}
