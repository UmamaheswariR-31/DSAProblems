package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MinAbsDiff {
	/**
	 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr
	 * 
	 * Input: arr = [4,2,1,3]
       Output: [[1,2],[2,3],[3,4]]
	 * 
	 * Input: arr = [1,3,6,10,15]
       Output: [[1,3]]
	 * 
	 * Input: arr = [3,8,-10,23,19,-4,-14,27]
       Output: [[-14,-10],[19,23],[23,27]]
	 * 
	 */
    @Test
	public void example() {
		int[] arr= {4,2,1,3};
		minAbsDifference(arr);
		
	}

	private void minAbsDifference(int[] arr) {
		
		List<List<Integer>> ls =new ArrayList<>();
		int min=Integer.MAX_VALUE;
		Arrays.sort(arr);
		
		for(int i=0;i<=arr.length-2;i++)
		{
			int diff=arr[i+1]-arr[i];
			//System.out.println(diff);
			if(diff<min) min =diff;
		}
		System.out.println(min);
		//int left=0;
		//while(left<arr.length-2)
		for(int left=0;left<arr.length-1;left++)
		{
			int diff=arr[left+1]-arr[left];
			//int diff=Math.abs(a)
			if(diff==min)
			{ 
			List<Integer> pair =new ArrayList<>(); //doubt?
			pair.add(arr[left]);
			pair.add(arr[left+1]);
				System.out.println(pair);
				
				//left++;
				ls.add(pair);
				//System.out.println(ls);
			}
			//left++;
		}
		System.out.println(ls);
	}
	
}
