package com.leetcode.easy;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class RemoveDuplicatesFromLinkedList {

	public ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode currentNode = head;
		ListNode previousNode = null;

		while (currentNode != null) {

			if (previousNode != null) {
				if (previousNode.val == currentNode.val) {
					previousNode.next = currentNode.next;
				}else{
					previousNode=currentNode;
				}
			}
           
			if(currentNode==head) previousNode=head;
			
			currentNode = currentNode.next;

		}

		return head;

	}
}
