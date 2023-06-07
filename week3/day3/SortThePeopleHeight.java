package week3.day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class SortThePeopleHeight {
	/**
	 * 
	 * You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.
	 * Input: names = ["Mary","John","Emma"], heights = [180,165,170]
       Output: ["Mary","Emma","John"]
	 * 
	 * 
	 * Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
       Output: ["Bob","Alice","Bob"]
	 * 
	 */
	@Test
	public void example() {
		String[] names= {"Mary","John","Emma"};
		int[] heights = {180,165,170};
		sortThePeopleHeight(names,heights);
	}

	private void sortThePeopleHeight(String[] names, int[] heights) {
		int nptr1=0,hptr2=0;
		Map<Integer,String> hm=new TreeMap<>(); //TreeMap-->Doubt
		
		while(nptr1<names.length)
		{
			hm.put(heights[hptr2], names[nptr1]);
			hptr2++;
			nptr1++;
			//System.out.println(hm);
		}
		
		for(int i=0;i<=hm.size();i++) {
			//System.out.println(hm.entrySet());
			System.out.println(hm.get(heights[i]));
		}
	 //for(int i=0;i<names.length;i++) {
		//	hm.put(heights[i], names[i]);
	//	}
		
		System.out.println(hm.size());
		//heights;
		//Arrays.sort(heights);
		
	}

}
