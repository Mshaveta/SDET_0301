package ArraysDemos;

import java.util.Arrays;

public class RemoveArrElmn {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };// 5

		int rmv_elm = 3;
		int[] arr2 = new int[arr1.length - 1];// 4[1,2,0,0]
		
		System.out.println(Arrays.toString(arr2));
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
//			if(arr1[i] != rmv_elm) {
//				arr2[j]=arr1[i];
//				j++;
//				System.out.println(Arrays.toString(arr2));
//				 
//			} 

			if (arr1[i] == rmv_elm) {//2=3
				continue;

			}
			
			arr2[j] = arr1[i];
			j++;//1

		}

		System.out.println(Arrays.toString(arr2));

	}

}
