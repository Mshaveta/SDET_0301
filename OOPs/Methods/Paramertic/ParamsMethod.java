package OOPs.Methods.Paramertic;

import java.util.Scanner;

/*
 * Non Param - no return type
 * param , no return type
 */

public class ParamsMethod {

	static String expectedTitle;// null
	static String actualTitle;// null

//	public void m1(int x) { //def.
//		System.out.println("Val of a is- "+x);
//	}

	public static void verifyTitle(String expttl, String actTl) {

		// null == null
		// null// can't compare with string equals method
		// if (expectedTitle != null) {
//			if (expectedTitle.equals(actualTitle)) { // null == null
//				System.out.println("Title Matched!");
//			} else {
//				System.out.println("not Matched!");
//			}
//	//	}

		if (expttl.equals(actTl)) { // null == null
			System.out.println("Title Matched!");
		} else {
			System.out.println("not Matched!");
		}

	}

	public static void main(String[] args) {
		ParamsMethod pmo = new ParamsMethod();
		Scanner scn = new Scanner(System.in);
		// System.out.println("Please enter any number");
//		int a = scn.nextInt(); // local var
//
//		pmo.m1(a);//calling

		// local variables
		String expectedTitle = "facebook";
		String actualTitle = "Facebook";

		verifyTitle(expectedTitle, actualTitle);

	}

}
