package com.leetcode.easy;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 1, 2, 2, 3 , 4, 4};
		System.out.println(removeDuplicates(arr));
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static int removeDuplicates(int[] arr) {
		if (arr == null)
			return 0;
		
		if (arr.length == 1) 
			return 1;
		
		int start = 0;
//		int current = 1;
		int pos = 1;
		
		for(int current = 1; current < arr.length; current++) {
			if (arr[start] != arr[current]) {
				arr[pos++] = arr[current];
				start++;
			} 
		}
		
		
		return pos;
	}
	
}
