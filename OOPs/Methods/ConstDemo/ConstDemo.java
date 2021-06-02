package OOPs.Methods.ConstDemo;
/**
 * 
 *  Const -  is special kind of method having same name as that of class name,
 *  which is having no return type.
 *  there is no nedd to call the const. explicitly, it will be called automatically at the time of object creation
 *  Why ? const. will automaticvally inmit/, assign the default values to instance vars acc. to their dts.
 *
 *  Ans: JVM calls one default const--no params to init, assign the values to global inst. variables
 *  const types: default const - no param, param. const
 *  
 *  default const - JVM--no param
 *  user defined - param, non param
 */

public class ConstDemo {
	int a;//0
	
	//Const- default const
	public ConstDemo() {
		System.out.println("in const-"+a);
		a=100;	
		System.out.println("in const-"+a);
	}

	//Method
	public void m1() {
		System.out.println("enter- "+a);//100
		a=500;	
		
		System.out.println("exit method "+a);
	}
	
	public static void main(String[] args) {
		
		ConstDemo obj = new ConstDemo();//const call--a=100
		obj.m1();
		System.out.println(obj.a);//500

	}

}
