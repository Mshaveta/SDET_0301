package SDET_0301.LoopDemos;

public class Pattern_advnc {

	public static void main(String[] args) {
//		int n = 5;
//		int h = (n+1)/2;
//		int count =0;
//		int num=2;
//		for (int i = 1; i <= n; i++) {
//			
//			if(i<=h) {//1<=3, 2<=3,3<=3
//				//4<=3-false
//				//5<=3
//				count=i;//count=1,2
//			}else {
//				count--;
//			}
//			 
//			
//			for (int j = 1; j <= count; j++) {
//				System.out.print(num+" ");
//				num = num+2;
//			}
//			
//			
//			 
//			
//			System.out.println();
//		}

//		int n = 5;
//		int h = (n + 1) / 2;
//		int count = 0;
//		
//		for (int i = 1; i <= n; i++) {
//
//			int num=i;
//			if (i <= h) {// 1<=3, 2<=3,3<=3
//				// 4<=3-false
//				// 5<=3
//				count = i;// count=1,2
//			} else {
//				count--;
//			}
//
//			for (int j = 1; j <= count; j++) {
//				System.out.print(num );
//				num++;
//			}
//
//			System.out.println();
//		}

//		int n = 3;
//		 
//		
//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= n-i; j++) {
//				System.out.print("-" ); 
//			}
//			 
//
//			for (int k = 1; k <= 2*i-1; k++) {
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}

		int n = 3;
		int num=0;
		for (int i = 1; i <= n; i++) {
			
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print("-");
			}

			for (int k = 1; k <= num+i; k++) {
				System.out.print("*");
			}
			num++;//1
			
		

			System.out.println();
		}
	}

}
