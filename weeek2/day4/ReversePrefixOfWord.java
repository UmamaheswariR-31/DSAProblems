package weeek2.day4;

import java.util.Arrays;

import org.junit.Test;

public class ReversePrefixOfWord {
	/*
	 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
	 * 
	 * Input: word = "abcdefd", ch = "d"
       Output: "dcbaefd"
       
       Input: word = "xyxzxe", ch = "z"
       Output: "zxyxxe"
	 * 
	 * PseudoCode
	 * 1. get the part of the string using substring (0, string inde of ch+1)
	 * 2. Reverse the substring using two pointer
	 *      convert substring to Char array
	 *      int i=0, j=Char Array lenght-1
	 *      Iterate till i<j
	 *      swapt the chArr[i] with chArr[j]
	 *  3 Get the remaining string using substring (string inde of ch+1. String lengrh)
	 *  4. Concatenate Step2 and Step3
	 *  
	 *      
	 *   
	 * 
	 * 
	 * 
	 */
	@Test
	public void example() {
		String str="abcdefd";
		char ch='d';
		reversePrefixword(str,ch);
	}
	@Test
	public void example1() {
		String str="xyxzxe";
		char ch='z';
		reversePrefixword(str,ch);
	}

	private void reversePrefixword(String str,char ch) {
    int indexOf =str.indexOf(ch);
    System.out.println(indexOf);
    String substring = str.substring( 0, indexOf+1 );
    System.out.println(substring); //abcd
    
    char[] chArr = substring.toCharArray();
    int i=0, j=chArr.length-1;
    
    while(i<j) {
    	char temp=chArr[i];
    	chArr[i++]=chArr[j];
    	chArr[j--]= temp;
    	
    }
    System.out.println(Arrays.toString(chArr));//[d,c,b,a]
    
    String op=new String(chArr);
    System.out.println(op);
    String op2 = str.substring(str.indexOf(ch)+1, str.length());
    op=op+op2;
    System.out.println(op);
    
    
    
    
	}

}
