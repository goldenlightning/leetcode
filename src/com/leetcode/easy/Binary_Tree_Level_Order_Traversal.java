package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.medium.TreeNode;

public class Binary_Tree_Level_Order_Traversal {

	public static void main(String[] args) {
		
		TreeNode t15 = new TreeNode(15);
		TreeNode t7 = new TreeNode(7);
		
		TreeNode t20 = new TreeNode(t15, t7, 20);
		TreeNode t9 = new TreeNode(9);
		
		TreeNode t3 = new TreeNode(t9, t20, 3); 
		
		System.out.println(levelOrderBottom(t3));
	}
	
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null) 
			return list;
		
		List<TreeNode> level = new ArrayList<>();
		level.add(root);
		
		while (true) {
			
			List<TreeNode> newLevel = new ArrayList<>();
			List<Integer> item = new ArrayList<>();
			
			for (TreeNode node : level) {
				if (node.left != null) {
					newLevel.add(node.left);
				}
				
				if (node.right != null) {
					newLevel.add(node.right);
				}
				
				item.add((Integer)node.value);
			}
			
			list.add(item);
			
			if (newLevel.isEmpty()) {
				break;
			}
			
			level = newLevel;
		}
		
		return list;
	}
	
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null) 
			return list;
		
		List<TreeNode> nodes = new ArrayList<>();
		nodes.add(root);
		
		traverseLevel(list, nodes);
		
		return list;
	}

	private static void traverseLevel(List<List<Integer>> list, List<TreeNode> nodes) {
		
		List<TreeNode> newNodes = new ArrayList<>();
		List<Integer> item = new ArrayList<>();
		
		for (TreeNode node : nodes) {
			if (node.left != null) {
				newNodes.add(node.left);
			}
			
			if (node.right != null) {
				newNodes.add(node.right);
			}
			
			item.add((Integer)node.value);
		}
		
		if (!newNodes.isEmpty()) {
			traverseLevel(list, newNodes);
		}
		
		list.add(item);
		
	}
	
}
