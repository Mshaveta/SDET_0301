package OOPs.Inhertiance.Super;

public class SuperWithConstChild extends SuperWithConst {

	 public SuperWithConstChild() {
		 
		 super(100);//should be the first statement in const.
		 // we can't call aprent class const in any child class's method
		// super(100);
		 
	 }
	 public static void main(String[] args) {
		 SuperWithConstChild swcc = new SuperWithConstChild();
		 
	}

}
