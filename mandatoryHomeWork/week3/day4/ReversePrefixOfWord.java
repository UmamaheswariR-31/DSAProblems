package week3.day4;

import org.junit.Test;

public class ReversePrefixOfWord {
	/**
	 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
	 * 
	 * Ex1 Input: word = "abcdefd", ch = "d"
           Output: "dcbaefd"
       
	 *Ex2 Input: word = "xyxzxe", ch = "z"
          Output: "zxyxxe" 
          
      Ex3: Input: word = "xyxzxe", ch = "z"
           Output: "zxyxxe" 
	 * 
	 * Pseudocode:
	 * 1. Initialise left =0, right=0
	 * 2. Keep moving right till ch=d
	 * 3. if nums[right]=="d"-->swap right to left
	 * 4. Left++, right--
	 * 
	 * 
	 */
	@Test
	public void example() {
		String s= "abcdefd";
		char ch='d';
		reversePrefix(s,ch);
		
	}

	private void reversePrefix(String s, char ch) {
		int left=0, right=0;
		for(right=0;right<=s.length();right++) 
		{
			if(s.charAt(right)==ch) 
			{
				break;
			}
			
				char[] arr= s.toCharArray();
				while(left<right) {
					char temp= arr[right];
					arr[right--]=arr[left];
					arr[left++]=temp;
				
			}
				System.out.println(String.valueOf(arr));
			
		}
		
		
		
	}

}
