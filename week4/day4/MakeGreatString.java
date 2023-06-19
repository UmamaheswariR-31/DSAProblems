package week4.day4;

import java.util.Stack;

import org.junit.Test;

public class MakeGreatString {
	//https://leetcode.com/problems/make-the-string-great/
	/**
	 * Given a string s of lower and upper case English letters.

A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

0 <= i <= s.length - 2
s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.

Return the string after making it good. The answer is guaranteed to be unique under the given constraints.

Notice that an empty string is also good.
	 * 
	 * Input: s = "leEeetcode"
Output: "leetcode"
	 * 
	 * Input: s = "abBAcC"
Output: ""
	 * 
	 * 
	 * Input: s = "s"
Output: "s"
	 */
	@Test
		public void example() {
			String s="leEeetcode";
			greatString(s); //leetocde
		}
		
		

		// @Test
		public void example1() {
			String s="abBAcC";
			greatString(s); //
		}
		
		// @Test
		public void example2() {
			String s="s";
			greatString(s); //s
		}
		       //@Test
				public void example3() {
					String s="aaaa";
					greatString(s); 
				}
				
				private void greatString(String s) {
				
					Stack<Character> stack =new Stack<>();
					//char[] ch = s.toCharArray();
					//for(int i=0;i<ch.length;i++) 
					for(char ch: s.toCharArray())
					{
						if(!stack.isEmpty() && Math.abs(stack.peek()-ch)==32){
							stack.pop();
						}else {
							stack.push(ch);
						}
				      StringBuilder op = new StringBuilder();
					  while (!stack.isEmpty()) {
					  op.append(stack.pop());
					        }

					         String ops = op.reverse().toString();
					         System.out.println(ops);
					}
					
					//for(int i=0; i<s.length();i++) {
						//stack.push(s.charAt(i))
					//}
					//else if((Character.isUpperCase(s.charAt(i)) && Character.isLowerCase((char) stack.peek())) || (Character.isLowerCase(s.charAt(i)) && Character.isUpperCase((char) stack.peek()))
					
				}


}
