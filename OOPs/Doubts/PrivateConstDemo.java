package OOPs.Doubts;

public class PrivateConstDemo {
	private PrivateConstDemo() {
		System.out.println("PrivateConstDemo");
	}

	public void m1() {
		System.out.println("m1");
	}

	public static PrivateConstDemo getInstance() {
		PrivateConstDemo obj = new PrivateConstDemo();
		return obj;
	}
}
