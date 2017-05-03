package com.leetcode.easy;

/**
 * 【题目】You are climbing a stair case. It takes n steps to reach to the top.

	Each time you can either climb 1 or 2 steps. 
	In how many distinct ways can you climb to the top?
 * @author huangjl
 *
 */
public class Climbing_Stairs {

	public static void main(String[] args) {
		System.out.println(climbingStairs(3));
	}
	
	public static int climbingStairs(int n) {
		if (n == 1 ) 
			return 1;
		if (n == 2)
			return 2;
		
		return climbingStairs(n-1) + climbingStairs(n-2);
	}
	
}
