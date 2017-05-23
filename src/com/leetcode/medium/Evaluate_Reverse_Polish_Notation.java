package com.leetcode.medium;

import java.util.Stack;

/**
 * 【题目】Evaluate the value of an arithmetic expression in Reverse Polish Notation.

	Valid operators are +, -, *, /. Each operand may be an integer or another expression.

	Some examples:

	  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
	  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * @author huangjl
 *
 */
public class Evaluate_Reverse_Polish_Notation {

	public static void main(String[] args) {
		String[] token1 = {"2", "1", "+", "3", "*"};
		String[] token2 = {"4", "13", "5", "/", "+"};
		
		System.out.println(evaluatePolish(token1));
		System.out.println(evaluatePolish(token2));
	}
	
	public static int evaluatePolish (String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		
		for (String token : tokens) {
			if ("+".equals(token)) {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num2 + num1);
			} else if ("-".equals(token)) {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num2 - num1);
			} else if ("*".equals(token)) {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num2 * num1);
			} else if ("/".equals(token)) {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num2 / num1);
			} else {
				stack.push(Integer.parseInt(token));
			}
		}
		
		if (stack.isEmpty())
			return 0;
		
		return stack.pop();
	}
	
}
