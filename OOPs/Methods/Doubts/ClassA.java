package OOPs.Methods.Doubts;

public class ClassA {
	
	public void m1() {
		
		ClassB.bm2();//bm2
		
		System.out.println("Non Static Method - m1");//2-
	}
	
	public static void m2() {
		System.out.println(" Static Method - m2");
		ClassB obj= new ClassB();
		System.out.println(obj.b);
	}
	
	public void m3() {
		m1();
	}
	
	 

}
