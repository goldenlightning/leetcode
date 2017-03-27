package com.leetcode.easy;

/**
 * 【题目】Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases. For example, "A man, a plan, a
 * canal: Panama" is a palindrome. "race a car" is not a palindrome. Note: Have
 * you consider that the string might be empty? This is a good question to ask
 * during an interview. For the purpose of this problem, we define empty string
 * as valid palindrome.
 * 
 * @author huangjl
 *
 */
public class Valid_Palindrome {

	public static void main(String[] args) {
		System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));

		System.out.println(isValidPalindrome("race a car"));

		System.out.println(isValidPalindrome("rac12 a 21car"));
	}

	public static boolean isValidPalindrome(String s) {
		if (s == null || s.length() == 0)
			return true;

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			char l = s.charAt(left);

			if (!isValidCharacter(l)) {
				left++;
				continue;
			}

			char r = s.charAt(right);

			if (!isValidCharacter(r)) {
				right--;
				continue;
			}

			if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

	private static boolean isValidCharacter(char l) {
		return Character.isAlphabetic(l) || Character.isDigit(l);
	}

}
