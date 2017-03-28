package com.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

import com.leetcode.medium.TreeNode;

/**
 * 【题目】Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 *	For example, this binary tree is symmetric:
  <pre>
    1
   / \
  2   2
 / \ / \
3  4 4  3
 * But the following is not:

    1
   / \
  2   2
   \   \
   3    3
  </pre>
 * @author huangjl
 *
 */
public class Symmetric_Tree {
	
	public static void main(String[] args) {
		TreeNode t5 = new TreeNode(5);
		
		TreeNode t31 = new TreeNode(t5, null, 3);
		
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		
		TreeNode t21 = new TreeNode(t31, t4, 2);
		TreeNode t22 = new TreeNode(t4, t3, 2);
		
		TreeNode t1 = new TreeNode(t21, t22, 1);
		
		System.out.println(isSymmetricTree2(t1));
		
	}
	
	public static boolean isSymmetricTree2 (TreeNode root) {
		if (root == null)
			return true;
		
		Queue<TreeNode> q1 = new LinkedList<>();
		Queue<TreeNode> q2 = new LinkedList<>();
		
		q1.offer(root.left);
		q2.offer(root.right);
		
		while (!q1.isEmpty() && !q2.isEmpty()) {
			TreeNode n1 = q1.poll();
			TreeNode n2 = q2.poll();
			
			if (n1 == null && n2 == null) {
				continue;
			} else if (n1 == null || n2 == null || n1.value != n2.value) {
				return false;
			} 
			
			q1.offer(n1.left);
			q1.offer(n1.right);
			q2.offer(n2.right);
			q2.offer(n2.left);
		}
		
//		return q1.isEmpty() && q2.isEmpty();
		return true;
		
	}
	

	public static boolean isSymmetricTree (TreeNode root) {
		if (root == null)
			return true;
		
		return isSymmetricTree(root.left, root.right);
	}

	private static boolean isSymmetricTree(TreeNode tree1, TreeNode tree2) {
		if (tree1 == null && tree2 == null)
			return true;
		
		if (tree1 == null || tree2 == null)
			return false;
		
		if (tree1.value != tree2.value)
			return false;
		
		
		return isSymmetricTree(tree1.left, tree2.right) && isSymmetricTree(tree1.right, tree2.left);
	}
	
}
