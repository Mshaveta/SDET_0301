package SDET_0301.LoopDemos;

public class CountingDemo {

	public static void main(String[] args) {
		
		 
		
		int n=5;
		int num=1;
		
		for(int i=1;i<=n;i++) {//1<=5
			for(int j=1;j<=n;j++) { //j=1,1<=5
				//j=2,2<=5
				 num++;//2
				System.out.print(num);// 2
				//++num; //2->3
			}
			
			//for next line
			System.out.println();
		}
		
		System.out.println(num);
//		int ttlRows= 5;
//		int num=1;
//		// rows
//		for (int row = 1; row <= ttlRows; row++) {
//			// cols -
//			for (int col = 1; col <= ttlRows; col++) {
//				 System.out.print(num+" ");
//				 num++;
//
//			}
//
//			System.out.println();
//
//		}

	}

}
