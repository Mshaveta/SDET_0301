package OOPs.InterfacesNewFeatures.DefaultMethods;
/*
 * default =- non static method 
 */
public interface I1 {
	int i=10;//public static final
	public default void m1() {
		System.out.println("Default Method - I1");
		int i=10;
	}
}
