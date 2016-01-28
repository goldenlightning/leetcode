package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ¡¾ÌâÄ¿¡¿Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.

	For example,
	Given n = 3, your program should return all 5 unique BST's shown below.
	
	   1         3     3      2      1
	    \       /     /      / \      \
	     3     2     1      1   3      2
	    /     /       \                 \
	   2     1         2                 3

 * @author huangjl
 *
 */
public class Unique_Binary_Search_Trees_II {

	public static void main(String[] args) {
		List<TreeNode> list = generateTrees(3);
		
		for(TreeNode node : list) {
			System.out.println(node.value);
		}
	}

	public static List<TreeNode> generateTrees(int n) {
		if (n == 0) {
			return Collections.emptyList();
		}
		
		return generateTrees(1, n);
	}

	private static List<TreeNode> generateTrees(int start, int end) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		if(start > end) {
			result.add(null);
			return result;
		}
		
		List<TreeNode> leftTree = new ArrayList<TreeNode>();
		List<TreeNode> rightTree = new ArrayList<TreeNode>();
		for(int i = start; i <= end; i++) {
			leftTree = generateTrees(start, i - 1);
			rightTree = generateTrees(i + 1, end);
			
			for(int j = 0; j < leftTree.size(); j++) {
				for(int k = 0; k < rightTree.size(); k++) {
					TreeNode node = new TreeNode(i);
					node.left = leftTree.get(j);
					node.right = rightTree.get(k);
					result.add(node);
				}
			}
		}
		
		return result;
	}
	
	

}
