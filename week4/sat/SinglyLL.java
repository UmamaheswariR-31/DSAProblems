package week4.sat;

import org.junit.Test;

import week4.sat.SinglyLL.Linkedlist.Node;

public class SinglyLL {
   @Test
	//public static void main(String[] args)
	public void example()
	{
		
		Linkedlist ll = new Linkedlist();
		ll.add("10");
		ll.add("20");
		ll.add("30");
		System.out.println(ll);

	}
	class Linkedlist{
		class Node{
			String data =null;
			Node next=null;
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
		}
		size++;
		
	}
	
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		Node current =start;
		while(current!=null) {
			sb.append(current.data);
			if(current!=null) {
			sb.append(",");
		}
		current=current.next;
	}
		sb.append("]");
		
	  
		
		return sb.toString();
		
	}
	
	}
}
