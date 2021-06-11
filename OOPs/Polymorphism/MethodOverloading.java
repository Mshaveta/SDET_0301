package OOPs.Polymorphism;
/*
 * Polymorphism : Many forms, one methid can behave differently acc. to diff dobjects
 *  Two Types:
 *  Method Overloading / Compile time Poly. / Static binding --Single
 *  Method Overriding / Run time / dynamic binding-- Inheritance 
 *  
 *  
 *  
 *  Method Overloading: - two or more tahn two methods with same name in a class with
 *  - diff no. of params
 *  - diff types of param
 *  - diff. seq. of aparams
 */
public class MethodOverloading {

	 public int m1(int a) {
		 System.out.println("m1");
		 return a;
	 }
	 
	 public String m1(String a) {
		 System.out.println("m1");
		 return a;
	 }
	 
	 public void m1(int a, String b) {
		 System.out.println("m1");
	 }

	 public void m1(String a, int b) {
		 System.out.println("m1");
	 }
	 public static void main(String[] args) {
		 MethodOverloading mo = new  MethodOverloading();
		 mo.m1(10, "20");
	}
}
