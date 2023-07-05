package week1.day5;

import org.junit.Test;

public class Maximum69 {
	/**
	 * //https://leetcode.com/problems/maximum-69-number/
	 * You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
	 * 
	 * Input: num = 9669
Output: 9969
	 * 
	 * Input: num = 9996
Output: 9999
	 * 
	 * Input: num = 9999
Output: 9999
	 */
	
	@Test
	public void positive() {
		int num = 9669;
		maximum69(num);
	}

	@Test
	public void negative() {
		int num = 9996;
		maximum69(num);
	}

	@Test
	public void edge() {
		int num = 66666;
		maximum69(num);

	}

	/* Converting to String
	 * Convert the integer into String Loop through the length of the string Check
	 * the each and every character in string and change the value of 1st 6 to 9
	 * 
	 */
	//Time complexity ---> O(n)
	
	private void maximum69(int num) {
		String val = String.valueOf(num);
		String str = "";
		char tar = '\u0000';
		int count = 0;
		for (int i = 0; i < val.length(); i++) {
			//9669
			tar = val.charAt(i);
			if (val.charAt(i) == '6' && count < 1) {
				tar = '9';
				count++;

			}
			str = str + tar;
		}
		System.out.println(Integer.parseInt(str));

	}
}


