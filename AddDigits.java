package SDET;

import org.junit.Test;

public class AddDigits {
	/*Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
	 * Input: num = 38
     * Output: 2
     * Explanation: The process is
     * 38 --> 3 + 8 --> 11
     * 11 --> 1 + 1 --> 2 
     * Since 2 has only one digit, return it.
     * 
     * if(num=0)
     * sum=0
     * 
     * if(num%9==0)
     * sum=9
     * 
     * num%9-->remainder
	 */
	@Test
	public void example() {
	int num=328;
	System.out.println(addDigits(num));
}
private int addDigits(int num) {
	if(num==0) {
		return 0;
	}
	return (num%9==0)?9:num%9;
			
			
}			
}
