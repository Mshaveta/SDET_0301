package OOPs.InterfacesNewFeatures.DefaultMethodS2;
/*
 * default =- non static method 
 */
public interface I1 {
	public void absMethod();
	 
	public default void m1() {
		System.out.println("Default Method - I1");
	 
	}
	public default void m3() {
		System.out.println("Default Method - I1 m3");
	 
	}
}
