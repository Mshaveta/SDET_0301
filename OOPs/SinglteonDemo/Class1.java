package OOPs.SinglteonDemo;
/*
 * const -private
 * should be one static method
 */
public class Class1 {

	private Class1(){
		System.out.println("const");
	}
	
	public void nonStaticM() {
		System.out.println("nonStaticM");
	}
	
	public static Class1 staticM() {
		Class1 obj = new Class1();
		return obj;
	}
}
