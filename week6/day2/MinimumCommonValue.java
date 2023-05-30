package week6.day2;

import org.junit.Test;

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
	
	@Test
	public void example() {
	
		int[] nums1= {1,2,3};
		int[] nums2 = {2,4};
		minimumCommonValue(nums1,nums2);
		
	}
	
	@Test
	public void example1() {
	
		int[] nums1= {1,2,3,6};
		int[] nums2 = {2,3,4,5};
		minimumCommonValue(nums1,nums2);
		
	}

	private void minimumCommonValue(int[] nums1, int[] nums2) {
		for(int i=0;i<nums1.length-1;i++)
		{
			for(int j=0;j<nums2.length;j++) {
			   if(nums1[i]==nums2[j])
				System.out.println(nums1[i]);
			}
		}
		
	}

}
