package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal_Triangle {

	public static void main(String[] args) {
		System.out.println(generateTriangle(5));
	}
	
	public static List<List<Integer>> generateTriangle(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		
		if (numRows > 0) {
			list.add(Arrays.asList(1));
		}
		
		if (numRows > 1) {
			list.add(Arrays.asList(1, 1));
		}
		
		for (int i = 2; i < numRows; i++) {
			List<Integer> current = new ArrayList<>();
			current.add(1);
			
			List<Integer> before =  list.get(i - 1);
			
			for (int j =0; j < before.size() - 1; j++) {
				int sum = before.get(j) + before.get(j + 1);
				current.add(sum);
			}
			
			current.add(1);
			
			list.add(current);
		}
		
		return list;
	}
	
}
