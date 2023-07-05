import org.junit.Test;

public class DiamondPattern {
	
	@Test
	public void example1() {
		int row=5;
		diamondPattern(row);
		
	}

	private void diamondPattern(int row) {
		for(int i=0;i<=row-1;i++)
		{
			for(int j=row-2;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		//reverse
		for(int i=0;i<=row-1;i++) {
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=row-1;k>i;k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

}
