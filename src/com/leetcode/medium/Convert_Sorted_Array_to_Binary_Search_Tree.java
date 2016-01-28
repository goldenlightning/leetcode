package com.leetcode.medium;

public class Convert_Sorted_Array_to_Binary_Search_Tree {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 5, 7, 8, 9};
		TreeNode node = sortedArrayToBST(num);
		System.out.println(node.value + "------" + node.left.value + "------" + node.right.value);
	}

	public static TreeNode sortedArrayToBST(int[] num) {
		if(num == null || num.length == 0) {
			return null;
		}
		return buildTree(num, 0, num.length - 1);
	}

	private static TreeNode buildTree(int[] num, int start, int end) {
		if(start > end) {
			return null;
		}
		
		int mid = (start + end) / 2;
		
		TreeNode root =  new TreeNode(num[mid]);
		root.left = buildTree(num, start, mid - 1);
		root.right = buildTree(num, mid + 1, end);
				
		return root;
	}
	
}
