package week6.day1;

import org.junit.Test;

public class FirstIndeofFirstOccurenceInaString {
	
	/**
	 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	 * 
	 * Input: haystack = "sadbutsad", needle = "sad"
       Output: 0
	 * 
	 * Input: haystack = "leetcode", needle = "leeto"
        Output: -1
	 * 
	 */
	
	@Test
	public void example1() {
		String haystack ="sadbutsad";
		String needle ="but";
		System.out.println(firstIndeofFirstOccurenceInaString(haystack,needle));
		
	}
	
	public void example2() {
		String haystack ="leetcode";
		String needle ="leeto";
		firstIndeofFirstOccurenceInaString(haystack,needle);
		
	}

	private int firstIndeofFirstOccurenceInaString(String haystack, String needle) {
		
		for(int i=0;i<haystack.length()-needle.length()+1;i++) {
			if(haystack.charAt(i)==needle.charAt(0)) {
				if(haystack.substring(i, needle.length()+i).equals(needle))
				{
					return i;
				}
			}
			//return -1;
		}
		return -1;
		
	}

}
