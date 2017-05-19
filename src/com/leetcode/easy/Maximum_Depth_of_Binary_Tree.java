package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.medium.TreeNode;

public class Maximum_Depth_of_Binary_Tree {

	public static void main(String[] args) {
		TreeNode t5 = new TreeNode(5);
		
		TreeNode t31 = new TreeNode(t5, null, 3);
		
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		
		TreeNode t21 = new TreeNode(t31, t4, 2);
		TreeNode t22 = new TreeNode(t4, t3, 2);
		
		TreeNode t1 = new TreeNode(null, t22, 1);
		
		System.out.println(maximumDept(t1));
	}
	
	public static int maximumDept (TreeNode root) {
		if (root == null)
			return 0;
		
		List<TreeNode> list = new ArrayList<>();
		list.add(root);
		
		int dept = 1;
		
		while (!list.isEmpty()) {
			
			List<TreeNode> newList = new ArrayList<>();
			for (TreeNode node : list) {
				if (node.left != null)
					newList.add(node.left);
				
				if (node.right != null) 
					newList.add(node.right);
			}
			
			dept++;
			list = newList;
		}
		
		return dept;
	}
	
}
