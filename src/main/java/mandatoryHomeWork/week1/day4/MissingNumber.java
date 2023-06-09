package week1.day4;

import java.util.Arrays;

import org.junit.Test;

public class MissingNumber {
	/**
	 * //https://leetcode.com/problems/missing-number/

	 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
	 * 
	 * Input: nums = [3,0,1]
Output: 2
	 * 
	 * Input: nums = [0,1]
Output: 2

	 *
	 * Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
	 */
	@Test
	public void positive() {
		int[] num = { 3, 0, 1 };
		missingNo1(num);
	}

	@Test
	public void negative() {
		int[] num = { 0, 2, 1, 3 };
		missingNo1(num);
	}

	@Test
	public void edge() {
		int[] num = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		missingNo1(num);

	}

	private void missingNo(int[] num) {

		Arrays.sort(num);
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] != i) {
				System.out.println(i);
				count++;
			}

		}
		if (count != 1) {
			System.out.println(num[num.length - 1] + 1);
		}

	}

	private void missingNo1(int[] num) {

		sortArray(num);
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] != i) {
				System.out.println(i);
				count++;
			}

		}
		if (count != 1) {
			System.out.println(num[num.length - 1] + 1);
		}

	}

	/*
	 * Loop through each and every value in array and compare with the next value
	 */
	private void sortArray(int[] num) {

		int temp=0;
		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));

	}
}


