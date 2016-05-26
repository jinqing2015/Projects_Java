package cn.bh.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
public class BinaryTreePaths {

	List<String> result = new LinkedList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return result;
        }
        childBinaryTreePath(root, "");

        return result;
    }

    public void childBinaryTreePath(TreeNode root, String path) {
        path += root.val;

        if (root.left == null && root.right == null) {
            result.add(path);
        } 
        if (root.left != null) {
            childBinaryTreePath(root.left, path + "->");
        }
        if (root.right != null) {
            childBinaryTreePath(root.right, path + "->");
        }
    }
	public static void main(String args[]){
		
	}
}
