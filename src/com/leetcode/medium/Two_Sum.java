package com.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * ¡¾ÌâÄ¿¡¿Given an array of integers, find two numbers such that they add up to a specific target number.

	The function twoSum should return indices of the two numbers such that they add up to the target, 
	where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
	
	You may assume that each input would have exactly one solution.
	
	Input: numbers={2, 7, 11, 15}, target=9
	Output: index1=1, index2=2

 * @author huangjl
 *
 */
public class Two_Sum {

	public static void main(String[] args) {
		int[] result = twoSum2(new int[] {2, 7, 11, 15}, 18);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < numbers.length; i++) {
			map.put(numbers[i], i + 1);
		}
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			int last = target - entry.getKey();
			if(last != entry.getKey() && map.containsKey(last)) {
				int index = map.get(last);
				if(index > entry.getValue()) {
					return new int[] {entry.getValue(), index};
				} else {
					return new int[] {index, entry.getValue()};
				}
			}
		}
		
		return null;
	}
	
	public static int[] twoSum2(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < numbers.length; i++) {
			if(!map.containsKey(numbers[i])) {
				map.put(numbers[i], i);
			}
			
			int last = target - numbers[i];
			if(map.containsKey(last) && map.get(last) < i) {
				return new int[] {map.get(last) + 1, i + 1};
			}
			
		}
		
		return null;
	}

}
