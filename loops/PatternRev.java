package SDET_0301;

public class PatternRev {

	public static void main(String[] args) {
		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=i;j<=n ; j++) {//5
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//way2:
//	for(int i=1;i<=n;i++) {
//		
//			for(int j=1;j<=(n+1)-i ; j++) {
//				System.out.print((n+1)-i);
//			}
//			System.out.println();
//		}
		
		//way3:
		for(int i=5;i>=1;i--) {//i=5,5>=1
			//i=4,4>=1
			for(int j=1;j<=i;j++) { //j=1,j<=5
				//j=1,j<=4
				//System.out.print("*");//i
				System.out.print(i);
			}
			System.out.println();
		}
		
		//Way4:
		//way3:
//				for(int i=1;i<=n;i++) {//i=5,5>=1
//					//i=4,4>=1
//					for(int j=5;j>=i;j--) { //j=1,j<=5
//						//j=1,j<=4
//						System.out.print("*");
//					}
//					System.out.println();
//				}


	}

}
