package OOPs.Polymorphism;

import java.util.Arrays;

/*
 * Can we overload main method?- Yes
   Can we override main method?- NO,becoz static methods can be oveeridden.
   
   -----------------------------------------------------------------------
   1. parent- static with same name and zero args , child - static with same name and zero args : no overloading, no overrdiing-- can access methods the method using Class NAme
   2. parent- static , child - non static : compilation Error
   3. parent- non-static , child - non static : overrdiing - name same- no of param, type of param, return type same
   4. parent- non-static with zero param method , child - non static with 1 param method - method overloading
   5. parent- static  with zero ars , child class- non sttaic method with one args - overloading concept
 */
public class StaticConcept_Poly {
	public static void m1() {
		System.out.println("Static m1 - parent");
	}
	
//	//user defined 
//	public static void main(int[] args) {
//		System.out.println("main method ");
//		System.out.println(Arrays.toString(args));
//	}
//	//psvm (String[] args)--JVM
//	public static void main(String[] args) {
//		System.out.println("main method -String");
//		int[] arr = {1,2,3};
//		main(arr);
//	}
}
