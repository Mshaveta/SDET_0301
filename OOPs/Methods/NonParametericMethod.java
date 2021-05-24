package OOPs.Methods;

/**
 * Method:- block having some set of stmts and execute those stmts by calling
 * the method. Method: 1. Method declaration---abstraction/ interfaces <access -
 * modifier> < return type> <method-name > <for params()> {} public void m1();
 * 
 * 2. Method definition: having some body public void m1(){ body }
 * 
 * 3. Method calling: m1();
 * 
 *
 */

public class NonParametericMethod {
	// Non static- without using statioc keyword
	// nonstatic- object level/ instance
	//method defintion
	public void nonStaticMethod1() {
		System.out.println("enter into method");// 2,5
		System.out.println("m1 Method without params");// 3,6

	}

	//method defintion
	public void nonStaticMethod2() {
		System.out.println("Enter into non static method2........");//4
		nonStaticMethod1();//method calling
		System.out.println("nonStaticMethod2");// 7
	}

	// JVM
	public static void main(String[] args) {

		System.out.println("Start execution");// 1

		// create the obj of current class
		NonParametericMethod nm = new NonParametericMethod();
		nm.nonStaticMethod1();//method
		nm.nonStaticMethod2();

		System.out.println("End Execution");// 8

	}

}
