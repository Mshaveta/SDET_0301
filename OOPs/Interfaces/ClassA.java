package OOPs.Interfaces;

public class ClassA implements I1, I2 {

	public void childMethod() {
		System.out.println("Child class");
	}

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("M2");
	}

	@Override
	public void m3() {
		System.out.println("m3");
		
	}
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.m1();
		a.m2();
		a.m3();
	}


}
