package SDET_0301;
/*
1. Sum of digits- 123 - 1+2+3= 6
2. reverse of a anumber--234 --432
3. pallindrom 121,111,1331-----121
4. Armstrong or not - 153--1^3 +  5^3 +3^3 === 153

*/
public class Operators_Arth{
	public static void main(String[] args){
		// int a=10;
		// int b=2;
		// int c = a%b;//0
		// int d = a/b;//5
		// System.out.println(c);
		// System.out.println(d);
		//451 --> 4 5 1
		int a=457;//45//4 5 1 -- 145
		int r1 = a%10;//7 
		a = a/10;//45
		
		//for scnd digit
		int r2 = a%10;//45%10 -->5
		
		//third digit
		int r3 =a/10;//45/10--->4
		
		System.out.println(r1+r2+r3); //7+5+4 = 16
		 
		
		 
	}
}