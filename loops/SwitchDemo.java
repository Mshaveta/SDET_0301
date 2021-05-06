package SDET_0301.LoopDemos;

import java.util.Scanner;

/* 1- addition,2-even odd,3 -  mult, 4- remainder*/
public class SwitchDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter op. no.-");
		int op = scn.nextInt();// int 1,2,3,4,5

		int day =2+3;
		switch (op) {
			case 1:
				System.out.println("Please Enter First Number-");
				int a = scn.nextInt();
				System.out.println("Please Enter scnd Number-");
				int b = scn.nextInt();
				int c = a + b;
				System.out.println("Sum is - " + c);
				break; 
			case 2:
				System.out.println("Please Enter any Number-");
				int num = scn.nextInt();
				
				if(num %2==0) {
					System.out.println("Number is Even");
				}else {
					System.out.println("Number is odd");
				}
				break;  
			case 3:
				System.out.println("Case 3");
				break;
			case 4:
				System.out.println("Case 4");
				break;
			case 5:
				System.out.println("Case 5");
				break;
			default:
				System.out.println("Please choose the no from 1- 5");

		}

		System.out.println("Exit");
	}

}
