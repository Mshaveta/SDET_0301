package SDET_0301;

public class FrontSpacePattern1 {

	public static void main(String[] args) {
		int n = 5;
		
		for (int i = 1; i <= n; i++) { //i=1, 1<=5--true, i++--> i=1=->2

			// spaces
//			for (int sp = 1; sp <= n - i; sp++) { //sp=1,sp<=5-1=4- true
//				//sp++ ---1->2, 2<=4-true
//				//sp++-> 2->3, 3<=4-true
//				//sp++--> 3->4, 4<=4- true
//				//5, 5<=4--false
//				System.out.print("-");//space, space,space,space
//			}
			
			for(int j=n-1;j>=i;j--) {//4>=1,3>=1,2>=1,1>=1
				//i=2, j>=2--->4>=2,3>=2,2>=2,
				//1>=2-false
				
				//i=3, j=4,4>=3,3>=3,2>=3--false
				//i=4,j=4,4>=4--1 time
				//i=5
				System.out.print("-");
			}
			
			
			
			// stars

			for (int st = 1; st <= i; st++) {//st=1,1<=1-true, 1<=2,2<=2,3<=2--false
				//st=2,2<=1--false
				System.out.print("*");//star
			}

			System.out.println();//next line

		}

	}

}
