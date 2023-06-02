package week4.sat;

import org.junit.Test;

import week4.sat.SinglyLL.Linkedlist;

public class FixOrder {
	@Test
	public void example1() {
		
		Linkedlist ll = new Linkedlist();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("a");
		ll.add("b");
		ll.add("c");
		
		System.out.println(ll);
		
	}

}
