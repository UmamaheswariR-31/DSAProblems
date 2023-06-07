package week3.day3;

import java.util.Arrays;

import org.junit.Test;

public class LowestHighestScore {
	/**
	 * You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.
	 * 
	 * Input: nums = [90], k = 1
       Output: 0
	 * 
	 * Input: nums = [9,4,1,7], k = 2
       Output: 2
	 * 
	 */
	@Test
	public void example() {
		int[] arr= {7,10,30,40,70,80};
		int k=3;
		lowestHighest(arr,k);
	}
		
		@Test
		public void example1() {
			int[] arr= {9,4,1,7};
			int k=2;
			lowestHighest(arr,k);
		

}

	private int lowestHighest(int[] arr,int k) {
		Arrays.sort(arr);
		int minDiffer=Integer.MAX_VALUE;
		int left=0, right=arr.length-k-1;
		//for(int i=0;i<=arr.length-k+1;i++)
		    while(left<arr.length-k+1)
		    {
			int winDiff=arr[right]-arr[left];
			if(winDiff<minDiffer) minDiffer=winDiff;
			left++;
			right++;	
			
		}
		//System.out.println(minDiffer);
		    return minDiffer;
	}
	}


