package week2.day1;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {

	@Test
	public void example() {
		int[] nums = { 1, 0, 1, 1, 0, 5, };
		moveZerosRight(nums);
	}

	@Test
	public void example1() {
		int[] nums = { 11, 20, 11, 1, 5, };
		moveZerosRight(nums);
	}

	@Test
	public void example2() {
		int[] nums = { 0, 0, 0, 1 };
		moveZerosRight(nums);
	}

	private void moveZerosRight(int[] nums) {
		int left = 0, right = 0;
		while (right < nums.length) {
			if (nums[right] != 0) {
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left++] = temp;

			}
			right++;
		}
		System.out.println(Arrays.toString(nums));

	}

}
