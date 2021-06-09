package OOPs.Inhertiance.paramConst;

public class ChildConst extends ParentConst {

//	public ChildConst(int x) {
//		 super(10);
//		 System.out.println("Child -" + x);
//		 
//	}

	public ChildConst(int x) {
		// JVM - super()
		//super();
		System.out.println("Child -  param const");
	}

	public ChildConst() {
		this(10);
		System.out.println("Child - non param const.");

	}

	public static void main(String[] args) {
		ChildConst obj = new ChildConst();
	}
}
