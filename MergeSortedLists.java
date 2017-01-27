package com.leetcode.easy;

public class MergeSortedLists {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode head = null;

		if(l1==null) return l2;
		
		if(l2==null) return l1;
		
		if (l1.val < l2.val) {
			head = new ListNode(l1.val);
			l1 = l1.next;
		} else {
			head = new ListNode(l2.val);
			l2 = l2.next;
		}

		ListNode currentNode = head;

		while (l1 != null && l2 != null) {

			if (l1.val < l2.val) {
				currentNode.next = new ListNode(l1.val);
				l1 = l1.next;
			} else {
				currentNode.next = new ListNode(l2.val);
				l2 = l2.next;
			}

			currentNode = currentNode.next;

		}

		if (l1 != null || l2 != null) {

			ListNode temp = l1 == null ? l2 : l1;
			while (temp != null) {
				currentNode.next = new ListNode(temp.val);
				temp = temp.next;
				currentNode = currentNode.next;
			}
		}

		return head;

	}
}
