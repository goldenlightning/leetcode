package com.leetcode.medium;
/**
 * ¡¾ÌâÄ¿¡¿Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

	For example,
	Given n = 3, there are a total of 5 unique BST's.
	
	   1         3     3      2      1
	    \       /     /      / \      \
	     3     2     1      1   3      2
	    /     /       \                 \
	   2     1         2                 3

 * @author huangjl
 *
 */
public class Unique_Binary_Search_Trees {

	public static void main(String[] args) {
		System.out.println(numTrees(3));

	}
	
	public static int numTrees(int n) {
		if(n < 0) {
			throw new IllegalArgumentException();
		}
		
		if(n < 2) {
			return 1;
		}
		
		int[] total = new int[n + 1];
		total[0] = total[1] = 1;
		
		for(int i = 2; i < n + 1; i++) {
			for(int k = 0; k < i; k++) {
				total[i] += total[k] * total[i - 1 - k];
			}
		}
		
		return total[n];
	}

}
