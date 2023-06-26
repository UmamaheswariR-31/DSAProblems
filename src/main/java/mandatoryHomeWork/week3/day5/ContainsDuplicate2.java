package week3.day5;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ContainsDuplicate2 {
	
	/**
	 * 
	 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 
	 * Input: nums = [1,2,3,1], k = 3
       Output: true
	 * 
	 * Input: nums = [1,0,1,1], k = 1
       Output: true
	 * 
	 * Input: nums = [1,2,3,1,2,3], k = 2
       Output: false
	 * 
	 */
	@Test
	public void example() {
		int[] nums = {1,0,1,1};
		int k=1;
		System.out.println(containsDuplicate2(nums,k));
	}

	@Test
	public void example1() {
		int[] nums = {1,2,3,1,2,3};
		int k=2;
		System.out.println(containsDuplicate2(nums,k));
	}
	
	@Test
	public void example2() {
		int[] nums = {1,2,3,1};
		int k=3;
		System.out.println(containsDuplicate2(nums,k));
	}
	private boolean containsDuplicate2(int[] nums, int k) {
		//boolean res =false;
		Map<Integer,Integer> hm =new HashMap<Integer,Integer> ();
		for(int i=0;i<nums.length;i++)
		{
			//if(hm.containsKey(nums[i])) 
			if(hm.containsKey(nums[i]) && i-hm.get(nums[i])<=k) //doubt
			{
				return true;}
			
			hm.put(nums[i], i);
	/**	{
			int value=hm.get(nums[i]);//1
			
			int abs = Math.abs(i-value);
			if(abs==k) return true;
		} else {
			hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
			
		}**/
		//return false;
		
	}
		return false;
		//return res;

}
}
