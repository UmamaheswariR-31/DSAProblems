package week2.day2;

import org.junit.Test;

public class MergeStringsAlternativly {
/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Ex1.Input: word1 = "abc", word2 = "pqr"
   Output: "apbqcr"
   Ex2. Input: word1 = "ab", word2 = "pqrs"
        Output: "apbqrs"
   Ex3: Input: word1 = "abcd", word2 = "pq"
        Output: "apbqcd"     
 *
 * 
 */ 
	@Test
	public void example() {
		String s1="abc";
		String s2="pqr";
		//String op;
		mergeStringAlternatively(s1,s2);
		
	}
	@Test
	public void example1() {
		String s1="abcd";
		String s2="pq";
		//String op;
		mergeStringAlternatively(s1,s2);
		/**
		 * Pseudocode
		 * String s1, s2
		 * Declare and initialize ptr i=0, j=0; output op=""
		 * iterate i<=s1.length()-1||j<=s2.length()-1
		 *  Append the String value i j with op
		 *  if i!=s1.lenght)==>append the remaining string s1 with op (get the remaining using substring )
		 *  else
		 *  if j!=s2.lenght ==>append the remaining string s1 with op
		 *  
		 *  Time Complexity:O(n)
		 *  Space Complexity: O(n)==
		 * 
		 * 
		 */	
	}
	@Test
	public void example2() {
		String s1="ab";
		String s2="pqr";
		//String op;
		mergeStringAlternatively(s1,s2);}

private void mergeStringAlternatively(String s1, String s2) {
	int i=0, j=0;
	String op="";
	while(i<=s1.length()-1&&j<=s2.length()-1) {
		op=op+s1.charAt(i)+s2.charAt(j);
		i++;j++;
		//System.out.println(op);
		//System.out.println(i);
			
	} 
	System.out.println(op);
	
	if(i!=s1.length()) {
		String op1=s1.substring(i, s1.length());
		op=op+op1;
		System.out.println(op);
		
	}
	
	if(j!=s2.length()) {
		String op1=s2.substring(j, s2.length());
		op=op+op1;
		System.out.println(op);
		
	}
}
}

