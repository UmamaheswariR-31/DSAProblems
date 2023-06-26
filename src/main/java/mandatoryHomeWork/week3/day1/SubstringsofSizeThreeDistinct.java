package week3.day1;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SubstringsofSizeThreeDistinct {
	/**
	 * 
	 * A string is good if there are no repeated characters.

Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.
	 * 
	 * Ex1:
	 *   Input: s = "xyzzaz"
         Output: 1
	 *  E2
	 *  Input: s = "aababcabc"
     *  Output: 4
	 * 
	 */
	
	@Test
	public void example() {
		String s= "xyzzaz";
		System.out.println(goodStringCount(s));
	}
	
	@Test
	public void example1() {
		String s= "aababcabc";
		System.out.println(goodStringCount(s));
	}

	private int goodStringCount(String s) {
		if(s.length()<3)
		return 0;
		
		int count =0, left = 0, right=0;
		Map<Character, Integer> inputMap = new HashMap<>();
		for(int i=0; i<3;i++) {
			inputMap.put(s.charAt(i), inputMap.getOrDefault(s.charAt(i), 0)+1);//xyzzaz
			right++;
		}
		
		if(inputMap.size()==3) count++;//1
		
		while(left<s.length()-3)
		{
			if(inputMap.get(s.charAt(left)) > 1)//REMOVE
				{
				 inputMap.put(s.charAt(left), inputMap.getOrDefault(s.charAt(left), 0)-1);
				}
			else inputMap.remove(s.charAt(left));//REMOVE
			inputMap.put(s.charAt(right), inputMap.getOrDefault(s.charAt(right), 0)+1);
			
			if(inputMap.size()==3) count++;
			left++;
			right++;
		}
		
		return count;
	}
	

}
