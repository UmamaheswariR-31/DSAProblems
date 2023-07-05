package day2;

import java.util.Arrays;

import org.junit.Test;

public class removeFirstLastOccurance {
	/**Remove the first and last occurrence of a given number in the input array
       input = {1,2,3,4,5,1}, number = 1
       output = {2,3,5}
    **/
	@Test
	public void example() {
		int[] input= {1,2,3,4,5,1};
		int num=1;
		System.out.println(Arrays.toString(removeFirstLastOccu(input,num)));
	}

	private int[] removeFirstLastOccu(int[] input, int num) {
		int[] newArr=new int[input.length-2];
		if(input[0]==num && input[input.length-1]==num) {
			
			for(int i=1,j=0;i<input.length-1;i++) {
				newArr[j++]=input[i];
						System.out.println(input[i]);
			}
			return newArr;
				
			
		}
		return input;
		
	}

}
