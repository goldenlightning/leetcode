package com.leetcode.easy;

import java.util.Stack;

/**
 * 【题目】Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid. The brackets must close in the
 * correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 * @author huangjl
 *
 */
public class Valid_Parentheses {

	public static void main(String[] args) {
		System.out.println(isValidParentheses(")"));
		System.out.println(isValidParentheses("()"));
		System.out.println(isValidParentheses("()[]{}"));
		System.out.println(isValidParentheses("(]"));
		System.out.println(isValidParentheses("([)]"));

	}

	public static boolean isValidParentheses(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}

			if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
				return false;
			}

			if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
				return false;
			}

			if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
				return false;
			}

		}
		
		return stack.isEmpty();

	}

}
