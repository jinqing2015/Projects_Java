package cn.bh.LeetCode;

import java.util.Arrays;

public class MajorityElement {

	public int majorityElement(int[] nums) {
		
		Arrays.sort(nums);
		int rule  = nums.length / 2;
		for(int i = 0; i + rule < nums.length; i++){
			if(nums[i] == nums[i + rule])
				return nums[i];
		}
		return 0;
    }
	
}
