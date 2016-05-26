package cn.bh.LeetCode;

public class RotateArray {
	
	public void rotate(int[] nums, int k) {
    
		//考虑k>nums.length的情况
      	k = k % nums.length;
      	
		int[] temp = new int[k];
		
		//先保存
		for(int i = 0; i < k; i++){
			temp[i] = nums[i];
		}
		//后移
		for(int j = nums.length - 1; j >= k; j--){
			nums[(j+k) % nums.length] = nums[j];
		}
		//将覆盖的元素放回应该的位置
		for(int i = 0; i < k; i++){
			nums[(i + k) % nums.length] = temp[i];
		}
		
    }
}
