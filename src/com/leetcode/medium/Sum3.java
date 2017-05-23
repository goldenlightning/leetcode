package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 【题目】Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note:

	Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
	The solution set must not contain duplicate triplets.
    For example, given array S = {-1 0 1 2 -1 -4},

    A solution set is:
    (-1, 0, 1)
    (-1, -1, 2)
 * 
 * @author huangjl
 *
 */
public class Sum3 {

	public static void main(String[] args) {
		
		int[] arr = {-1, 0, 1, 2, -1, -4};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(sum3(arr));
	}
	
	public static List<List<Integer>> sum3 (int[] num) {
		List<List<Integer>> list = new ArrayList<>();
		
		for (int i = 0; i < num.length; i++) {
			if (i != 0 && num[i] == num[i - 1])
				continue;
			
			int cur = num[i];
			
			int left = i + 1;
			int right = num.length - 1;
			
			while (left < right) {
				int sum = cur + num[left] + num[right];
				
				if (sum > 0) {
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					list.add(Arrays.asList(num[i], num[left], num[right]));
					left++;
					right--;
				}
			}
		}
		
		return list;
	}
	
}
