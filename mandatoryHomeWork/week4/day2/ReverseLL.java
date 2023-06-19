package week4.day2;

import org.junit.Test;

import LinkedListProblems.ReverseLL.Node;

public class ReverseLL {

	@Test
	public void testReverse() {
		Node head = add(10);
		head.next= add(10);
		head.next.next=add(23);
		head.next.next.next =add(33);
		printAllNodes(head);
		Node tail = reverseNodes(head);
		printAllNodes(tail);
				
		
	}
	
	
	public class Node{
		
		int data;
		Node next;
		Node prev;
		
		Node(int key){
			this.data=key;
			next=null;
			
		}
		
	}
	public Node add(int data) {
		Node node = new Node(data);
		return node;
	}
	
	private void printAllNodes(Node tail) {
		while(tail!=null) {
			System.out.println(tail.data);
		     tail=tail.next;
		
		}
	}
	
	private Node reverseNodes(Node head) {
		Node curr=head, prev=null, next=null;
		while(curr!=null) {
			next=curr.next;
		    curr.next=prev;
		    prev=curr;
		    curr=next;
		  	
	}

	  return prev;

}
	

}
