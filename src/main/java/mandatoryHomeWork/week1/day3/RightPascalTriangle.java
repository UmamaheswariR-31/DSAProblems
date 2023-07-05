import org.junit.Test;

public class RightPascalTriangle {
	
	@Test
	public void example1() {
		int row=5;
		rightPascal(row);
		
	}

	private void rightPascal(int row) {
     for(int i=0;i<=row-1;i++)
     {
    	 for(int j=0; j<=i;j++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     
     for(int i=0;i<=row-1;i++)
     {
    	 for(int j=row-1;j>i;j--)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
		
	}


}
