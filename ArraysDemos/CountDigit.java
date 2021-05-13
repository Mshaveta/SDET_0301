package ArraysDemos;

public class CountDigit {

	public static void main(String[] args) {
		int[] arr =  {1,2,2,3,4,5,5,5,6,7};
		int count=0;
		int srchVal  = 5;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==srchVal) {//arr[0]=5 == 5
				count++;//3
			}
		}
		
		System.out.println(srchVal +" occurs "+ count +" times ");

	}

}
