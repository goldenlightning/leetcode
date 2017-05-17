package com.leetcode.easy;

/**
 * 【题目】Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 * 
 * @author huangjl
 *
 */
public class Merge_Two_Sorted_Lists {

	public static void main(String[] args) {
		ListNode n5 = new ListNode(5, null);
		
		ListNode n4 = new ListNode(3, n5);
		
		ListNode n3 = new ListNode(3, n4);
		
		ListNode n2 = new ListNode(2, n3);
		
		ListNode n1 = new ListNode(1, n2);
		
		
		ListNode n25 = new ListNode(9, null);
		
		ListNode n24 = new ListNode(8, n25);
		
		ListNode n23 = new ListNode(3, n24);
		
		ListNode n22 = new ListNode(3, n23);
		
		ListNode n21 = new ListNode(2, n22);
		
		ListNode t1 = mergeTwoLists(n1, n21);
		
		while (t1 != null) {
			System.out.print(t1.value + "->");
			t1 = t1.next;
		}
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		
		if (l2 == null)
			return l1;
		
		ListNode head, tail;
		if (l1.value <= l2.value) {
			head = tail = l1;
			l1 = l1.next;
		} else {
			head = tail = l2;
			l2 = l2.next;
		}
		
		while (l1 != null && l2 != null) {
			if (l1.value <= l2.value) {
				tail.next = l1;
				tail = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				tail = l2;
				l2 = l2.next;
			}
		}
		
		if (l1 != null) {
			tail.next = l1;
		}
		
		if (l2 != null) {
			tail.next = l2;
		}
		
		return head;
	}
	
}
