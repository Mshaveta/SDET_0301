package OOPs.InterfacesNewFeatures.DefaultMethods;

public interface I2 {
	int i=100;
	public default void mi2() {
		System.out.println("Default Method - I2");
	}
	
	public default void m1() {
		int i=100; //local var
		System.out.println("Default Method - I2 m1");
	}
}
