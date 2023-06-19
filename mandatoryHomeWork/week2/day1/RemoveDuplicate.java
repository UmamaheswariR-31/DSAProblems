package week2.day1;

import org.junit.Test;

public class RemoveDuplicate {
	@Test
	public void example() {
		int[] nums = { 0,0,1,1,1,2,2,3,3,4 };
		removeDuplicates(nums);
	}

	private void removeDuplicates(int[] nums) {
		int ptr1 = 0, ptr2 = 1;
		while (ptr2 < nums.length) {
			
		        if (nums[ptr1] == nums[ptr2]) { 
		        	ptr2++; 
		        } else { 
		        	ptr1++; 
		            nums[ptr1] = nums[ptr2]; 
		            ptr2++; 
		        }
		    }
		    int k = ptr1 + 1;
		    System.out.println(k);
		}
			
	}

