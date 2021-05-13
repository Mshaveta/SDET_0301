package ArraysDemos;

import java.util.Arrays;

public class ScndMax {

	public static void main(String[] args) {
		int[] arr = {112,34,56,78,89 ,80,300};
		
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		
		int max=0;//34//89
		int scndMax=0;//78
		int maxIndex=0,scndIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {//80>89--false
				scndMax = max;
				max = arr[i];//max=12,scndMax=0
				scndIndex = maxIndex;
				maxIndex= i;
			}else if(arr[i]>scndMax) {
				scndMax = arr[i];
				scndIndex = i;
			}
		}
		
		System.out.println("max Number - "+ max +" index number " + maxIndex);
		System.out.println("Second max Number - "+ scndMax +" scnd Max index number"+scndIndex );
	}

}
