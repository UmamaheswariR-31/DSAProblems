package week3.day4;

import org.junit.Test;

public class KbeautyOfNumber {
	
  /**
   * The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:

It has a length of k.
It is a divisor of num.
Given integers num and k, return the k-beauty of num.
   * Input: num = 240, k = 2
     Output: 2
     
     Input: num = 430043, k = 2
     Output: 2
   * 
   */
	@Test
	public void example() {
		int num= 240;
		int k=2;
		kBeautyOfNumber(num,k);
		
	}

private void kBeautyOfNumber(int num, int k) {
	  String s = String.valueOf(num);
	  //System.out.println(s);
	int i=0, j=k-1, sum=0;
	String n="";
	for(int i=0;i<=s.length();i++)
	
}

}
