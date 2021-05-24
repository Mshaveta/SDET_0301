package OOPs.Methods;

public class MethodsDemo {
	int a=899;// 0->100
	 
	static int b;

	// non static
	public void m1() {
		int a=100; //local
		System.out.println(a);//100
		System.out.println("Value of a is-" + a);// 100
		 
		
		
		System.out.println("Value of b is-" + MethodsDemo.b);// 100
	}

	public void m2() {
		 
		System.out.println("Value of a in method m2-" + a);//
		System.out.println("Value of b is-" + MethodsDemo.b);// 100
	}

	public static void main(String[] args) {
		
		
		System.out.println("Start");
		MethodsDemo md = new MethodsDemo();
		
		int a=190; //local 
		System.out.println(a);
		System.out.println(md.a);//inst var
		
		
		
		
		
		
		
		MethodsDemo md1 = new MethodsDemo();// a=0

		md.a = 100;// 0-->100
		b = 6700;

		md.m1();//6700
		md.m2();//6700
		md1.m2();//6700

		b = 890;

//		md1.a = 600;//0->600
 		md1.m1();

//		

	}

}
