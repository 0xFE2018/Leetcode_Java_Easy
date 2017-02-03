package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = one;

		LinkedListCycle obj = new LinkedListCycle();
		System.out.println(obj.hasCycle(one));
	}

	Set<ListNode> pointers = new HashSet<ListNode>();

	public boolean hasCycle(ListNode head) {
		
		if(head==null) return false;

		ListNode pre = head, post = head;

		while(post.next!=null && post.next.next!=null){
			
			pre=pre.next;
			post=post.next.next;
			
			if(pre==post) return true;
			
		}
		
		return false;
		

	}

}
