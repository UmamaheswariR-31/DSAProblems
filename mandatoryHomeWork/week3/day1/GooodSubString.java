package week3.day1;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GooodSubString {
	/***
	 * A string is good if there are no repeated characters.

Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.
	 * 
	 * Input: s = "xyzzaz"
       Output: 1
	 * 
	 * Input: s = "aababcabc"
       Output: 4
	 * 
	 * Input: s = "xyzzxy"
       Output: 2
       
	 * Pseudocode
	 * 
	 * 1. Intialise count=0, 
	 * 2. Declare the hashmap<Character, Integer>
	 * 3. Iterate the First Window-->0 to K
	 *          Store in hashmap
	 *          if hMap.size==k count++
	 * 4 From second window ---> 1to string.length-k
	 *       if key is already present--> Increment the value +1
	 *       if Key is not present --> keep value as 1
	 *  
	 * Time Complexity---> O(n)
	 * 
	 */
	@Test
	public void example() {
		String s="xyzzxy";
		int k=3;
		goodSubstring(s,k);
	}

	private void goodSubstring(String s, int k) {
		int count=0;
		Map<Character, Integer> hm = new HashMap<>();
		//First Window
		for(int i=0;i<k;i++)
		{
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
			//System.out.println(Arrays.asList(hm));
			//System.out.println(hm.size());
		}
		if(hm.size()==k) count++;//1
		
		//next window:
		for(int i =1;i<=s.length()-k;i++)
			//if value is greater than 1
		{	
			if(hm.get(s.charAt(i-1))>1) //return value
			{
				hm.put(s.charAt(i-1), hm.getOrDefault(s.charAt(i-1), 0)-1);
			} else
			{
				hm.remove(s.charAt(i-1));//Remove
			}
		//Add if there is no record add z //Add
			//if(hm.containsKey(s.charAt(i+k-1))) {
		hm.put(s.charAt(i+k-1), hm.getOrDefault(s.charAt(i+k-1), 0)+1);
		//	}
		 
		if(hm.size()==k) count++;
		//i++;
		
	}
		System.out.println(count);
	}
	//System.out.println(count);

}



