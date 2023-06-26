package week6.day2;

import java.util.Arrays;

import org.junit.Test;

public class ReverseOnlyLetter {
	
	/***
	 * Companies
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.
	 * 
	 * Input: s = "ab-cd"
       Output: "dc-ba"
       
       Input: s = "a-bC-dEf-ghIj"
       Output: "j-Ih-gfE-dCba"
	 * 
	 * Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
	 * 
	 */
	@Test
	public void example() {
		String s= "ab-cd";
		reverseOnlyLetters(s);
	}

	@Test
	public void example1() {
		String s= "a-bC-dEf-ghIj";
		reverseOnlyLetters(s);
	}
	private void reverseOnlyLetters(String s) {
		  char[] ch = s.toCharArray();
		  int left =0 , right= ch.length-1;
		  
		  while(left<right) {
			  if(isLetter(ch[left]) && isLetter(ch[right])) {
				  char temp=ch[left];
				  ch[left++]=ch[right];
				  ch[right--]=temp;
			  }
			  else if(isLetter(ch[left])) {
				  right--;
			  
				  //else
				   {
					  left++;
				  }
			  }
			 // System.out.println(Arrays.toString(ch));
		  }
		  System.out.println(Arrays.toString(ch));
		
	}
	
	private boolean isLetter(char ch)
	{   if(ch=='a'|| ch=='b'|| ch=='c'|| ch=='d'||ch=='e'|| ch=='f'||ch=='g'|| ch=='h'||
	              ch=='i'|| ch=='j'||ch=='k'|| ch=='l'||ch=='m'|| ch=='n'||ch=='o'|| ch=='p'|| ch=='A'|| ch=='B'|| ch=='C'|| ch=='D'||ch=='E'|| ch=='F'||ch=='G'|| ch=='H'
	              )
		return true;
		return false;
		
	}

}
