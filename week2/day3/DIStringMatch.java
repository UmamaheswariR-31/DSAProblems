package week2.day3;

import java.util.Arrays;

import org.junit.Test;

public class DIStringMatch {
/*
 *A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].

Input: s = "IDID"
Output: [0,4,1,3,2]
 * 
 * 
 * Input: s = "III"
Output: [0,1,2,3]

Input: s = "DDI"
Output: [3,2,0,1]

  Pseudocode
  1. Keep the low range as left=0
  2. Keep the high range as right=s.lenght()
  3. Create new Output Array with lenth as s.lenth+1
  3. Iterate the String
         if(s.charAt(0)='I')===> Keep the Output arrau value to Left and Left++
         else (s.charAt(0)='D')===> Keep the Output arrau value to right and right--
   4. Assign left or right to Output array last value
 */
@Test
public void example() {
	
	String s="IDID";
	DIStringMatch(s);
}

@Test
public void example1() {
	
	String s="III";
	DIStringMatch(s);
}

@Test
public void example2() {
	
	String s="DDI";
	DIStringMatch(s);
}

private void DIStringMatch(String s) {
	// TODO Auto-generated method stub
	int left=0,right=s.length();
	//char[] chArr = s.toCharArray();
	int[] op=new int[s.length()+1];
	for(int i=0;i<=s.length()-1;i++)
	{
		if(s.charAt(i)=='I') {
		op[i]=left++;
		//left++;	
	} else  {            //if(s.charAt(i)=='D')
		op[i]=right--;
		//right--;
	}
	op[s.length()]=right;
	//System.out.println(Arrays.toString(op));
}
	System.out.println(Arrays.toString(op));
}

}
	

