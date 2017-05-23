package com.leetcode.medium;

/**
 * 【题目】Divide two integers without using multiplication, 
 *        division and mod operator.
 * @author huangjl
 *
 */
public class Divide_Two_Integers {

	public static void main(String[] args) {
		System.out.println(divideTwoIntegers(1500, -11));
	}
	
	public static int divideTwoIntegers(int dividend, int divisor) {
		if (divisor == 0) {
			return -1;
		}
		
		if (dividend == 0)
			return 0;
		
		boolean sign = (dividend < 0 && divisor < 0) || (dividend >= 0 && divisor >= 0);
		
		long dividendL = Math.abs((long)dividend);
		long divisorL = Math.abs((long)divisor);
		
		int move = 0;
		while (true) {
			if ((divisorL << move) > dividendL) {
				break;
			}
			move++;
		}
		
		int i = 0;
		for (i = 0; i < 2 << move; i++) {
			dividendL -= divisorL; 
			System.out.println(i + "---" + dividendL);
			if (dividendL < 0) {
				System.out.println(i + "---xxxxxxx" + dividendL);
				break;
			}
		}
		
		return sign == true ? i : -i;
	}
	
}
