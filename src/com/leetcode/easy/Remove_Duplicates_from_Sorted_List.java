package com.leetcode.easy;

/**
 *  题目: Given a sorted linked list, delete all duplicates such that each element appear only once.

	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
 * @author huangjl
 *
 */
public class Remove_Duplicates_from_Sorted_List {

	public static void main(String[] args) {
		ListNode n5 = new ListNode(3, null);
		
		ListNode n4 = new ListNode(3, n5);
		
		ListNode n3 = new ListNode(2, n4);
		
		ListNode n2 = new ListNode(1, n3);
		
		ListNode n1 = new ListNode(1, n2);
		
		removeDuplicates(n1);
		
		while (n1 != null) {
			System.out.print(n1.value + "->");
			n1 = n1.next;
		}
	}
	
	public static ListNode removeDuplicates(ListNode head) {
		if (head == null)
			return null;
		
		ListNode faster = head.next;
		ListNode slower = head;
		
		while (faster != null) {
			if (slower.value == faster.value) {
				slower.next = faster.next;
				faster = faster.next;
			} else {
				slower = slower.next;
				faster = faster.next;
			}
			
		}
		
		return head;
	}
	
}
