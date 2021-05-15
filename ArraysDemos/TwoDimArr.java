package ArraysDemos;

import java.util.Arrays;

public class TwoDimArr {

	public static void main(String[] args) {
		//Case1:[row-size][col -size]
		//2D array Declare ,init.  size 
		int[][] arr = new int[4][3];//0//1
		//arr =[[
		//value-acc. DT
		//arr[0]== m/m address
		
		
		int[][] arr5 = new int[4][];//0//1
		//arr5 - [[
		//arr[0]=null
		//arr[0][0]==N.P.E
		
		//Row - i - 
		System.out.println(arr.length);//Row Size//4
		
		//Col j- 
		System.out.println(arr[0].length);//elmns count//3
		
		
		//{  0 - {0,0,0},  1 - {0,0,0} }
//		//row-0,1
//		//col-0,1,2
//		//{   0 -{1,2,3} ,1 - {1,2,3}   }
//		System.out.println(arr);//[[I@15db9742
//		
//		System.out.println(arr[0]);//[I@6d06d69c
//		System.out.println(arr[1]);//[I@7852e922
//	 	System.out.println(arr[2]);//out of bound
//		
//		System.out.println(arr[1][2]);//0
//		
//		System.out.println(Arrays.toString(arr[0]));//0
//		System.out.println(Arrays.toString(arr[1]));
//		
//		//Values Assign
		arr[0][1]=100;
		arr[1][0]=98;
//		
//		//values fetch
		System.out.println(arr[0][1]);
//		
//		System.out.println(Arrays.toString(arr[0]));//0
//		System.out.println(Arrays.toString(arr[1]));
		
		
		//Case 2: 
		//int[][] arr1 = new int[][4];// compilation Error
		
		//case 3:
		boolean[][] arr3 = new boolean[2][]; //jagged Array
		
		//{ {},
		//	{}  }
		System.out.println(arr3);//[[I@15db9742
		System.out.println(arr3[0]);//null
		System.out.println(arr3[1]);//null
		
		System.out.println(arr3[1][0]);//N.P.E.

		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
