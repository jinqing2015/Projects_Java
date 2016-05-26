package cn.bh.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MaximumDepthofBinaryTree {

	public int maxDepth1(TreeNode root) {
		
		TreeNode p = root;
		if(root == null)  
            return 0;  
		else
			root.val = 1;
        Deque<TreeNode> q = new LinkedList<>();;  
        q.push(p);  
        while(!q.isEmpty())  
        {  
        	//TreeNode curNode = q.front();
        	TreeNode curNode = q.peek();  
            q.pop();  
            if(q.isEmpty() && curNode.left != null && curNode.right != null)  
                return curNode.val;  
            if(curNode.left != null)  
            {  
                curNode.left.val = curNode.val+1;  
                q.push(curNode.left);  
            }  
            if(curNode.right != null)  
            {  
                curNode.right.val = curNode.val+1;  
                q.push(curNode.right);  
            }  
            
        }
        return root.val;
    }
	public int maxDepth2(TreeNode root) {
        int depth = 0;
        int max = 0;
        int popNum = 0;
        Deque<TreeNode> stack = new LinkedList<>();
        if(root == null)
        	return 0;
        TreeNode p = root;

        while(p != null || !stack.isEmpty()){
        	if(p != null){
        		popNum = 0;
        		stack.push(p);
        		depth++;
        		if(depth > max)	max = depth;  
        		p = p.left;
        	}else{
        		p = stack.pop();
        		popNum++;
        		p = p.right;
        	}
        	if(popNum >= 2) depth--;
        	
        }
        
        
        return max;
    }
	public int maxDepth(TreeNode root)
	{
	    return maxDepth(root, 0);
	}

	private int maxDepth(TreeNode node,int depth)
	{
	    if(node==null) return depth;

	    return Math.max(maxDepth(node.left,depth+1), maxDepth(node.right, depth+1));
	}
}
