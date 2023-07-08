package week5.day1;

import org.junit.Test;

public class LongPressed {
	
	//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
	/**
	 * Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 
	 * Input: name = "alex", typed = "aaleex"
Output: true
	 * 
	 * Input: name = "saeed", typed = "ssaaedd"
Output: false
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void example() {
		String name="alex";
		String typed="aaleex";
		System.out.println(isLongPressed(name,typed));
	}

	@Test
	public void example1() {
		String name="saeed";
		String typed="ssaaedd";
		System.out.println(isLongPressed(name,typed));
	}

	
	private boolean isLongPressed(String name, String typed) {
		int left=0, right=0;
		
		if(name.length()> typed.length()){
			return false;
		}

		
		while(right<typed.length()) {
			if(left<name.length() && name.charAt(left)==typed.charAt(right)) {
				left++;
				right++;
			} else if(right!=0 && typed.charAt(right)==name.charAt(left-1)) {
				right++;
				
			}else {
				return false;
			}
		}
		//return right==typed.length();
		return left==name.length();
	}

}
