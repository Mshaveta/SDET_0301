package ArraysDemos;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 12, 20, 36, 44, 15 }; // 12
//itr1 - 15,20,36,44,15
//		System.out.println(Arrays.toString(arr));
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.print(arr[i]+" ");
//		}
		
		
		int temp = 0;
		for (int i = 0; i <=arr.length/2; i++) {
			int lastIndex = arr.length-1-i;
			 temp = arr[i];
			 arr[i] =  arr[lastIndex];
			 arr[lastIndex]=temp;
			 
		}
//		
		System.out.println(Arrays.toString(arr));

	}

}
