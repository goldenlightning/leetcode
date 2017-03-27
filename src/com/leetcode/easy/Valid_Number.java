package com.leetcode.easy;

/**
 * 【题目】Validate if a given string is numeric.
 * Some examples:
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * 
 * Note: It is intended for the problem statement to be ambiguous.
 * You should gather all requirements up front before implementing one.
 * @author huangjl
 *
 */
public class Valid_Number {

	public static void main(String[] args) {
		System.out.println(isValidNumber("2e10"));
		System.out.println(isValidNumber("abc"));
		System.out.println(isValidNumber("1 a"));
	}
	
	public static boolean isValidNumber(String s) {
		try {
			Double.parseDouble(s);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
	
	
}
