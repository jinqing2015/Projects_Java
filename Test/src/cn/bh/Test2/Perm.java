package cn.bh.Test2;
public class Perm {	
	int[] nums = new int[3];
	int n = 0;
	Perm(){
		for(int i=0; i<3; i++)
			nums[i]=i;
	}
	public void doPerm(int[] nums, int i, int j){
		if(i>j){
			for(int k=0; k<=j; k++)
				System.out.print(nums[k]+" ");
			System.out.print("\n");
			n++;
		}else{
			for(int k=i; k<=j; k++){
				swap(nums, k, i);
				doPerm(nums, i+1, j);
				swap(nums, k, i);
			}
		}
	}
	public void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp; 
	}
	public static void main(String[] args){
		Perm p = new Perm();
		p.doPerm(p.nums, 0, p.nums.length-1);
		System.out.println("n="+p.n);
	}
}
