package week4.day1;

import java.util.Stack;

import org.junit.Test;

public class BaseBallStack {
	
	//https://leetcode.com/problems/baseball-game/
	/**
	 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.
Record a new score of x.
'+'.
Record a new score that is the sum of the previous two scores.
'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
	 * 
	 * Input: ops = ["5","2","C","D","+"]
Output: 30
	 * 
	 * Input: ops = ["5","-2","4","C","D","9","+","+"]
Output: 27

	 * Input: ops = ["1","C"]
Output: 0
	 * Time Complexity: O(n)
	 * Space Complexity:O(n)
	 * 
	 
*/
	@Test
	public void example() {
		String[] ops= {"5","2","C","D","+"};
		System.out.println(calPoints(ops));
	}

	private int calPoints(String[] ops) {
	
		Stack<Integer> stack =new Stack<>();
		int ans=0;
		for(String s: ops) {
			if(s.equals("C")) {
				int rm=stack.pop();	
				ans=ans-rm;
			}else if(s.equals("D")) {
				int temp=stack.peek()*2;
				stack.push(temp);
				ans=ans+temp;	
			} else if(s.equals("+")) {
				int temp1=stack.pop();
				int temp2=stack.pop();
				int sum=temp1+temp2;
				stack.push(temp2);
				stack.push(temp1);
				stack.push(sum);
				ans=ans+sum;
			} else {
				int val=Integer.parseInt(s);
				stack.push(val);
				ans=ans+val;
			}
			
			
		}
		return ans;
		
	}

}
