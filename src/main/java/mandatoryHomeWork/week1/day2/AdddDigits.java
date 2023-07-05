package day2;

import org.junit.Test;

public class AdddDigits {
	@Test
	public void example() {
		int num=11131;
		System.out.println(addDigitss(num));
	}

	private int addDigitss(int num) {
		int sum=0;
	//	int n;
		while(num>9) {
			//int sum=0;
			while(num>0) {
			int n;
			n=num%10;
			sum =sum+n;
			num=num/10;
		}
		num=sum;
			
	}
		return num;
}

}
