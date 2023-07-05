package day3;

import java.util.Arrays;

import org.junit.Test;

public class RemoveAllOccurance {
	/**
	 *  Remove all occurrence of a number which is present in the given index number
        input = {1,2,3,4,5,1}, indexToRemove = 5
        output = {2,3,4,5}
	 *  
	 * 
	 */

	@Test
	public void example() {
		int[] input= {1,2,3,4,5,1};
		int indextoRemove=5;
		removeAllOccurance(input,indextoRemove);
	}

	private void removeAllOccurance(int[] input, int indextoRemove) {
		int totNum=0;
		for(int i=0;i<=input.length-1;i++) {
			if(input[i]==input[indextoRemove])
				totNum=totNum+1;
			
		}
		System.out.println(totNum);
		int[] outArr = new int[input.length-totNum];
		
		int indexToInsert=0;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]!=input[indextoRemove])
			{
				outArr[indexToInsert++]=input[i];
				//ystem.out.println(outArr[j]);
			}
		}
		System.out.println(Arrays.toString(outArr));
	}

}
