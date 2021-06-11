package OOPs.Polymorphism;

public class MethodOverridingChild extends MethodOverriding {
//	public void method() {
//		System.out.println("Method -Child");
//		//super.method();
//	 	//return "code";
//
//	}
//	
	public String m3(String x) {
		m2(100);
		System.out.println("Method2 -Child");
		return "Testing";

	}
	 
	
	public static void main(String[] args) {
		MethodOverridingChild moc = new MethodOverridingChild();
		moc.method();
	}
}
