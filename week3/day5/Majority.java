package week3.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class Majority {
	
	/**
	 * Given an array nums of size n, return the majority element.

       The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 
	 * Ex1: Input: nums = [3,2,3]
            Output: 3
	 * 
	 * Ex2: Input: nums = [2,2,1,1,1,2,2]
            Output: 2
	 * 
	 * 
	 */
	@Test
	public void example() {
		int[] nums= {3,2,3};
		majority(nums);
	}
	
	@Test
	public void example1() {
		int[] nums= {2,2,1,1,1,2,2};
		majority(nums);
	}
	
	

	private void majority(int[] nums) 
	{
		int n=nums.length;
		HashMap<Integer,Integer> hm= new HashMap<Integer, Integer>();
		for(int i=0;i<=nums.length-1;i++)
		{
			hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
			
		}
		
		for(Map.Entry<Integer, Integer> temp: hm.entrySet()) 
		{
			int maj=n/2;
			int k=temp.getValue();
			if(k>maj) System.out.println(temp.getKey());
			
		}
		
	}

}
