package week1.day5;

import org.junit.Test;

public class DiamondPattern {
	/**
	 * 
	 * 1. Diamond Pattern in Java
Enter a Character between A to Z : F

     A
    B B
   C   C
  D     D
 E       E
F         F
 E       E
  D     D
   C   C
    B B
     A
	 * 
	 * 
	 * 
	 */

	@Test
	public void example() {
		char chh='F';
		diamondPattern(chh);
	}

	private void diamondPattern(char chh) {
		char ch=65;
		int m=0;
		int n=6;
		//to execute the 1st part from A to F..reverse loop
		 for(int i=n;i>=0;i--) { //O(n)
			// to print the initial empty space Ex: i=5-->empty space=5; i=4-->empty space=4 etc..
			for(int j=1;j<=i;j++) { //O(n-1)==> (k)
				System.out.print(" ");
			}
			//to print the character always after space
			System.out.print(ch);
			//to print the space in between 2 characters. 1st row no need space and second char
			//from 2nd row we need space.Ex: i=4 ==> space=1, i=3 ==> space=3, i=2 ==> space=5, i=1==> space=7, i=0==>space=9
			if(i!=n) {
				for(int k=0;k<=m;k++) { //O(m)
					System.out.print(" ");
				}
				//after space printing the character
				System.out.print(ch);
				//incrementing m to 2 in order to fullfil the in betwee space of characters
				m=m+2;
				
			}
			//next line for next row
			System.out.println();
			//incrementing ch++ to get next character in next line
			ch++;
			//System.out.println("888"+ch);
		}
		 
		m=m-3;//10-3=7
		ch-=2;//G-2=E
		//System.out.println(ch+"***");
		 for(int i=1;i<=n;i++) {
			
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}

				System.out.print(ch);
				
				if(i!=n) {
					for(int k=0;k<m;k++) {
						System.out.print(" ");
					}

					System.out.print(ch);

					m=m-2;
				}

				System.out.println();
				 ch--;
				
			}
	}
		
	}

