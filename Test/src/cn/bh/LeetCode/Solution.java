package cn.bh.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Solution {
	int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random r = new Random();
    	if(nums == null)
        	return null;
        int[] clone = nums.clone();
        for(int j = 1; j < clone.length; j++){
        	int ran = r.nextInt(j+1);
        	swap(clone, ran, j-1);
        }
        return clone;
    }
    public void swap(int[] nums, int i, int j){
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
    public static int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        if(n==1) return 10;
        int value=9;
        int ans=10;
        for(int i=2; i<=n; i++){
        	value *= (9-i+2);
        	ans += value;
        }
        return ans;
    }

    public static List<List<Integer>> subsets(int[] nums) {
    	List<Integer> tem = new ArrayList<>();
    	List<List<Integer>> res = new ArrayList<>();
    	Arrays.sort(nums);
        for(int i = 0; i <= nums.length; i++ )
        	subsetsHelper(res, tem, nums, i, 0);
        return res;
    	
    }
    public static void subsetsHelper(List<List<Integer>> res, List<Integer> tem, int[] nums, int k, int start){
    	if(k==0){
    		res.add(new ArrayList(tem));
    		return;
    	}
    	for(int i = start; i<nums.length; i++){
    		tem.add(nums[i]);
    		subsetsHelper(res, tem, nums, k-1, i+1);
    		tem.remove((Integer)nums[i]);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
	}

}
