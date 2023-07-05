package SDET;

import java.util.Scanner;

import org.junit.Test;

public class Pattern {
  @Test
	public  void example() {
		/*Input:
		 *     *
		 *    * *
		 *   * * *
		 *  * * * *
		 * * * * * *
		 * PseudoCode:
		 * 1. Get the Rowcount
		 * 
		 */
		 
		//Scanner scan =new Scanner(System.in);
		//int rowCount = scan.nextInt();
	  int rowCount=5;
		printPatter(rowCount);
		

	}

	private void printPatter(int rowCount) {
		for (int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<=rowCount-1;j++)
			{
				System.out.println(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
