package OOPs.Methods.Paramertic;

import java.util.Arrays;

public class ArrayAsParam {

	public void arrAsparamMethod(int[] arrNum, int x) {

		System.out.println("Method Start");
		int sum = 0;
		for (int val : arrNum) {
			sum += val;

		}
		System.out.println("Sum of arr elmns is - " + sum);
		System.out.println("Method ends");

	}

	
	public static void main(String[] args) {
		System.out.println("Main exe starts");
		ArrayAsParam aobj = new ArrayAsParam();
		int[] arr = { 1, 2, 3, 4, 5 };

		aobj.arrAsparamMethod(arr, 600);//
		System.out.println("back to main method");

		int[] arr1 = { 3, 4, 5, 6 };
		aobj.arrAsparamMethod(arr1, 100);//

		System.out.println("Main exe ends");

	}

}
