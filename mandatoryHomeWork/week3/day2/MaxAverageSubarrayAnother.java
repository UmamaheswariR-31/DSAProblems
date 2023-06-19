50package week3.day2;

import org.junit.Test;

public class MaxAverageSubarrayAnother {
	
	/**
	 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
	 *  Any answer with a calculation error less than 10-5 will be accept
	 */
	@Test
	public void example() {
		int[] nums= {1,12,-5,-6,50,3};
		int k=4;
		maxAverageSubarraySW(nums,k);
		
	}

	private void maxAverageSubarraySW(int[] nums, int k) {
		
		double max;
		double avg;
		
		double sum=0;
		//First Window
		for(int i=0;i<k;i++) {
			sum=sum+nums[i];
		}
		//System.out.println(sum);
		avg=sum/k;
		max=avg;
		
	//SW
	for(int j=1;j<nums.length-k;j++) {
		sum=sum-nums[j-1]+nums[k+j+1];
	    avg=sum/k;
	    		
	    if(avg>max) max=avg;
	}
	System.out.println(max); 

}
}
