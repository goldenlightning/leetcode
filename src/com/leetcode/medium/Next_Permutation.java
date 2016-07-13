package com.leetcode.medium;

import java.util.Arrays;

/**
 * 【题目】Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
	
	If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
	
	The replacement must be in-place, do not allocate extra memory.
	
	Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
	1,2,3 → 1,3,2
	3,2,1 → 1,2,3	这种情况就是如果拿不到更大一点的数，取到最小值
	1,1,5 → 1,5,1
 * @author huangjl
 *
 */
public class Next_Permutation {

	public static void main(String[] args) {
		int[] ints = nextPermutation(new int[] {1, 2, 3});
		System.out.println(Arrays.toString(ints));
		
		ints = nextPermutation(new int[] {3, 2, 1});
		System.out.println(Arrays.toString(ints));
		
		ints = nextPermutation(new int[] {1, 1, 5});
		System.out.println(Arrays.toString(ints));
		
		ints = nextPermutation(new int[] {1,4,3,2});
		System.out.println(Arrays.toString(ints));

	}
	
	/**
	 * 这道题我也是看了网上算法才了解，其实说通了就很简单的算法
	 * 1.从最后一位找数据，如果一直从小到大，直到发现一个不是这样的数时，将它和右边数值中最小数进行调换
	 * 2.然后对于这个数右边数从小到大排列，组成的数一定是只比当前数刚刚大一点
	 * 3.如果从右到左一直从小到大，则说明这个数是最大数了，没有比它大的数了，所以把数重新从小到大排列
	 * @param nums
	 * @return
	 */
	public static int[] nextPermutation(int[] nums) {
		if(nums == null || nums.length < 2)
			return nums;
		
		int pos = -1;
		for(int i = nums.length - 1; i > 0; i--) {
			if(nums[i] > nums[i - 1]) {
				pos = i - 1;
				nums[pos] = min(pos, nums, nums[pos]);
				break;
			}
		}
		sortAsc(pos, nums);
		
		return nums;
	}


	private static void sortAsc(int position, int[] nums) {
		Arrays.sort(nums, position+1, nums.length);
	}


	private static int min(int start, int[] nums, int value) {
		int min = Integer.MAX_VALUE;
		int pos = 0;
		for(int i = start + 1; i <= nums.length - 1; i++) {
			if(nums[i] < min) {
				min = nums[i];
				pos = i;
			}
		}
		nums[pos] = value;
		return min;
	}

}
