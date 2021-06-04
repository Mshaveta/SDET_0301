package OOPs.ThisKeyword;
/*
 * Can we use this() in method??//
 * Can we call const in method??//
 * can we call method in const??//
 */

public class CombineDemo {
	int a=10;
	static int b=20;
	
	public CombineDemo(){
		System.out.println("const - class1");
	}
	
	public CombineDemo(int a){
		this();
		System.out.println("const - class2..."+a);
	}
	
	public int m1(int a, int b) {
		 this.a=a;
		 CombineDemo.b=b;
		 int msg = this.a+ CombineDemo.b;
		// String msg = "Values are- "+this.a+"--"+CombineDemo.b;
		 return msg;
	}
	
	public static void m2(CombineDemo obj) { //formal param
		 
		System.out.println(obj.a);
		System.out.println(b);
	}

	 

}
