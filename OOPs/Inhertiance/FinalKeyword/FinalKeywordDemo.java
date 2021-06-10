package OOPs.Inhertiance.FinalKeyword;

/*
 * Final keyword== CONstants - values can't be changed
 * Final Keyword - used to restrict the user to 
 * - Change the value of Variable
 * - to inherit/extend the class
 * -  to override the method
 * 
 * use final keyword infromnt of var.
 * final variables is mandatory to init.
 * 
 * 
 * with const.--
 * can declare Final var , but can init once in the const.
 * we can't inity final var in method 
 * 
 * if final var is init, then can;t change its values in const.
 * 
 * 
 * final static - mandatory to init the var suring declaration
 */
  final public class FinalKeywordDemo {
	final int A;
	final static int B = 100;

	public FinalKeywordDemo() {
		A = 10;

	}

	public static void main(String[] args) {
		FinalKeywordDemo fkd = new FinalKeywordDemo();
		// fkd.a=100;
		System.out.println(fkd.A);
	}
	
	//final Method
	
	final public void m1() {
		System.out.println("m1");
	}

}
