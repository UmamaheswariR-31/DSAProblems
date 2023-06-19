package week4.day2;

import java.util.Stack;

import org.junit.Test;

public class BackSpaceString {
	//https://leetcode.com/problems/backspace-string-compare/
	/**
	 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

       Note that after backspacing an empty text, the text will continue empty.
	 * 
	 * Input: s = "ab#c", t = "ad#c"
       Output: true
	 * 
	 * Input: s = "ab##", t = "c#d#"
       Output: true
	 * 
	 * Input: s = "a#c", t = "b"
       Output: false
	 * 
	 */
	 @Test
	    public void example() {
	        String s = "ab#c";
	        String t = "ad#c";
	        System.out.println(backspaceCompare(s, t));
	    }
	 
	 @Test
	    public void example1() {
	        String s = "ab##";
	        String t = "c#d#";
	        System.out.println(backspaceCompare(s, t));
	    }
	 
	 @Test
	    public void example2() {
	        String s = "a#c";
	        String t = "b";
	        System.out.println(backspaceCompare(s, t));
	    }

	private String backspaceCompare(String s, String t) {
		char[] s1 = s.toCharArray();
		char[] t2 = t.toCharArray();
		Stack<Character> stack =new Stack<>();
		
	
		
		for(int i=0; i< s1.length;i++) {
			if(s1[i]=='#' && !stack.empty()) {
				stack.pop();
			}else if(s1[i]!='#') {
				stack.push(s1[i]);
			}else {
				stack.push(s1[i]);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.insert(0,stack.pop());
		}
		String op = sb.toString();
		return op;
	}
}
