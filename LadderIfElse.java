import java.util.Scanner;

/*
 * 	//Ladder else if largest number out of 3 numbers
		//Logical oprs:  && - AND, || - OR, ! - NOT
		/// 1 1 = 1
		//  0 1 = 0
		//1 0 = 0
		//00=0
		
		//AND
				/*true true =  true
				 * true false =  false
				 * false false =  false
				 * false true =  false
				 * 
	code Formatting -  ctrl+shift+F
*/
//123-321
//456-654
//loop-10 rows
public class LadderIfElse {
	//100 line code

	public static void main(String[] args) {//

		Scanner scn = new Scanner(System.in);
//		
//		System.out.println("Please enter double type value:");
//		double a = scn.nextDouble();//user inputs
//		System.out.println("Value of d is-"+d);
//		
//		System.out.println("Please enter int type value:");
//		int  i = scn.nextInt();
//		System.out.println("Value of i is-"+i);
		 
		 
		
		System.out.println("Please enter a value:");
		int  a = scn.nextInt();
		
		System.out.println("Please enter b value:");
		int  b = scn.nextInt();
		
		System.out.println("Please enter c value:");
		int  c = scn.nextInt();
	 

		if (a > b && a > c) { // 1000>1200 - false && 1000>20- true
			System.out.println("a is largest");// S1
		} else if (b > a && b > c) { // 1200>1000- true && 1200>30- Yes
			System.out.println("b is largest");
		} else {
			System.out.println("c is largest");
		}
	}

}
