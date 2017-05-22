package com.leetcode.easy;

/**
 * 【题目】Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.

	If the last word does not exist, return 0.

	Note: A word is defined as a character sequence consists of non-space characters only.

	For example,
	Given s = "Hello World",
	return 5.
 * 
 * 
 * @author huangjl
 *
 */
public class Length_of_Last_Word {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));
		
		System.out.println(lengthOfLastWord("Hello World  "));

		
		System.out.println(lengthOfLastWord("Hello World    ss sadf "));
	}
	
	public static int lengthOfLastWord (String s) {
		if (s == null || s.length() == 0)
			return 0;
		
		String[] tokens = s.split(" ");
		String lastWord = tokens[tokens.length - 1];
		
		return lastWord.length();
	}
	
}
