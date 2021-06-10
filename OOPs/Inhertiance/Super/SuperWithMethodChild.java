package OOPs.Inhertiance.Super;

public class SuperWithMethodChild extends SuperWithMethod {
	public void childMethod() {
		System.out.println("childMethod");
		super.nonStaticParentMethod();
	}
	
	public void commonMethod() {
		super.commonMethod();
		System.out.println("Common Method in child");
		super.commonMethod();
	}
	public static void main(String[] args) {
		SuperWithMethodChild obj = new SuperWithMethodChild();
		obj.nonStaticParentMethod();
		obj.childMethod();
		obj.commonMethod();
	}
}
