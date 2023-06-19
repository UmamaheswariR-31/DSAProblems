package week4.sat;

import org.junit.Test;

import week4.sat.SinglyLL.Linkedlist;
import week4.sat.SinglyLL.Linkedlist.Node;

public class DoublyLL {
	
@Test	
public void example1() {
		
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.add("10");
		dl.add("20");
		dl.add("30");
		dl.add("40");
		System.out.println(dl);

	}
}
 class DoublyLinkedList {
	 
	 class Node{
			String data =null;
			Node next=null;
			Node previous =null;
		}
		
		Node start=null;
		
		int size=0;
		
		void add(String data) {
			Node node= new Node();
			node.data =data;
			if(start==null)
			{
				start=node;
			} else {
				Node current=start;
				while(current.next!=null) {
					current=current.next;
				}
				current.next =node;
				node.previous=current;
			}
			size++;
			}
		public String toString() {
			StringBuffer sb=new StringBuffer();
			sb.append("[");
			Node current =start;
			while(current!=null) {
				sb.append(current.data + "("+(current.previous!=null?current.previous.data: null)+","+(current.next!=null?current.next.data:null)+")");
				if(current!=null) {
				sb.append(",");
			}
			current=current.next;
			
		}
			sb.append("]");
			return sb.toString();
	
}
 }