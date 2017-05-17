package com.leetcode.easy;

import java.util.Arrays;

/**
 * 【题目】Given two sorted integer arrays A and B, 
 * merge B into A as one sorted array.
 * @author huangjl
 *
 */
public class Merge_Sorted_Array {

	
	public static void main(String[] args) {
		int[] A = {1, 3, 4, 5, 6, 0, 0, 0, 0, 0};
		
		int[] B = {2, 3, 5, 7};
		
		mergeSorted(A, 5, B, 4);
		
		System.out.println(Arrays.toString(A));
	}
	
	public static int[] mergeSorted(int[] A, int m, int[] B, int n) {
		int cur = m + n - 1;
		
		int i = m - 1;
		int j = n - 1;
		
		for (; i >=0 && j >= 0; cur--) {
			if (A[i] > B[j]) {
				A[cur] = A[i];
				i--;
			} else {
				A[cur] = B[j];
				j--;
			}
		}
		
		if (j > 0) {
			while (j >= 0) {
				A[cur] = B[j];
				cur--;
				j--;
			}
		}
		
		return A;
	}
	
}
