package com.leetcode.medium;

public class TreeNode {

	public TreeNode left;
	public TreeNode right;
	public Object value;
	
	public TreeNode(TreeNode left,  TreeNode right, Object value) {
		this.left = left;
		this.right = right;
		this.value = value;
	}
	
	public TreeNode(Object value) {
		this.value = value;
	}
	
}
