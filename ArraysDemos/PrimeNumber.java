package ArraysDemos;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 13; // 1,13--26
		boolean flag = false;
		int count=0;
		// 2...52--51 
		// if num is divible with number then it should stop the exec.break;
		//for (int i = 2; i<n; i++) {
		for (int i = 2; i<=n/2; i++) {
			if (n % i == 0) {//13%
				//flag =true;
				count=1;
				break;
			}
		}
		
		if(count==1) {//true
			System.out.println("Num is not  prime ");
		}else {
			System.out.println("Num is  prime ");
		}
	}
}
