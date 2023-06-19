package week3.day1;

import org.junit.Test;

public class MaxAverageSubArray {
	/**
	 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
	 *  Any answer with a calculation error less than 10-5 will be accept
	 */
	@Test
	public void example() {
		int[] arr= {1,12,-5,-6,50,3};
		int k=4;
		maxAverageSubarraySW(arr,k);
		
	}

	private void maxAverageSubarraySW(int[] arr, int k) {
		double maxSum=Integer.MIN_VALUE, windowSum=0;
		double average;
		for(int i=0; i<k;i++) {
			windowSum=windowSum+arr[i];
		}
		System.out.println(windowSum);
		maxSum=windowSum;
		
		for(int i=k;i<arr.length;i++) {
			windowSum=windowSum-arr[i-k]+arr[i];
			maxSum=Math.max(maxSum,windowSum);
		}
		average=maxSum/4;
		System.out.println(average);
		
		
	}

}
