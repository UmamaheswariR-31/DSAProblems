package week3.day2;

import org.junit.Test;

public class BlackWhite {
	/**
	 * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.

You are also given an integer k, which is the desired number of consecutive black blocks.

In one operation, you can recolor a white block such that it becomes a black block.

Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
	 * 
	 * 
	 * Example: Input: blocks = "WBBWWBBWBW", k = 7
               Output: 3
               
               Input: blocks = "WBWBBBW", k = 2
               Output: 0
	 * 
	 */

	@Test
	public void example()
	{
		String s ="WBBWWBBWBW";
		int k=7;
		System.out.println(backWhite(s,k));
	}

	private int backWhite(String s, int k) {
		int count =0;
		int min =Integer.MAX_VALUE;
		
		//first Window
		for(int i=0;i<k;i++)
		{
			if(s.charAt(i)=='W')
				count++;
		}
		//System.out.println(count);
		min =count;//3 
		//count=0;
		//System.out.println(min);
		
		//second window left
		
		
		for(int j=1;j<s.length()-k;j++)
		{
			if(s.charAt(j-1)=='W') //0
			{
				count--;//2
			}
				if(s.charAt(j+k-1)=='W') //7
               {
					count++;//3
				}			
		      if(count<min) min=count;
		      //System.out.println(min);
		}
		//System.out.println(min);
		return min;
}
	
}