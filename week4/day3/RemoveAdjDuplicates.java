package week4.day3;

import java.util.Stack;

import junit.framework.Assert;

public class RemoveAdjDuplicates {
	/**
	 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
	 * 
	 *
	 */
	
	@SuppressWarnings("deprecation")
	public void example1() {
		String input="abbaca";
		Assert.assertEquals("ca", removeAdjDuplicates(input));
	}

	
	@SuppressWarnings("deprecation")
	public void example2() {
		String input="abbbcd";
		Assert.assertEquals("acd", removeAdjDuplicates(input));
	}
	
	@SuppressWarnings("deprecation")
	public void example3() {
		String input="abcd";
		Assert.assertEquals("abcd", removeAdjDuplicates(input));
	}
	
	@SuppressWarnings("deprecation")
	public void example4() {
		String input="aabb";
		Assert.assertEquals("", removeAdjDuplicates(input));
	}
	
	private String removeAdjDuplicates(String input) {
	    if(input.length()<2)
	    	return input;
	    
	    char[] charArray =input.toCharArray();
	    
	    Stack stack =new Stack();
	    for(char ch:charArray )
	    {
	    	if(!stack.isEmpty()&&stack.peek()==ch)
	    		stack.pop();
	    	else
	    		stack.push(ch);
	    }
	    
	    StringBuilder sb =new StringBuilder();
	    while(!stack.isEmpty())
	    	sb.append(stack.pop())
		return sb.toString();
	}

}
