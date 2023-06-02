package HackerankAssessment;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Merge2Arrays {
	/**
	 * Given two sorted arrays, merge them to form a single, sorted array with all
	 * items in non-decreasing order a = [1, 2, 3] b = [2, 5, 5]
	 * 
	 * 
	 */
     @Test
	public void example() {
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);

		List<Integer> b = new ArrayList<Integer>();
		b.add(2);
		b.add(5);
		b.add(5);

		List<Integer> res = mergeSortedArrays(a, b);
		printList(res);
		

	}

	private List<Integer> mergeSortedArrays(List<Integer> a, List<Integer> b) {
		int left=0, right=0;
		List<Integer> op =new ArrayList<Integer>();
		while(left<a.size()&&right<b.size())
		{
			if(a.get(left) < b.get(right)) {
				op.add(a.get(left));
				left++;
			} else if (a.get(left)>b.get(right)) {
				op.add(b.get(right));
				right++;
			} else if(a.get(left)==b.get(right)) {
				op.add(a.get(left));
				op.add(b.get(right));
				left++;
				right++;
			}
			
		}
		if(left!=a.size()) {
		 for(int i=left;i< a.size();i++)
		 {
			 op.add(a.get(i));
		 }
		}
		 else if(right!=b.size()) {
			 for(int i=right;i<b.size();i++) {
				 op.add(b.get(right));
			 }
		 }
		 return op;
		}

	private static void printList(List<Integer> list1) {
		for (Integer eachValue : list1) {
			System.out.print(eachValue);
		}
	}
}
