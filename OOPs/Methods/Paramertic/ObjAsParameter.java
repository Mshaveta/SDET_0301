package OOPs.Methods.Paramertic;

public class ObjAsParameter {

	public void nonStaticMethod() {
		System.out.println("nonStaticMethod");
	}

	// statioc method /area
	public static void staticMethod(ObjAsParameter x) {
		System.out.println(x + "in Method");
		x.nonStaticMethod();
		System.out.println("StaticMethod");
	}

	public static void main(String[] args) {
		ObjAsParameter obj = new ObjAsParameter();
		System.out.println("in main method-" + obj);
		
	 
		staticMethod(obj);
	}

}
