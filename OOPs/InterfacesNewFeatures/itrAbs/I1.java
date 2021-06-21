package OOPs.InterfacesNewFeatures.itrAbs;
/*
 * default =- non static method 
 */
public interface I1 {
	public void absMethodI1();
	 
	public static  void m1() {
		System.out.println("Static Method - I1 m1");
	 
	}
	public default void m3() {
		System.out.println("Default Method - I1 m3");
	 
	}
}
