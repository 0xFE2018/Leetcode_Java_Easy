package com.leetcode.easy;

public class RemoveLinkedList {

	public ListNode removeElement(ListNode head, int value) {
		
		if(head.val==value && head.next==null) return null;
		
		ListNode currentNode=head;
		ListNode previous=null;
		
		while(currentNode !=null){
			if(currentNode.val==value){
				if(previous!=null){
					previous.next=currentNode.next;
				}else{
					head=currentNode.next;
				}
			}else{
				previous=currentNode;
			}
			
			currentNode=currentNode.next;
		}
	
		return head;
	}

}
