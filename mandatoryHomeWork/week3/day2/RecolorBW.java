package week3.day2;

import org.junit.Test;

public class RecolorBW {
	/**
	 * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.

You are also given an integer k, which is the desired number of consecutive black blocks.

In one operation, you can recolor a white block such that it becomes a black block.

Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
	 * 
	 * Input: blocks = "WBBWWBBWBW", k = 7
       Output: 3
	 * 
	 */
	
	@Test
	public void exampl() {
		String input ="WBBWWBBWBW";
		int k=7;
		reColorBW(input,k);
		
	}

	private int reColorBW(String input, int k) {
		int index=0, whiteMin=0;
		
		while(index < k)
		{
			if(input.charAt(index++)=='W')
				whiteMin++;
		}
		
		int tempWhiteMin =whiteMin;
		
		//second Wing
		
		while(index<input.length()) {
			if(input.charAt(index-k)=='W')
				tempWhiteMin--;
			
			
			if(input.charAt(index)=='W')
				tempWhiteMin++;
				
				whiteMin = Math.min(whiteMin, tempWhiteMin);
			
		}
		
		return whiteMin;
	}
	
}
