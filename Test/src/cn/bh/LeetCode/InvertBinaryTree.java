package cn.bh.LeetCode;

public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {       
		TreeNode returnVal = root;
		if(root == null)
        	return root;
	
		invertLR(returnVal);	
		return  returnVal;
    }
	public void invertLR(TreeNode point) {
        if(point == null)
        	return;
        //swap
        TreeNode temp = point.left;
        point.left = point.right;
        point.right = temp;
        	
        invertLR(point.left);
        invertLR(point.right);        	
    }
}
