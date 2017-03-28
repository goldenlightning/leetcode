package com.leetcode.easy;

/**
 * 【题目】Implement atoi to convert a string to an integer.
 * Hint: Carefully consider all possible input cases. 
 * If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * 
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). 
 * You are responsible to gather all the input requirements up front.
 * 
 * 1.数字前面有空格 如s=“    123456”
 * 2.数字前出现了不必要或多于的字符导致数字认证错误，输出0   如s=“   b1234”  ，s=“  ++1233” , s=“ +-1121”
 * 3.数字中出现了不必要的字符，返回字符前的数字 如s=“   12a12” ， s=“ 123  123”
 * 4.数字越界 超过了范围（-2147483648--2147483647) 若超过了负数的 输出-2147483648  超过了正数的输出2147483647
 * @author huangjl
 *
 */
public class String_to_Integer {

	public static void main(String[] args) {
		System.out.println(atoi("    123456"));
		System.out.println(atoi("   b1234"));
		System.out.println(atoi("  ++1233"));
		System.out.println(atoi(" +-1121"));
		System.out.println(atoi("   12a12"));
		System.out.println(atoi(" 123  123"));
		System.out.println(atoi(" 123  123"));
		
	}
	
	
	public static int atoi(String str) {
		if (str == null || str.length() == 0) 
			return 0;
		
		String s = str.trim();
		
		boolean signed = false;
		double result = 0;
		int digit = 0;
		char flag = ' ';
		
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				int num = c - '0';
				result += (num * (int)Math.pow(10, digit));
				digit++;
			} else if (Character.isLetter(c) || Character.isWhitespace(c)) {
				result = 0;
				digit = 0;
			} else if (c == '+' || c == '-') {
				if (signed == true) {
					return 0;
				} else {
					signed = true;
					flag = c;
				}
			}
		}
		
		if (flag == '-') {
			result = - result;
		}
		
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} 
		
		if (result <= Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		
		return (int)result;
	}
	
	
	
	
	
}
