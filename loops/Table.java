package SDET_0301.LoopDemos;

import java.util.Scanner;

/* 2 * 1 = 2
 * 2 * 2 = 4*/
public class Table {
	 
	public static void main(String[] args) {
		
//		Scanner scn = new Scanner(System.in);		
//		System.out.println("Please enter the table no.-");
//		
//		int n =2;//n=5
//		int res=0;//local variable
//		
//		for(int i=1;i<=10;i++) {//i=2,2<=10
//			res = n*i;//5 * 2 =10
//			System.out.println(n+" * " + i +" = "+ res);// 5 * 2 = 10
//			
//		}
//		
//		//
//		System.out.println(res);//20,50

		int sum = 0;//0->1>3>6>10>15
		
		for (int i = 1; i <= 5; i++) {//5 times
			 
			sum = sum + i;//sum =sum + i
			 
			//i=1 , sum= 0+1 = 1
			//i=2,  sum =1+2 = 3
			//i=3 , sum= 3+3 =6
			//i=4, sum = 6+4=10
			//i=5, sum = 10+5=15
			//i=6
			
		}

		System.out.println(sum);// 15

	}

}
