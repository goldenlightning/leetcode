package com.leetcode.easy;

/**
 * Note:
	Given n will always be valid.
	Try to do this in one pass.
 * @author huangjl
 *
 */
public class Remove_Nth_Node_From_End_of_List {

	public static void main(String[] args) {
		ListNode n5 = new ListNode(5, null);
		
		ListNode n4 = new ListNode(4, n5);
		
		ListNode n3 = new ListNode(3, n4);
		
		ListNode n2 = new ListNode(2, n3);
		
		ListNode n1 = new ListNode(1, n2);
		
//		System.out.println(removeNthFormEnd(n1, 2));
		removeNthFormEnd(n1, 2);
		
		while (n1 != null) {
			System.out.print(n1.value + "->");
			n1 = n1.next;
		}
	}
	
	public static ListNode removeNthFormEnd(ListNode head, int n) {
		if (head == null || head.next == null) {
			return null;
		}
		
		ListNode faster = head;
		ListNode slower = head;
		
		for (int i = 0; i < n; i++) {
			faster = faster.next;
		}
		
		if (faster == null) {
			head = head.next;
			return head;
		}
		
		while (faster.next != null) {
			faster = faster.next;
			slower = slower.next;
		}
		
		slower.next = slower.next.next;
		
		
		return head;
	}

}
