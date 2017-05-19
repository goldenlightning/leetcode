package com.leetcode.easy;

/**
 * 【题目】The count-and-say sequence is the sequence of integers beginning as follows:
	1, 11, 21, 1211, 111221, ...

	1 is read off as "one 1" or 11.
	11 is read off as "two 1s" or 21.
	21 is read off as "one 2, then one 1" or 1211.

	Given an integer n, generate the nth sequence.

	Note: The sequence of integers will be represented as a string.
 * @author huangjl
 *
 */
public class Count_and_Say {

	public static void main(String[] args) {
		
		System.out.println("-------->" + countAndSay(6));
		
	}
	
	
	public static String countAndSay(int n) {
		String s = "1";
		
		if (n == 1)
			return s;
		
		for (int i = 2; i <= n; i++) {
			char lastChar = 0;  
			int lastAmount = 0;
			
			String ss2 = "";
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				
				if (lastChar != 0 && ch != lastChar ) {
					ss2 += lastAmount + "" + lastChar;
					lastAmount = 0;
				}
				lastChar = ch;
				lastAmount++;
			}
			ss2 += lastAmount + "" + lastChar;
			s = ss2;
		}
		
		return s;
	}
	
	
	
}
