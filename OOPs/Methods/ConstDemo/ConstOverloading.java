package OOPs.Methods.ConstDemo;

/**
 * const overloading
 * two consts having:
 *  -  diff no of params--done
 *  - diff. types of params
 *  - diff. seq. of aparms
 *
 */
public class ConstOverloading {
	public ConstOverloading() {
		System.out.println("no param const.");
	}

	public ConstOverloading(int a) {
		System.out.println("int  param const.");
	}
	
	public ConstOverloading(String a) {
		System.out.println("String  param const.");
	}
	
	
	public ConstOverloading(String a,int b) {
		System.out.println("String a,int b - String  param const.");
	}
	
	public ConstOverloading(int b, String a) {
		System.out.println("int b, String a -  String  param const.");
	}
	public static void main(String[] args) {
		ConstOverloading col = new ConstOverloading(100);
		ConstOverloading col1= new ConstOverloading("test");
		ConstOverloading col2= new ConstOverloading(100);
		ConstOverloading col3= new ConstOverloading(100,"100");
	}

}
