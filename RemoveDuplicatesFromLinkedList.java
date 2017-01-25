package com.leetcode.easy;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class RemoveDuplicatesFromLinkedList {

	public static void main(String... args) {

		RemoveDuplicatesFromLinkedList obj = new RemoveDuplicatesFromLinkedList();
		ListNode head = new ListNode(0);
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(1);
		ListNode three = new ListNode(1);
		ListNode four = new ListNode(2);
		ListNode five = new ListNode(2);

		head.next = one;
		one.next = two;
		two.next = three;
		three.next = four;
		three.next = five;
		five.next = null;

		ListNode newHead = obj.deleteDuplicates(head);
		ListNode currentNode = newHead;
		while (currentNode != null) {
			System.out.println(currentNode.val + "-->");
			currentNode = currentNode.next;
		}

	}

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
