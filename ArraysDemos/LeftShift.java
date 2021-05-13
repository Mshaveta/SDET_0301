package ArraysDemos;

import java.util.Arrays;

public class LeftShift {

	public static void main(String[] args) {
		 int[] arr = {12,34,56,7,8};
		 int firstElm = arr[0];
		 for(int i=0;i<arr.length-1;i++) {//0-4
			 arr[i]=arr[i+1];
			 
			 System.out.println(Arrays.toString(arr));
			 System.out.println("----------------");
		 }
		 
		 arr[arr.length-1] = firstElm;
		 

	}

}
