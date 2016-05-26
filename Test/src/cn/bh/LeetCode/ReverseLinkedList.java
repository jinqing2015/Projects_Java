package cn.bh.LeetCode;

public class ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		
		if(head == null || head.next == null){
			return head;
		}
		ListNode p = head;
		ListNode p_next = p.next;
		head.next = null;
		while(p_next != null){
			ListNode p_front = p;
			p = p_next;
			p_next = p.next;
			
			p.next = p_front;
		}
		return p;
    }
	public ListNode reverseList_rec(ListNode head) {
        if (head == null)  return null;
        if (head.next == null) return head;
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
	}
	//I（1）、V（5）、X（10）、L（50）、C（100）、D（500）、 M（1000）
	//从右往左计算，如果左边的数字比右边的数字小，则是加上左边数字，否则减去左边的数字
	//
	//
	public static int romanToInt(String s) {
	
		char[] nums = s.toCharArray();
		int retVal = 0;
		if(nums.length == 0) return retVal;
		if(nums.length == 1) return romanNum(nums[0]);
		
		retVal = romanNum(nums[nums.length - 1]);
		for(int i = nums.length - 1; i > 0; i--){
			if(romanNum(nums[i]) <= romanNum(nums[i-1]))
				retVal += romanNum(nums[i - 1]);
			else
				retVal -= romanNum(nums[i - 1]);
		}
		return retVal;
	}
	public static int romanNum(char c){
		switch(c){
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
			default:
				return 0;
		}
	}
	public static void main(String args[]){
		System.out.println(romanToInt("DCXXI"));
	}
}
