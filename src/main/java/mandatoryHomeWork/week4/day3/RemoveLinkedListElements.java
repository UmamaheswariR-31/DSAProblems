package week4.day3;

import org.junit.Test;

public class RemoveLinkedListElements  extends LL1 {
	/**
	 * https://leetcode.com/problems/remove-linked-list-elements/
	 * 
	 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
	 * 
	 * 
	 * Input: head = [1,2,6,3,4,5,6], val = 6
       Output: [1,2,3,4,5]
	 * 
	 * Input: head = [], val = 1
       Output: []
	 * 
	 * Input: head = [7,7,7,7], val = 7
Output: []
	 * 
	 */
	
	@Test
	public void example()  {
		Node newNode = new Node(1);
		newNode.next = new Node(2);
		newNode.next.next = new Node(6);
		newNode.next.next.next = new Node(3);
		newNode.next.next.next.next = new Node(4);
		newNode.next.next.next.next.next = new Node(5);
		newNode.next.next.next.next.next.next = new Node(6);
		int val = 6;	
		
		Node removeElements = removeElements(newNode, val);
		display(removeElements);
	}
	
	@Test
	public void example1() {

		Node newNode = new Node(7);
		newNode.next = new Node(7);
		newNode.next.next = new Node(7);
		newNode.next.next.next = new Node(7);

		int val = 7;
		Node removeElements = removeElements(newNode, val);
		display(removeElements);
	}
	
	public Node removeElements(Node head, int val) {

		if (head == null) {

			return head;
		} else {
			Node temp = head;
			Node temp1 = head.next;
			while (temp.next != null) {
				if (temp.data == val) {
					if (temp == head) {
						head = head.next;
						temp = head;
					}
					else {
						
					}
				} 
				else {
					temp = temp.next;
				}
			}
			if (temp.data == val && temp == head) {
				head = null;
				temp = head;
			}
		}
		return head;

	}
}


