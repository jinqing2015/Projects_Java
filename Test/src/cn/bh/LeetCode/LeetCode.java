package cn.bh.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LeetCode {

	public String convert(String s, int numRows) {
	    if (numRows <= 1) {
	        return s;
	    }
	    int n = s.length();
	    int step = 2 * numRows - 2;
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < numRows; i++) {
	        for (int j = i; j < n; j += step) {
	            sb.append(s.charAt(j));
	            if (i != 0 && i != numRows - 1 && j + step - 2 * i < n) {
	                sb.append(s.charAt(j + step - 2 * i));
	            }
	        }
	    }
	    return sb.toString();
	}
	public String countAndSay(int n) {

	    StringBuilder builder = new StringBuilder();
	    char say = '1';
	    int count, current;
	    String countAndSay = "1";

	    for (int i=2; i<=n; i++) {

	        current = 0;
	        count = 1;
	        builder.delete(0, builder.length());

	        for (int j=0; j<countAndSay.length(); j++) {

	            if (j == current) say = countAndSay.charAt(j);
	            else if (countAndSay.charAt(j) == say) count++;
	            else {
	                builder.append(count).append(say);
	                current = j--;
	                count = 1;
	            }

	        }
	        builder.append(count).append(say);
	        countAndSay = builder.toString();
	    }

	    return countAndSay;
	}
	public static int myAtoi(String str) {
	    char min = '0';
	    char max = '9';
	    long out = 0;
	    boolean numbersOnly = false;
	    boolean sign = false;
	    for (int i=0; i<str.length(); i++){
	        char x = str.charAt(i);
	        if (!numbersOnly){
	            if (x == ' ') continue;
	            if (x == '+') {
	                sign = true;
	                numbersOnly = true;
	            }
	            else if (x == '-') {
	                sign = false;
	                numbersOnly = true;
	            }
	            else if (x >= min && x <= max) {
	                sign = true;
	                numbersOnly = true;
	                i -= 1;
	            } 
	            else return 0;
	        } else {
	            if (x < min || x > max) 
	                i = Integer.MAX_VALUE -1;
	            else {
	                int num = x - '0';
	                if (x == 0) continue;
	                out *= 10;
	                out += num;
	                if (out > Integer.MAX_VALUE) i = Integer.MAX_VALUE -1;
	            }

	        }
	    }
	    if (!sign) out *= -1;
	    if ( out > Integer.MAX_VALUE ) return Integer.MAX_VALUE;
	    else if ( out < Integer.MIN_VALUE ) return Integer.MIN_VALUE;
	    else return (int)out;
	}
	public static int[] countBits(int num) 
	{	
		int[] ret = new int[num + 1];
		for(int i = 0; i <= num; i++){
			int half = i >> 1;
	        if (i % 2 == 0)//the right-most bit in i is 0
	            ret[i] = ret[half];
	        else//the right-most bit in i is 1
	            ret[i] = ret[half] + 1;
		}
		return ret;
    }
	public static String longestPalindrome(String str){
		int length = str.length();
		int longestBegin = 0;
		int maxLength = 0;
		
		boolean [][]table = new boolean[1000][1000];
		for(int i = 0; i < length; i++){
			table[i][i] = true;
			longestBegin = i;
			maxLength = 1;
		}
		for(int i = 0; i < length - 1; i++)
			if(str.charAt(i) == str.charAt(i+1)){
				table[i][i+1] = true;
				longestBegin = i;
				maxLength = 2;
			}
		
		for(int len = 3; len <= length; len++)
			for(int j = 0; j < length - len + 1; j++){
				int m = j + len -1;
				if(str.charAt(j) == str.charAt(m)&&table[j+1][m-1]){
					table[j][m] = true;
					longestBegin = j;
					maxLength = len;
				}
			}
		return str.substring(longestBegin, longestBegin + maxLength);
	}
	public static String expandAroundCenter(String s, int i, int j){
		int length = s.length();
		while(i >= 0 && j <= length-1 && s.charAt(i)==s.charAt(j)){
			i--;
			j++;
		}
		return s.substring(i+1,j);
	}
	
	public static String longestPalindromeSimple(String str){
		int length = str.length();
		if(length <= 1)
			return str;
		String longest = "" + str.charAt(0);
		for(int i = 0; i < length - 1; i++){
			String first =  expandAroundCenter(str,i,i);
			if(longest.length() < first.length()){
				longest = first;
			}
			String second =  expandAroundCenter(str,i,i+1);
			if(longest.length() < second.length()){
				longest = second;
			}
		}
		return longest;
	}
	 public static int singleNumber(int[] nums) {
//		 int result = 0;
//	     for(int i = 0;i<nums.length;i++)
//	    	 result = result ^ nums[i];
//	     return result;
		 if(nums.length == 1)
	            return nums[0];
		 Arrays.sort(nums);
	     for(int i = 0; i < nums.length - 1; i+=2){
	    	 if(nums[i] != nums[i+1])
	    		 return nums[i];
	     }
	     return nums[nums.length - 1];
	 }
	 public static int singleNumber2(int[] nums) {
		 if(nums.length == 1)
	            return nums[0];
		 Arrays.sort(nums);
	     for(int i = 0; i < nums.length - 1; i+=3){
	    	 if(nums[i] != nums[i+1])
	    		 return nums[i];
	     }
	     return nums[nums.length - 1];
	 }
	 public static int[] singleNumber3(int[] nums) {
		 Set<Integer> temp = new HashSet<>();
		 for(Integer num:nums){
			 if(!temp.add(num)) temp.remove(num);
		 }
		 int[] ret = new int[2];
		 int k = 0;
		 Iterator it = temp.iterator();
		 while(it.hasNext()){
			 ret[k++] = (int) it.next();
		 }		 
		 return ret;
		 /*
 	int result[] = new int[2];        
    int xor = nums[0];
    for (int i=1; i<nums.length; i++)
    {
        xor ^= nums[i];
    }

    int bit = xor & ~(xor-1);
    int num1 = 0;
    int num2 = 0;

    for (int num : nums)
    {
        if ((num & bit) > 0)
        {
            num1 ^= num;
        }
        else
        {
            num2 ^= num;
        }
    }

    result[0] = num1;
    result[1] = num2;
    return result; 
		   
		  */
	 }
	public int[] productExceptSelf(int[] nums) {
		
		int[] output = new int[nums.length];
		for(int i = 0; i < nums.length; i++)
			output[i] = 1;
		
		int begin = 1;
		int end = 1;
		for(int i = 0; i < nums.length; i++){
			output[i]*=begin;
			begin *= nums[i];
			output[nums.length - i - 1]*=end;
			end *= nums[nums.length - i - 1];
		}
		return output;
		
	}
	public int[] productExceptSelf2(int[] nums) {
        int[] p = new int[nums.length];

        int product = 1;
        for(int i=0;i<p.length;++i){
            p[i] = product;
            product *= nums[i];
        }

        product = 1;
        for(int i=p.length-1;i>=0;--i){
            p[i]*=product;
            product*=nums[i];
        }
        return p;
    }
	public int maxProfit(int[] prices) {
		int profit = 0;
		int index;
		for(int i = 0; i < prices.length-1; i++){
			if(prices[i] < prices[i+1] && i==0){
				index = i;//
			}
			
		}
		return profit;
    }
	public static void main(String[]args){

	}
}
