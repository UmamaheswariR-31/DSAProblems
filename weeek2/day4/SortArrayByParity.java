package weeek2.day4;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParity {
	/*
	 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

       Return any array that satisfies this condition.
	 * Ex
	 * Input: nums = [3,1,2,4]
       Output: [2,4,3,1]
       Input: nums = [0]
       Output: [0]
	 * 
	 * PseudoCode
	 * 1. Initialize Left =0, right=0
	 * 2. Iterate till left <right
	 * 3. Compare num[left] and num[right]
	 *      if(nums[left]%2!=0&& nums[right]%2==0)
	 *      Swap nums[left] and nums[right)
	 *      left++ and right--
	 *      
	 *      if(nums[left]%2==0 ==>left++
	 *      if(nums[right)%2!0==>right++
	 * 
	 * 
	 */
	@Test
	public void example1() {
		int[] nums= {3,1,2,4};
		evenOddArray(nums);
	}

	private void evenOddArray(int[] nums) {
		int left=0, right=nums.length-1;
		while(left<right)
		{
			if(nums[left]%2!=0&& nums[right]%2==0) {
				int temp=nums[left];
				nums[left++]=nums[right];
				nums[right--]=temp;
				
			}
		}
		System.out.println(Arrays.toString(nums));
		
	}
	
	
	
	
	
	
	
	
	

}
