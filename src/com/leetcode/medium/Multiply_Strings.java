package com.leetcode.medium;

public class Multiply_Strings {

	public static void main(String[] args) {

	}
	
	public static String multiplyStrings(String num1, String num2) {
		if(num1 == null || num2 == null)
			return null;
		
		if(num1.equals("0") || num2.equals("0"))
			return "0";
		
		String res = "";
		for(int i = num1.length() - 1; i >= 0; i--) {
			int n = num1.charAt(i) - '0';
			
			int carray = 0;
			String sum = "";
			for(int j = num2.length() - 1; i >= 0; j--) {
				int k = num2.charAt(j) - '0';
				int currentValue = n * k + carray;
				
				carray = currentValue / 10;
				
				String digit = currentValue % 10 + "";
				
				sum = digit + sum;
			}
			
			if(carray > 0) {
				sum = carray + sum;
			}
			
			res = add(res, sum, num1.length() - 1 - i );
			
		}
		
		return null;
	}

	private static String add(String res, String sum, int pos) {
		for(int i = 0; i < pos; i++) {
			res = res + "0";
		}
		
		for(int i = res.length() - 1; i >= 0; i--) {
			
		}
		
		
		
		
		return null;
	}

}
