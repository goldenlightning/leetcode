package com.leetcode.easy;

public class Longest_Common_Prefix {

	public static void main(String[] args) {
		String[] str = {"aaabcd", "aaabcccs", "aaabbdd", "aaabcds"};
		
		System.out.println(longestCommonPrefix(str));
	}
	
	public static String longestCommonPrefix(String[] str) {
		if (str == null || str.length == 0)
			return "";
		
		int currentIdx = 0;
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			char ch = 0;
			for (String s : str) {
				if (currentIdx == s.length()) 
					return sb.toString();
				
				if (ch == 0 || ch == s.charAt(currentIdx)) {
					ch = s.charAt(currentIdx);
				} else {
					return sb.toString();
				}
			}
			sb.append(ch);
			currentIdx++;
		}
	}
	
}
