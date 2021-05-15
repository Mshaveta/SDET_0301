package ArraysDemos;

public class TwoDimDemo {

	public static void main(String[] args) {
//		int rSize=3;
//		int cSize=3;
//		int[][] arr = new int[rSize][cSize];
//		//arr -{ arr1-  {1,2,3}, 
//		//       arr2-  {1,2,3} }
//
//		arr[0][0] = 100;
//		arr[0][1] = 90;
//		arr[1][0] = 45;
//		arr[1][1] = 67;
//		
//		for(int i=0;i<rSize;i++) { //i=0,0<3
//			for(int j=0;j<cSize;j++) {//j=0;0<3
//				 
//				System.out.print(arr[i][j]+" ");
//				//arr[0][0]
//				//arr[0][1]
//				//arr[0][2]
//				
//			}
//			
//			System.out.println();
//		}
		
		int[][] arr = new int[][] 
				{ {1,2,3} , 
				  {2,4} , 
				  {4,7} 
				};
		
		int rowSize = arr.length;
		//int colSize = arr[0].length;
		
		//System.out.println(rowSize + "---"+colSize);
		//3 2
		
		for(int i=0;i<rowSize;i++) {
			
			//System.out.println(i+" subArray - "+arr[i]);
			int cSize = arr[i].length;
			
			for(int j=0;j<cSize;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			
			System.out.println();
		}
	}

}
