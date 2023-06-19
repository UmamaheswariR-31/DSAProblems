package week3.day5;

import org.junit.Assert;
import org.junit.Test;

public class ReverseVowel {
	/**
	 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
	 * Input: s = "hello"
       Output: "holle"
       
       PseudoCode:
        1. Initialize left=0, right=s.lenth-1
        2. convert the string to character array
        3. Create seperate call for Isvowel
        4. Loop the array left<right
             if(arr[left] isVowel && arr[right] isVowel)--->Swap the value
             else if(arr[right] not is Vowel-->right--
             else right--
       * 
	 */
	@Test
	public void example() {
		String s="hello";
		reverseVowel(s);
		Assert.assertEquals(reverseVowel(s), "holle");
	}

	private String reverseVowel(String s) {
		int left =0, right=s.length()-1;
		char[] chArr = s.toCharArray();
		while(left<right)
		{
			if(isVowel(chArr[left]) && isVowel(chArr[right])){
				char temp=chArr[left];
				chArr[left]=chArr[right];
				chArr[right]=temp;	
				
			}
			if(!(isVowel(chArr[right])))
			{
				right--;
				
			}
			if(!(isVowel(chArr[left])))
			{
				left++;
				
			}
				
		}
		return new String(chArr);
		
	}
	private boolean isVowel(char ch) {
		if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u' ||ch=='A' || ch=='E'|| ch=='I'||ch=='O'||ch=='U') {
			return true;
		}
		return false;
	}

}
