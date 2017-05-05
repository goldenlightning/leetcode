package com.leetcode.easy;

import java.util.Arrays;

public class Plus_One {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 2, 1, 5};
		
		plusOne(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[] {9, 9, 9, 9};
		
		
		
		System.out.println(Arrays.toString(plusOne(arr2)));
	}
	
	public static int[] plusOne(int[] digits) {
		if (digits == null)
			return new int[] {1};
		
		int carry = 1;
		int currentDigit = 0;
		
		for (int i = digits.length - 1; i >= 0; i--) {
			currentDigit = digits[i] + carry;
			
			if (currentDigit >= 10) {
				digits[i] = 0;
				carry = 1;
			} else {
				digits[i] = currentDigit;
				return digits;
			}
		}
		
		int[] newDigits = new int[digits.length + 1]; 
		
		System.arraycopy(digits, 0, newDigits, 1, digits.length);
		newDigits[0] = 1;
		
		return newDigits;
	}
	
}
