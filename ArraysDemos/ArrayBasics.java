package ArraysDemos;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		// Array Declaration
		// <dataType>[] var_name = new DT[size of an array]
		int[] arr = new int[20];// object -- Heap M/m - objects--0-4
		System.out.println(arr);
		// System.out.println(arr);//[I@m/m addr.//[I@1db9742
		// System.out.println(arr[4]);//0
		// System.out.println(arr[1]);//0
		// System.out.println(arr[5]);//index out of bound
		System.out.println(Arrays.toString(arr));
		// count the elmns of an array- length is a prop of array
		System.out.println(arr.length);//
		int size = arr.length;
		System.out.println("Last IndexNUmber - " + (size - 1));
		// 100
		arr[0] = 100;
		arr[1] = 200;
		// arr[2]=300;
		arr[3] = 400;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		// convert the array into string
		System.out.println(Arrays.toString(arr));

		// way2:
		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println(arr2.length);

		// way3:
		int[] arr3 = { 1, 2, 3, 4, 5, 6 };
		System.out.println(arr3.length);

	}

}
