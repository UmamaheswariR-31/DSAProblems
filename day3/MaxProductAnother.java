package week2.day3;

import org.junit.Test;

public class MaxProductAnother {
	/*
	 * Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
	 * 
	 * Input: nums = [3,4,5,2]
       Output: 12 
       
       I
       nput: nums = [1,5,4,5]
       Output: 16
	 * 
	 * Input: nums = [3,7]
       Output: 12
	 * 
	 * Pesudo:
	 * 1. Initialize the Max=0, nextmax=0
	 * 2. Max Index
	 *       Iterate through each value starting from 1 and compare value of num[1]>num[0]
	 *          if nums[i]>nums[Max)==>max=i
	 * 3. NextMaxIndex
	 *       Iterate through each value starting from 1 and compare value of num[1]>num[0]
	 *           if nums[j]>nums[nextMax)==>nextMax=j and j!=max
	 *             
	 * 
	 * 
	 * 
	 */
	//@Test
	public void example() {
		int[] nums= {3,4,5,2};
		maxProductOtherWay(nums);
		}
	//@Test
	public void example1() {
		int[] nums= {3,7};
		maxProductOtherWay(nums);
		}

	@Test
	public void example2() {
		int[] nums= {1,5,4,5};
		maxProductOtherWay(nums);
		}


	private void maxProductOtherWay(int[] nums) {
		int max=0, nextMax=0;
		
		for(int i=1;i<nums.length;i++) 
		{
			if(nums[i]>nums[max])
			max=i;
			//System.out.println(max);	
		}
		System.out.println("Max Ind " +max +" "+nums[max]);
		
		for(int j=1;j<nums.length;j++) {
			if(j!=max&&( max==0||nums[j]>nums[nextMax]))
				nextMax=j;
		}
		System.out.println("NextMaxt Ind"+nextMax+" "+nums[nextMax]);
	    System.out.println(nums[max-1]*nums[nextMax-1]);
		
	}
	
}
