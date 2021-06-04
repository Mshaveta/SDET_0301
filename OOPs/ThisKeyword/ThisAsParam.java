package OOPs.ThisKeyword;

public class ThisAsParam {

	public static void m1(ThisAsParam obj) {
		obj.m3();
	}

	public void m2() {
		System.out.println("Start");
		m1(this);// objval-method calling
		System.out.println("Start");
	}

	public void m3() {
		System.out.println("m3");
	}

	public static void main(String[] args) {
		ThisAsParam obj = new ThisAsParam();
		// obj =objval
		obj.m2();
		m1(obj);

	}

}
