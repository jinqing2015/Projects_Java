package cn.bh.LeetCode;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SameTree {
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p != null && q != null)
        	return p.val != q.val ? false : isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
		return p==null && q==null;
    }
	public boolean containsDuplicate(int[] nums) {
        
		Set<Integer> number = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        	if(!number.add(nums[i]))
        		return true;
        return false;
    }
}
