package OOPs.ThisKeyword;

public class ThisWithMethod {
	public void m1() {
		System.out.println("m1");
	}
	
	public void m3() {
		System.out.println("m3");
	}

	
	public void m2() {
		System.out.println("m2");
		this.m1();
		m3();
	}

	public static void main(String[] args) {
		ThisWithMethod obj = new ThisWithMethod();
		obj.m2();
	}

}
