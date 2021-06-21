package OOPs.InterfacesNewFeatures.itrAbs;

public interface I2 extends I1 {
	 
	public default void m2() {
		 
		System.out.println("Default Method - I2 m2");
	}
	public default void m3() {
		I1.super.m3();
		System.out.println("Default Method - I2 m3");
	 
	}
}
