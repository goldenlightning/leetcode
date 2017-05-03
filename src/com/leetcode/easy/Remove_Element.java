package com.leetcode.easy;

import java.util.Arrays;

public class Remove_Element {

	public static void main(String[] args) {
		int[] a = new int[] {3, 2, 4, 1, 2, 4, 5};
		System.out.println(a.length);
		
		System.out.println(removeElement(a, 2));
		System.out.println(Arrays.toString(a));
	}
	
	public static int removeElement(int[] A, int elem) {
		int pos = 0;
		
		for (int a : A) {
			if (a != elem) {
				A[pos++] = a;
			}
		}
		
		return pos;
	}
	
}
