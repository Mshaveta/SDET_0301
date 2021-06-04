package OOPs.ThisKeyword;

public class MainClass {
	
	public MainClass() {
		System.out.println("MAIN class Const");
	}
	
	public void m2() {
		System.out.println("MAIN class");
	}

	public static void main(String[] args) {
		CombineDemo cd= new CombineDemo(1000);
		System.out.println(cd.a);
		System.out.println(CombineDemo.b);
		
		CombineDemo.m2(cd);//actual param
		
		int res = cd.m1(4,5);
		System.out.println(res);
		
	}

}
