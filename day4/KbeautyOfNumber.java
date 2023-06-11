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
   * 
   * PseudoCOde:
   *  Initialise count=0
   *  Convert int to String by String s = String.valueOf(num);
   *  iterate and Get the substring from(0,k)
   *  Again convert Substring to Int 
   *  num%IntegerSubstring ==0, count++
   *  Return Count
   */
	@Test
	public void example() {
		int num= 240;
		int k=2;
		System.out.println(kBeautyOfNumber(num,k));
		
	}
	
	@Test
	public void example3() {
		int num= 430043;
		int k=2;
		System.out.println(kBeautyOfNumber(num,k));
		
	}
	
	//
	//@Test
	public void example4() {
		int num= 30003;
		int k=3;
		System.out.println(kBeautyOfNumber(num,k));
		
	}

private int kBeautyOfNumber(int num, int k) {
	
	  int count =0;
	 //Convert int to String
	  String s = String.valueOf(num);
	//  System.out.println(s);
	//int i=0, j=k-1, sum=0;
	  
	String n="";
       for(int i=0;i<s.length()-1;i++) {
		String s1 = s.substring(i, i+k);
		//System.out.println(s1);
		
		//Convert substring to Int
		int div = Integer.parseInt(s1);
		
	 //  System.out.println(num%div);
		
		if(div!=0 && num % div==0 ) {
			count++;
		}
		
	}
	return count;
	
}

}
