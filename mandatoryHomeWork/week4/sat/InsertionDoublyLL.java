package week4.sat;

import org.junit.Test;

import week4.sat.DoublyLinkedList.Node;

public class InsertionDoublyLL {
	
	@Test	
	public void example1() {
			
			InsertionDoublyLinkedList idl = new InsertionDoublyLinkedList();
			idl.add("10");
			idl.add("20");
			idl.add("30");
			idl.add("40");
			System.out.println(idl);
			
			idl.insert(3, "25");
			System.out.println(idl);
			
			idl.insert(1, "1");
			System.out.println(idl);
			//idl.insert(10, "100");
			//System.out.println(idl);
			idl.insert(7, "100");
			System.out.println(idl);

		}
	}
	 class InsertionDoublyLinkedList {
		 
		 class Node{
				String data =null;
				Node next=null;
				Node previous =null;
			}
			
			Node start=null;
			
			int size=0;
			
			void insert(int index, String data) {
				if(index >size+1 ||index<1) {
					throw new IndexOutOfBoundsException("Index: " +index +"Size :" +size);
				}
				
				Node node= new Node();
				node.data=data;
				
				if(index==1) {
					node.next=start;
					start.previous=node;
					start=node;
					size++;
					return;
				}
				
				Node current=start;
				int count=1;
				while(count<index-1) {
					current=current.next;
					count += 1;
				}
				node.next=current.next;
				node.previous=current;
				if(current.next!=null) {
					current.next.previous=node;	
				}
				//current.next.previous=node;
				current.next=node;
				size++;
				
			}
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
