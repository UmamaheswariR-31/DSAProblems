package day2;

import java.util.Arrays;

import org.junit.Test;

public class RemoveFirLastOccurance {
	/**
	 * Remove the first and last occurrence of a given number in the input array
input = {1,2,3,4,5,1}, number = 1
output = {2,3,4,5}

	 */
	@Test
	public void example() {
		int[] input= {1,3,4,5,1};
		int num=1;
		removeFirLastOccu(input,num);
	}

	private void removeFirLastOccu(int[] input, int num) {
		int firstIndex = 0; int lastIndex = 0;
		//firstIndex
		for(int i=0;i<=input.length;i++)
		{
			if(input[i]==num)
				firstIndex=i;
				break;
			   // System.out.println(firstIndex); //"FirstIndex "+
		}
		System.out.println("firstIndex " + firstIndex);
		//lastIndex
		for(int j=input.length-1;j>=0;j--)
		{
			if(input[j]==num)
				lastIndex=j;
			break;
		}
		System.out.println("lastIndex " + lastIndex);
		
		int[] newArr=new int[input.length-2];
		int k = 0;
		for(int i=0;i<=input.length-1;i++) {
			if(i!=firstIndex && i!=lastIndex)
				newArr[k++]=input[i];
		}
		System.out.println(Arrays.toString(newArr));
			
		
			
	
	}
	
	

}
