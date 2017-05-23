package com.leetcode.easy;

import com.leetcode.medium.TreeNode;

/**
 * 【题目】Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the 
 * depth of the two subtrees of every node never differ by more than 1.
 * @author huangjl
 *
 */
public class Balanced_Binary_Tree {
	
	public static void main(String[] args) {
		
		
		TreeNode f = new TreeNode(6);
		TreeNode d = new TreeNode(f, null, 4);
		TreeNode e = new TreeNode(5);
		
		TreeNode b = new TreeNode(d, e, 2);
		TreeNode c = new TreeNode(null, null, 3);
		
		TreeNode a = new TreeNode(b, c, 1);
		
		System.out.println(isBalanced2(a));
		
	}
	
	public static boolean isBalanced2 (TreeNode node) {
		if (node == null)
			return true;
 
		try {
			getHeight(node);
		} catch (RuntimeException ex) {
			return false;
		}
 
		return true;
	}

	public static boolean isBalanced(TreeNode root) {
		try {
			System.out.println(getHeight(root));
		} catch (RuntimeException e) {
			return false;
		}
		
		return true;
	}

	private static int getHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		
		if (Math.abs(left - right) > 1)
			throw new RuntimeException(left - right + "");

		return Math.max(left, right) + 1;
	}
	
}
