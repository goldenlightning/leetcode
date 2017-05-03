package com.leetcode.easy;

/**
 * 【题目】Reverse digits of an integer.

	Example1: x = 123, return 321
	Example2: x = -123, return -321
 * @author huangjl
 *
 */
public class Reverse_Integer {

	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
	}
	
	public static int reverse(int x) {
		int sign = 1;
		if (x < 0) {
			sign = -1;
			x = -x;
		}
		
		int result = 0;
		while (x != 0) {
			result = result * 10 + x % 10;
			x = x / 10;
		}
		
		return result * sign;
	}
	
}
