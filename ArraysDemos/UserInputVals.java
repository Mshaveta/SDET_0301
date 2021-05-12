package ArraysDemos;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputVals {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = scn.nextInt();
		
		//1. Array declare
		int[] arr = new int[size];//[0,0,0,0,0]
		//System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<size;i++) {
			System.out.println("Please enter "+i +"th elmn.");
			arr[i]=scn.nextInt();
		}
		
		 
		//System.out.println(Arrays.toString(arr));
		
//		for(int x:arr){
//			System.out.println(x);
//		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
