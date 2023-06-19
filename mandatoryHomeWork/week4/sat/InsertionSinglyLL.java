package week4.sat;

import org.junit.Test;



public class InsertionSinglyLL {
	
	 @Test
		public void example1() throws Exception {
			
			InsertionSingleLL isll = new InsertionSingleLL();
			isll.add("10");
			isll.add("20");
			isll.add("30");
			System.out.println(isll);
			
			
			isll.insert(3, "15");
			System.out.println(isll);
			
			isll.insert(1, "1");
			System.out.println(isll);
			
			//isll.insert(10, "100");
			//System.out.																	println(isll);
			
			isll.insert(6, "100");
			System.out.println(isll);
			

		}
		class InsertionSingleLL{
			
			class Node{
				String data =null;
				Node next=null;
			}
			
			Node start=null;
			
			int size=0;
		
		 void insert(int index, String data) throws Exception {
			if(index>size+1 || index<1) {
				throw new Exception("Index : "+index + "Size:"+size);
			}
			 
			 Node node=new Node();
			 node.data=data;
			
			 if(index==1) {
				 node.next=start;
				 start=node;
				 size++;
				 return;
			 }
			 
			 int count=1;
			 Node current=start;
			 while(count<index-1)
			 {
				 current=current.next;
				 count++;
			 }
			 node.next=current.next;
			 current.next= node;
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
			}
			size++;
			
		}
		
		public String toString() {
			StringBuffer sb=new StringBuffer();
			sb.append("[");
			Node current =start;
			while(current!=null) {
				sb.append(current.data + ", ");
				current=current.next;
		}
			sb.append("]");
		    return sb.toString();
			
		}
		
		}

}
