package OOPs.Methods.Paramertic;

import java.util.Scanner;

public class ParamWithReturn {

	public int sum(int m, int n) { //m=4,n=5
		System.out.println(m + "-" + n);
//		int a=x;
//		int b=y;
		int c = m + n; //4+5
		return c; //9
	}

	public static void main(String[] args) {
		ParamWithReturn pwr = new ParamWithReturn();
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter two numbers-");
		// local vars
		int x = scn.nextInt();// 4
		int y = scn.nextInt();// 5
		System.out.println("Value of x is-"+x+" and y is"+y);

		int res = pwr.sum(x, y);//sum(4,5)
		//res=9

		//System.out.println("Sum is - " + pwr.sum());
		System.out.println("Res is - " + res);
	}

}
