package loops;

public class Pattern1 {

	public static void main(String[] args) {

		//Total no of rows	
		int n = 5;
		
		//outer loop - for rows
		for(int row=1;row<=n;row++) {
		//stp1: i=1, 1<=5-true
			//i++   -> i=2,2<=5-true
			
			 //inner loop - for cols to print the data
			for(int col=1;col<=n;col++) {
				//j=1,1<=5-true
				//j=2
				//j=2,2<=5-true
				System.out.print("* ");//*
			}
			
			
			System.out.println();
			
		}

	}

}
