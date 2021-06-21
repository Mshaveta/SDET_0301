package OOPs.InterfacesNewFeatures.DefaultMethods;

public class ClassA implements I1,I2 {
	public void m2() {
		m1();
		mi2();
		I1.super.m1();
	}

	
	@Override
	public void m1() {
		I1.super.m1();
		I2.super.m1();
		 
	}
	 

	public static void main(String[] args) {
		ClassA obj = new ClassA ();
		obj.m1();
		obj.m2();
		obj.mi2();
		

	}

}
