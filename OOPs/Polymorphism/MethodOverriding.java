package OOPs.Polymorphism;

public class MethodOverriding {
	public String method() {
		System.out.println("Method -Parent");
		return "Testing";

	}
	
	public String m2(int x) {
		method();
		System.out.println("Method2 -Parent");
		return "Testing";

	}
}
