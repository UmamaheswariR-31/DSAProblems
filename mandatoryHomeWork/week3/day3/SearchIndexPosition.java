package week3.day3;

import org.junit.Test;

public class SearchIndexPosition {
	/**Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.
Ex1: Input: nums = [1,3,5,6], target = 5
     Output: 2
Ex2: Input: nums = [1,3,5,6], target = 2
     Output: 1   
Ex3: Input: nums = [1,3,5,6], target = 7
     Output: 4  
     Pesudocode
     1. Start=0, end=num.lenth
     2.mid=start+end/2
     3 if num[mid]==target -->print mid
     4.if num[mid]<target-->start=mid+1, end remain same
     5.if num[mid]>target-->end=mid-1, start remai same
     
     
     
     **/
	 @Test
     public void example() {
		 int [] nums= {1,3,5,6};
		 int target=5;
		 searchIndex(nums,target);
		 
			  
     }

	private void searchIndex(int[] nums, int target) {
		int start=0,end=nums.length-1;
		
		while(start<=end)
		{
		int mid = (start+end)/2;
		if(nums[mid]==target)
		{
			System.out.println(mid);
		}
		else if(nums[mid]<target)
		{
			start=mid+1;
			
		}
		else 
		{
			end=mid-1;
		 }
		}
		System.out.println(start);
		
		
		
	}
	//System.out.println(start);

}
