package com.leetcode.easy;

/**
 * 【题目】Given two binary strings, return their sum (also a binary string).
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 * 
 * @author huangjl
 *
 */
public class Add_Binary {

	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));
		
		
		System.out.println(addBinary("11", "11"));
	}
	
	
	public static String addBinary(String a, String b) {
		
		int carry = 0;
		String ret = "";
		int i = 0;
		int j = 0;
		int sum = 0;
		
		for (i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--,j--) {
			int m = a.charAt(i) - '0';
			int n = b.charAt(j) - '0';
			
			 sum = m + n + carry;
			
			if (sum >= 2) {
				sum -= 2;
				carry = 1;
			}
			
			ret = sum + ret;
		}
		
		if (i >= 0) {
			return prepend(ret, a, i, carry);
		}
		
		if (j >= 0) {
			return prepend(ret, b, j, carry);
		}
		
		if (carry > 0) {
			ret = "1" + ret;
		}
		
		return ret;
	}


	private static String prepend(String ret, String a, int i, int carry) {
		for (int k =i; k >= 0; k--) {
			int m = a.charAt(k) - '0';
			int n = carry;
			
			int result = m + n;
			
			if (result >= 2) {
				result -= 2;
				carry = 1;
			} else {
				carry = 0;
			}
			
			ret = result + ret;
		}
		
		if (carry > 0) {
            ret = '1' + ret;
        }
 
        return ret;
		
	}
	
}
