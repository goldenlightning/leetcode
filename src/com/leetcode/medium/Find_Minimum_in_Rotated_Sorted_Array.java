package com.leetcode.medium;

/**
 * 【题目】Suppose a sorted array is rotated at some pivot unknown to you beforehand.

	(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

	Find the minimum element.

	You may assume no duplicate exists in the array.
 * @author huangjl
 *
 */
public class Find_Minimum_in_Rotated_Sorted_Array {

	public static void main(String[] args) {
		
//		int[] arr = {4, 5, 6, 7, 0, 1, 2};
		
		int[] arr = {3, 4, 5, 6, 1, 2};
		
		System.out.println(findMinimum(arr));
	}
	
	public static int findMinimum (int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		int min = Integer.MAX_VALUE;
		
		while (left <= right) {
			
			int middle = (left + right) / 2;
			
			if (arr[left] <= arr[middle]) {
				if (arr[left] < min) {
					min = arr[left];
				}
				left = middle + 1;
			} else {
				if (arr[middle] < min)
					min = arr[middle];
				
				right = middle - 1;
			}
		}
		
		return min;
	}
	
}
