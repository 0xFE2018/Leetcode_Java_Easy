package com.leetcode.easy;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class ReverseLinkedList {
	
	public static void main(String...args){
		ReverseLinkedList obj= new ReverseLinkedList();
		ListNode head= new ListNode(0);
		ListNode one= new ListNode(1);
		ListNode two= new ListNode(2);
		ListNode three= new ListNode(3);
		ListNode four= new ListNode(4);
		
		head.next=one;
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=null;
		ListNode node=obj.reverseList(head);
		
		while(node!=null){
			System.out.println(node.val);
			node=node.next;
		}
	}

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode currentNode = head;
		
		while (currentNode!= null) {
			ListNode temp=currentNode.next;
			currentNode.next = prev;
			prev = currentNode;
			currentNode = temp;
		}
		return prev;
	}

}
