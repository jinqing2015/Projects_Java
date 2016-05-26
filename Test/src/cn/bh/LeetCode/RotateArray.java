package cn.bh.LeetCode;

public class RotateArray {
	
	public void rotate(int[] nums, int k) {
    
		//����k>nums.length�����
      	k = k % nums.length;
      	
		int[] temp = new int[k];
		
		//�ȱ���
		for(int i = 0; i < k; i++){
			temp[i] = nums[i];
		}
		//����
		for(int j = nums.length - 1; j >= k; j--){
			nums[(j+k) % nums.length] = nums[j];
		}
		//�����ǵ�Ԫ�طŻ�Ӧ�õ�λ��
		for(int i = 0; i < k; i++){
			nums[(i + k) % nums.length] = temp[i];
		}
		
    }
}
