package cn.bh.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LeetCode {
	//21
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
        	return null;
		if(l1 == null || l2 == null)
        	return l1 == null ? l2 : l1;
		
		ListNode head = null;
		ListNode p1, p2;
		if(l1.val < l2.val){
			head = l1;
			l1 = l1.next;
		}else{
			head = l2;
			l2 = l2.next;
		}
		p1 = l1;
		p2 = l2;
		ListNode q = head;
		while(p1 != null && p2 != null){
			if(p1.val < p2.val){
				q.next = p1;
				p1 = p1.next;
			}else{
				q.next = p2;
				p2 = p2.next;
			}
			q = q.next;
		}
		q.next = (p1 == null? p2: p1);
		return head;
        
    }
	//24
	public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
        	return head;
        ListNode p = head;
        ListNode q = head.next;
        head = q;
        //��ͷ����
        p.next = q.next;
    	q.next = p;
    	ListNode p_front = p;
        while(q != null && p != null){
        	p.next = q.next;
        	q.next = p;
        	p_front.next = q;
        	p = p.next;
        	if(p == null)
        		break;
        	q = p.next;
        }        
        return head;
        /*
         if(head==null||head.next==null)
                return head;
            ListNode p1 = head;
            ListNode p2 = p1.next;
            ListNode p3 = p2.next;
            p2.next = p1;
            p1.next = swapPairs(p3);
            return p2;
         */
        
    }
	//66
	public int[] plusOne(int[] digits) {
		
		 int carry = 1;
		 for (int i = digits.length-1; i>= 0; i--) {
		        digits[i] += carry;
		        if (digits[i] <= 9) // early return 
		            return digits;
		        digits[i] = 0;
		    }
		    int[] ret = new int[digits.length+1];
		    ret[0] = 1;
		    return ret;
		
    }
	//67
	//1010
	//1010
	//10100 11100
	
	public String addBinary(String a, String b) {
        /*
        StringBuilder sum = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            int digitA = i < 0 ? 0 : a.charAt(i--) - '0';
            int digitB = j < 0 ? 0 : b.charAt(j--) - '0';
            sum.insert(0, (digitA + digitB + carry) % 2);
            carry = (digitA + digitB + carry) / 2;
        }
        return sum.toString(); 
        */	
		int[] arrA = StringToBinary(a);
        int[] arrB = StringToBinary(b);
        int[] arrC = arrA.length > arrB.length ? arrA : arrB;
        
        int array = 0;
        int i = arrA.length - 1;
        int j = arrB.length - 1;
        int k = arrC.length - 1;
        while(i >= 0 && j >= 0){
        	arrC[k] = arrA[i] + arrB[j] + array;
        	if(arrC[k] > 1){
        		array = arrC[k] / 2;
        		arrC[k] = arrC[k] % 2;
        	}else
        		array = 0;
        	i--;
        	j--;
        	k--;
        }
        while(i >= 0){
        	arrC[k] = arrA[i] + array;
        	if(arrC[k] > 1){
        		array = arrC[k] / 2;
        		arrC[k] = arrC[k] % 2;
        	}
        	i--;
        	k--;
        }
        while(j >= 0){
        	arrC[k] = arrB[j] + array;
        	if(arrC[k] > 1){
        		array = arrC[k] / 2;
        		arrC[k] = arrC[k] % 2;
        	}
        	j--;
        	k--;
        }
        for(i = 0; i < arrC.length; i++)
        	System.out.println(arrC[i]);
        if(array > 0)
        {
        	int[] ret = new int[arrC.length + 1];
        	for(i = 0; i < arrC.length; i++)
        		ret[i + 1] = arrC[i];
        	ret[0] = array;
        	return BinaryToString(ret);
        }
        
        return BinaryToString(arrC);
        
        
    }
	public int[] StringToBinary(String a){
		int[] arr = new int[a.length()];
		for(int i = 0; i < arr.length; i++){
			if(a.charAt(i) == '1')
				arr[i] = 1;
			else
				arr[i] = 0;
		}
		return arr;
	}
	public String BinaryToString(int[] a){
		char[] ret = new char[a.length];
		for(int i = 0; i < a.length; i++){
			if(a[i] == 1)
				ret[i] = '1';
			else
				ret[i] = '0';
		}
		return new String(ret);
	}
	//88
	public void merge(int[] nums1, int m, int[] nums2, int n) {
       int index = m + n - 1;
       int p1 = m - 1;
       int p2 = n - 1;
       while(index >= 0){
    	  if(p1 < 0) nums1[index--] = nums2[p2--];
    	  else if(p2 < 0) return;
    	  else
    		  nums1[index--] = (nums1[p1] > nums2[p2] ? nums1[p1--]: nums2[p2--]);
       }
    }
	//101
	public boolean isSymmetric_(TreeNode root) {
        return isMirror(root,root);
	}
    public boolean isMirror(TreeNode a,TreeNode b){
        return a==null||b==null?a==b:a.val==b.val&&isMirror(a.left,b.right)&&isMirror(a.right,b.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        	return true;
        if(root.left == null || root.right == null)
        	return root.left == root.right;
        return isSymmetric(root.left, root.right);
	}
    public boolean isSymmetric(TreeNode node1, TreeNode node2) {
    	if(node1==null && node2==null)
            return true;
    	//else if(...)
        //if either one is null, return false
        if(node1==null || node2==null)
            return false;

        //if they both are equal, compare their children
        if(node1.val!=node2.val)
        	return false;
    	return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
	}
	
	//102
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ret = new ArrayList<>();
		if(root == null)
			return ret;
		
		Deque<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.offer(root);
		while(!nodeQueue.isEmpty()){
			List<Integer> tempList = new ArrayList<>();
			int nodenum = nodeQueue.size();
			while(nodenum-- > 0){
				TreeNode temp = nodeQueue.remove();
				tempList.add(temp.val);
				if(temp.left != null)
					nodeQueue.offer(temp.left);
				if(temp.right != null)
					nodeQueue.offer(temp.right);
			}
			ret.add(tempList);
		}
		return ret;
		
    }
	//107
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		LinkedList<List<Integer>> ret = new LinkedList<>();
		if(root == null)
			return ret;
		
		Deque<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.offer(root);
		while(!nodeQueue.isEmpty()){
			List<Integer> tempList = new ArrayList<>();
			int nodenum = nodeQueue.size();
			while(nodenum-- > 0){
				TreeNode temp = nodeQueue.remove();
				tempList.add(temp.val);
				if(temp.left != null)
					nodeQueue.offer(temp.left);
				if(temp.right != null)
					nodeQueue.offer(temp.right);
			}
			ret.offerFirst(tempList);
		}
		return ret;
    }
	//110
	public boolean isBalanced(TreeNode root) {
		if(root == null)
             return true; 
		if(Math.abs(highTree(root.left) - highTree(root.right)) > 1)
	    	 return false;
	     return isBalanced(root.right) && isBalanced(root.left);
	}
	public int highTree(TreeNode root){
		if(root == null)
			return 0;
		return 1 + Math.max(highTree(root.left), highTree(root.right));
	}
	//198
	public int rob(int[] nums) {
		if(nums==null||nums.length==0){
	        return 0;
	    }
	    int n0 = 0;  // ��¼û��ѡ��ǰhousesʱ�Ļ�ȡ�������
	    int n1 = 0;  // ��¼ѡ��ǰhousesʱ�Ļ�ȡ�������
	    for(int i=0; i<nums.length; i++){
	        int tmp = n0;
	        n0 = Math.max(n0,n1);  //û��ѡ��ǰhouses����ô�������ϴ�ѡ���˻�ûѡ������ֵ  
	        n1 = tmp+nums[i];  //ѡ���˵�ǰhouses��ֵֻ�ܵ����ϴ�ûѡ���+��ǰhouses��money
	    }
	    return Math.max(n0, n1);
		//return maxRob(nums, 0);
    }
	public int maxRob(int[] nums, int n){
		if(n > nums.length - 1)
			return 0;
		return nums[n] + Math.max(maxRob(nums, n + 2),maxRob(nums, n + 3));
	}
	public int[] intersection1(int[] nums1, int[] nums2) {
		Set<Integer> nums = new HashSet<>();
		Set<Integer> ret = new HashSet<>();
		
		for(int num : nums1)	nums.add(num);
		for(int num : nums2)
			if(!nums.contains(num))
				ret.add(num);
		int[] retNums = new int[ret.size()];
		int i = 0;
		for(int num : ret) retNums[i++] = num;
		return retNums;
    }
	public int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> ret = new HashSet<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i,j;
		i = j = 0;
		while(i < nums1.length  && j < nums2.length ){			
			if(nums1[i] == nums2[j]){
				ret.add(nums1[i]);
				i++;
				j++;
			}else if(nums1[i] > nums2[j])
				j++;
			else
				i++;
		}
		int[] retNums = new int[ret.size()];
		for(int num : ret) retNums[i++] = num;	
		return retNums;	
    }
	//350
	public int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> ret = new LinkedList<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i,j;
		i = j = 0;
		while(i < nums1.length  && j < nums2.length ){			
			if(nums1[i] == nums2[j]){
				ret.add(nums1[i]);
				i++;
				j++;
			}else if(nums1[i] > nums2[j])
				j++;
			else
				i++;
		}
		i = 0;
		int[] retNums = new int[ret.size()];
		for(int num : ret) retNums[i++] = num;	
		return retNums;
	}
	public static int climbStairs2(int n) {
        return fib(1, 2, n);
    }

    public static int fib(int a, int b, int n) {
        if (n <= 1) 
        	return a;
        else 
        	return fib(b, a+b, n-1);
    }
	public static int climbStairs(int n) {
		if(n <= 0)
			return 0;
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		return climbStairs(n - 1) + climbStairs(n - 2);
    }
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode p = head;
		while(p != null){
			ListNode q = p.next;
			while(q != null && q.val == p.val)
				q = q.next;
			p.next = q;
			p = p.next;
		}
		return head;
    }
	//141
	public boolean hasCycle(ListNode head) {
        if(head == null)
        	return false;
        ListNode p = head;
        ListNode q = p;
        while(q != null){
        	q = q.next;
        	if(q == null)
        		return false;
        	q = q.next;
        	if(q == null)
        		return false;
        	p = p.next;
        	if(q == p)
        		return true;
        }
        return false;
    }
	//142
	public ListNode detectCycle(ListNode head) {
		if(head == null)
        	return null;
        ListNode slow = head;
        ListNode fast = slow;
        while(fast != null && fast.next != null){
        	fast = fast.next.next;
        	slow = slow.next;
        	if(fast == slow)
        		break;
        }
        if(fast == null || fast.next == null)
        	return null;
        slow = head;
        while(slow != fast){
        	slow = slow.next;
        	fast = fast.next;
        }
        return slow;
		
    }
	//121
	public int maxProfit(int[] prices) {
		int min = 0;
        int mp = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[min] > prices[i]) min = i;
            else mp = Math.max(mp, prices[i] - prices[min]);
        }

        return mp;
    }
	//235
	public TreeNode lowestCommonAncestor_Average(TreeNode root, TreeNode p, TreeNode q) {
        
		if(root == null || p == null || q == null)
			return null;
		else if(p.val < root.val && q.val < root.val)
			return lowestCommonAncestor(root.left, p , q);
		else if(p.val > root.val && q.val > root.val)
			return lowestCommonAncestor(root.right, p, q);
		else
			return root;
	
    }
	//236
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if (root == null || root == p || root == q) {
	        return root;
	    }
	    TreeNode l = lowestCommonAncestor(root.left, p, q);
	    TreeNode r = lowestCommonAncestor(root.right, p, q);
	    return l != null && r != null?root : l == null?r: l;
    }
	//118
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ret = new LinkedList<>();
		if(numRows == 0)
			return ret;
		
		List<Integer> temp = new LinkedList<>();
		temp.add(1);
		ret.add(temp);
		
		int i = 0;
		while(i < numRows - 1){
			temp = new LinkedList<>();
			temp.add(1);
			List<Integer> temp_front = ret.get(i);
			for(int j = 0; j < temp_front.size() - 1; j++)
				temp.add(temp_front.get(j) + temp_front.get(j + 1));
			temp.add(1);
			ret.add(temp);
			i++;
			
		}
		return ret;
		
    }	
	public static void main(String args[]){
		LeetCode l = new LeetCode();
		System.out.println(l.addBinary("1010", "1010"));
	}
}
