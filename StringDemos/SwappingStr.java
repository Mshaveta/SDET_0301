package StringDemos;

import java.util.Scanner;

public class SwappingStr {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter second int ");
		int s2 = scn.nextInt();
		System.out.println("Please enter first String ");
		String s1 = scn.next();//String value
		System.out.println("Please enter char value ");
		char ch = scn.next().charAt(0);//String value
		
	 System.out.println(s1 + " "+s2 +" "+ch);
		 
//		int s1Len = s1.length();// 4
//		int s2Len = s2.length();// 4
//
//		s1 = s1 + s2;//// abcddefg
//
//		s2 = s1.substring(0, s1Len);// 4
//		System.out.println("S2- " + s2);
//
//		s1 = s1.substring(s2Len);
//		System.out.println("S1- " + s1);

	}

}
