package OOPs.Methods.Paramertic;

import java.util.Scanner;

public class AvgOfNums {
	// int globalSum;
	public int sum(int n1, int n2) {// n1=2,n2=3
		int res = n1 + n2;
		// globalSum = n1 + n2;
		return res;
	}

	public int avg(int a, int b) {// a=2,b=3

		// calling the sum method
		int sumRes = sum(a, b);// 5
		int avg = sumRes / 2;// 5/2
		return avg;
	}

}

//S2:To$day is Wed#nesday
//o/p:Wed$nesday is To#day 

//String1:- I/p: To$day is Wed#nesday
//o/p:- We#dnesday is# Today 
