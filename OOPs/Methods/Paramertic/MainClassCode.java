package OOPs.Methods.Paramertic;

import java.util.Scanner;

public class MainClassCode {

	public static void main(String[] args) {
		AvgOfNums obj = new AvgOfNums();
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the numbers");
		// loop-- times user
		int x = scn.nextInt();// 2
		int y = scn.nextInt();// 3

		// System.out.println(obj.globalSum);//0

		// int sum = obj.sum(x, y);
		// System.out.println("After Sum-"+sum);//3
		//
		int avg = obj.avg(x, y);// 2,3
		System.out.println("AVg is - " + avg);

	}

}
