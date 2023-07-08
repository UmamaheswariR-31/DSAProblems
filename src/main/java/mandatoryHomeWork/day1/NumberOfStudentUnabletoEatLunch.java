package week5.day1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class NumberOfStudentUnabletoEatLunch {
	//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/
	/**
	 * The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.

The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack. At each step:

If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.
Otherwise, they will leave it and go to the queue's end.
This continues until none of the queue students want to take the top sandwich and are thus unable to eat.

You are given two integer arrays students and sandwiches where sandwiches[i] is the type of the i​​​​​​th sandwich in the stack (i = 0 is the top of the stack) and students[j] is the preference of the j​​​​​​th student in the initial queue (j = 0 is the front of the queue). Return the number of students that are unable to eat.
	 * 
	 * Input: students = [1,1,0,0], sandwiches = [0,1,0,1]
Output: 0 
	 * 
	 * Input: students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
Output: 3
	 * 
	 */
    @Test
	public void example() {
		int [] students= {1,1,0,0};
		int [] sandwiches= {0,1,0,1};
		System.out.println(countStudents(students, sandwiches));
	}
    
    @Test
	public void example1() {
		int [] students= {1,1,1,0,0,1};
		int [] sandwiches= {1,0,0,0,1,1};
		System.out.println(countStudents(students, sandwiches));
	}

	private int countStudents(int[] students, int[] sandwiches) {
		
		int right=0;
		int count=0;
		
		List<Integer> arr = new ArrayList<>();
		
		for(int student: students) {
			arr.add(student);
		}
		
		while(right<=sandwiches.length-1)
		{
			if(arr.get(0)==sandwiches[right]) {
				arr.remove(0);
				right++;
				count=0;
				
			}else if(arr.get(0)!=sandwiches[right]) {
				arr.add(arr.get(0));
				arr.remove(0);
				count++;
				
			}
			if(right==sandwiches.length || count==arr.size()) {
				return count;
			}
		}
		return 0;
		
	}
	
	
}
