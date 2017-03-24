package com.leetcode.easy;

/**
 * Determine whether an integer is palindrome. Do this without extra space. 找回文数
 * 
 * @author huangjl
 *
 */
public class Palindrome_Number {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1));
		System.out.println(isPalindrome(0));
		System.out.println(isPalindrome(1));
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome(223424322));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0))
			return false;

		int quotient = x;
		int digits = 0;

		while (quotient != 0) {
			quotient /= 10;
			digits++;
		}

		for (int i = 1; i <= digits / 2; i++) {
			int high = digits - i + 1;
			int low = i;

			if (getDigit(x, high) != getDigit(x, low)) {
				return false;
			}
		}

		return true;
	}

	private static int getDigit(int x, int index) {
		if (index == 1)
			return x % 10;

		return (x % (int) Math.pow(10, index - 1)) % 10;
	}

}
