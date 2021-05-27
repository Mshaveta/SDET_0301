package OOPs.Methods.Doubts;

public class ClassB {
	int b=100;
	public void mb1() {
		System.out.println("ClassB - m1");//
		ClassA.m2();
		
		ClassA obj = new ClassA();
		obj.m1();
	}
	
	public static void bm2() {
		System.out.println("bm2");//1-bm2
	}

	public static void main(String[] args) {
		 
		ClassA a = new ClassA();
		ClassB objb = new ClassB();
		ClassB objb1 = new ClassB();
		a.m1();//bm2 , Non static Method
		ClassA.m2();//Static Method,100
		objb.mb1();//clasB-m1,Static Method,100,bm2,"Non Static Method - m1
		
		a.m3();//bm2,Non Static Method - m1
		
		bm2();//bm2
		objb.b = 200;
		System.out.println(objb1.b);//100
		
		
		 
	}

}
