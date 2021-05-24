package OOPs.Variables;

public class ClassB {
	int b = 200;
	static int s = 890;

	public static void main(String[] args) {
		ClassVar1 obj = new ClassVar1();
		System.out.println(obj.a);

		System.out.println(ClassVar1.s);
		System.out.println(s);

	}

}
