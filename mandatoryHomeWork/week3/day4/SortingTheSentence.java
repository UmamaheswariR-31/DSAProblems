package week3.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class SortingTheSentence {
	
	/**
	 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
	 * 
	 * Ex1"
	 * Input: s = "is2 sentence4 This1 a3"
       Output: "This is a sentence"
	 * 
	 * Ex2
	 * Input: s = "Myself2 Me1 I4 and3"
       Output: "Me Myself and I"
	 * 
	 * PseudoCode:
	 * Sp
	 * 
	 *Time com: O(n)
	 */
	@Test
	public void example() {
		String s= "is2 sentence4 This1 a3";
		sortingTheSentence(s);
	}

	private void sortingTheSentence(String s) {
		
		String[] strArr = s.split(" ");
		TreeMap<Integer,String> hm =new TreeMap<Integer,String>();
		for(int i=0;i<=strArr.length-1;i++) {
			String s1 = strArr[i]; //is2--3//sentence4
			int num= s1.charAt(s1.length()-1);//Ascci
			String sub = s1.substring(0, s1.length()-1);
			
			
			
			hm.put(num,sub);
			
		}
		
		System.out.println(hm);
		String op ="";
		for(Map.Entry<Integer, String> temp : hm.entrySet())
	{ 
			//System.out.println(temp.getValue());
			op=op+temp.getValue()+" ";
		
	}
	System.out.println(op.trim());
}
}

