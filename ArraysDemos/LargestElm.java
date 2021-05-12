package ArraysDemos;

public class LargestElm {

	public static void main(String[] args) {
//		 int[] arr = {12,100,200,30,5};
//		 int max=0;//12-->100
//		 for(int i=0;i<arr.length;i++) {//0-4
//			 	if(arr[i]>max) {//arr[0]>max==>12>12--true
//			 		max = arr[i];//max=12
//			 	}			 	 
//		 }
//		 
//		 System.out.println("Max number is - "+ max);
		
		 int[] arr = {12,100,200,30,5};
		 int min=arr[0];//12---5
		 for(int i=0;i<arr.length;i++) {//
			 	if(arr[i]<min) {
			 		//arr[0]< 12--12<12-false
			 		//arr[1]<12---100<12--false
			 		//5<12-true
			 		
			 		min = arr[i];//arr[4]=5
			 	}			 	 
		 }
		 
		 System.out.println("Max number is - "+ min);//0

	}

}
