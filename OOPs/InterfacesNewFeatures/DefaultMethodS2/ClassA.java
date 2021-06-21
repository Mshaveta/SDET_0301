package OOPs.InterfacesNewFeatures.DefaultMethodS2;

public class ClassA implements I2 {

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.m1();
		obj.m2();
		obj.m3();

	}

	@Override
	public void absMethod() {
		System.out.println("absMethod -I1");

	}

}
