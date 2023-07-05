import org.junit.Test;

public class SandGlass {
	
	@Test
	public void example1() {
		int row=5;
		sandGlass(row);
		
	}

	private void sandGlass(int row) {
		for(int i=0;i<=row-1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=row-1;k>=i;k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		//Second
		for(int i=0;i<=row-1;i++) {
			for(int j=row-2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
			
		}
	
		
	}

}
