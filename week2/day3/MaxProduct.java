package week2.day3;

import org.junit.Test;

public class MaxProduct {

	/*
	 * Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
	 * 
	 * Input: nums = [3,4,5,2]
       Output: 12 
       
       Input: nums = [1,5,4,5]
       Output: 16
	 * 
	 * Input: nums = [3,7]
       Output: 12
	 * 
	 * Pesudo
	 * 1. Sort the array
	 * 2. Take the lenth,length-1 value and -1
	 * 3. Prod=
	 * 
	 */
	@Test
	public void example() {
		int[] nums= {3,4,5,2};
		maxProduct(nums);
		}
	

	private void maxProduct(int[] nums) {
	int temp;
	for(int i=0;i<=nums.length-1;i++) {
		{
			for(int j=i; j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		for(int a: nums) {
			System.out.println(a);
		}
		
	}
	
}
}
