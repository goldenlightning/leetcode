package com.leetcode.easy;

import java.util.Arrays;

/**
 * 题目】The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
 * (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"

 * Write the code that will take a string and make this conversion given a number of rows:

 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * @author huangjl
 *
 */
public class ZigZag_Conversion {

	
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 3));
		System.out.println(convert("PAYPALISHIRING", 4));
	}
	
	public static String convert(String text, int nRows) {
		if (nRows <= 0)
			return text;
		
		String[] arr = new String[nRows];
		
		Arrays.fill(arr, "");
		
		int row = 0;
		int delta = 1;
		for(int i = 0; i < text.length(); i++) {
			arr[row] += text.charAt(i);
			
			row += delta;
			
			if (row >= nRows) {
				row = nRows - 2;
				delta = -1;
			}
			
			if (row <= 0) {
				delta = 1;
			}
		}
		
		String ret = "";
		for (String a : arr) {
			ret += a;
		}
		
		return ret;
	}
	
}
