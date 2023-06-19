package week3.day5;

import org.junit.Test;

public class SmallestLetterGreaterThanTarget {
	/**
	 * You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

 
	 * Input: letters = ["c","f","j"], target = "a"
       Output: "c"
	 * 
	 * Input: letters = ["c","f","j"], target = "c"
Output: "f"
	 * 
	 * Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
	 * 
	 */
	@Test
	public void example() {
		char[] letters = {'c','f','j'};
		char target ='a';
		smallestLetterGreaterthanTarget(letters,target);
	}
	
	@Test
	public void example1() {
		char[] letters = {'c','f','j'};
		char target ='c';
		smallestLetterGreaterthanTarget(letters,target);
	}
	
	@Test
	public void example2() {
		char[] letters = {'x','x','y','y'};
		char target ='z';
		smallestLetterGreaterthanTarget(letters,target);
	}

	private void smallestLetterGreaterthanTarget(char[] letters, char target) {
		
		for(int i=0;i<=letters.length;i++) {
			if(letters[i]>target)
			{
				System.out.println(letters[i]);
				break;
			}else
			{
				System.out.println(letters[0]);
				break;
			}
		}
		
		
	}

	
}
