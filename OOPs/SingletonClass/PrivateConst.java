package OOPs;

public class PrivateConst {
	int a=10;
	private PrivateConst(){
		System.out.println("Private COnst.");
	}

	public void m1() {
		System.out.println("m1");
	}
	
	public static PrivateConst m2() {
		PrivateConst pc = new PrivateConst();
		return pc;
		
	}

}
