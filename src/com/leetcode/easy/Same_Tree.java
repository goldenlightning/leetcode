package com.leetcode.easy;

import com.leetcode.medium.TreeNode;

public class Same_Tree {

	public static void main(String[] args) {
//		TreeNode t5 = new TreeNode(5);
//		
//		TreeNode t31 = new TreeNode(t5, null, 3);
//		
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		
		TreeNode t21 = new TreeNode(null, null, 2);
		TreeNode t22 = new TreeNode(null, null, 2);
		
		TreeNode t1 = new TreeNode(t21, t22, 1);
		TreeNode t2 = new TreeNode(t3, t4, 1); 
		
		System.out.println(isSameTree(t1, t2));
	}
	
	public static boolean isSameTree(TreeNode t1, TreeNode t2) {
		
		if (t1 == null && t2 == null) 
			return true;
		
		if (t1 == null || t2 == null)
			return false;
		
		if (t1.value != t2.value)
			return false;
		
		return isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
	}
	
}
