package ArraysDemos;

import java.util.Arrays;

public class SortingElmns {

	public static void main(String[] args) {

		int[] arr = { 52, 23, 45, 6, 78, 1, 3 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			System.out.println("=====================start of ==============" + i + "th iteration==============");
			for (int j = i + 1; j < arr.length; j++) {
				System.out.println("------------");
				System.out.println(arr[i] + " > " + arr[j]);
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					System.out.println(
							"element at " + i + "position is - " + arr[i] + " and  at " + j + " post. is " + arr[j]);

				} else {
					System.out.println("no change");
				}
				System.out.println(Arrays.toString(arr));
			}

			System.out.println(Arrays.toString(arr));

		}

		// System.out.println(Arrays.toString(arr));
	}

}
