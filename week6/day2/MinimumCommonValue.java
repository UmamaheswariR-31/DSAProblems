package week6.day2;

import org.junit.Test;

import junit.framework.Assert;

public class MinimumCommonValue {
	/**
	 * Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

 Input: nums1 = [1,2,3], nums2 = [2,4]
  Output: 2
  Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2

	 * 
	 */
	
	@SuppressWarnings("deprecation")
	@Test
	public void example() {
	
		int[] nums1= {1,2,3};
		int[] nums2 = {2,4};
		Assert.assertEquals(2, minimumCommonValue(nums1,nums2));
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void example1() {
	
		int[] nums1= {1,3,6};
		int[] nums2 = {2,3,4,5};
		Assert.assertEquals(3, minimumCommonValue(nums1,nums2));
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void example2() {
	
		int[] nums1= {1,3,6};
		int[] nums2 = {2,4,5};
		Assert.assertEquals(-1, minimumCommonValue(nums1,nums2));
		
	}
	
	private int minimumCommonValue(int[] nums1, int[] nums2) {
		
		int ptr1 =0, ptr2=0;
		while(ptr1<nums1.length && ptr2< nums2.length)
		{
			if(nums1[ptr1]==nums2[ptr2]) {
				return nums1[ptr1];
			
			}
			if(nums1[ptr1]<nums2[ptr2])
			{
				ptr1++;
			} else { 
				ptr2++;
			}
		}
		return -1;
		
		
		
	}

}
