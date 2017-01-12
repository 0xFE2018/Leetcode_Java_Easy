package Easy;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class DeleteNodeLinkedList {

	public static void main(String[] args) {
		ListNode node= new ListNode(0);
		node.next=new ListNode(1);
		DeleteNodeLinkedList obj= new DeleteNodeLinkedList();
		obj.deleteNode(node);

	}

	public void deleteNode(ListNode node) {
		if (node.next != null) {
			node.val = node.next.val;
			node.next = node.next.next;
		}else{
			node=null;
		}

	}

}
