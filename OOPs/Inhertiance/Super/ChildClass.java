package OOPs.Inhertiance.Super;

public class ChildClass extends SuperKeywordDemo {
	int a=100; //inst.
	static int b=890;
	
	public void m1() {
		System.out.println(super.a);//10
		System.out.println(c);//900
		System.out.println(b);//890
	}
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		System.out.println(cc.a);//100
		cc.m1();//
		System.out.println(SuperKeywordDemo.b);//500
		System.out.println(cc.c);//900
		
		 
	}

}
