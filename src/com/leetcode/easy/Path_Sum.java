package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.medium.TreeNode;

public class Path_Sum {

	public static void main(String[] args) {

		TreeNode t7 = new TreeNode(7);
		TreeNode t2 = new TreeNode(2);
		TreeNode t1 = new TreeNode(1);

		TreeNode t4 = new TreeNode(null, t1, 4);
		TreeNode t13 = new TreeNode(13);
		TreeNode t11 = new TreeNode(t7, t2, 11);

		TreeNode t8 = new TreeNode(t13, t4, 8);
		TreeNode t41 = new TreeNode(t11, null, 4);

		TreeNode root = new TreeNode(t41, t8, 5);

		System.out.println(hasPathSum(root, 22));
	}

	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;

		List<Integer> results = calculatePathSum(root);

		return results.contains(sum);
	}

	private static List<Integer> calculatePathSum(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();

		if (root.left == null && root.right == null) {
			list.add(root.value);
		}

		if (root.left != null) {
			for (int num : calculatePathSum(root.left)) {
				list.add(num + root.value);
			}
		}

		if (root.right != null) {
			for (int num : calculatePathSum(root.right)) {
				list.add(num + root.value);
			}
		}

		return list;
	}

}
