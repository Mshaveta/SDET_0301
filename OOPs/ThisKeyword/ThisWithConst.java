package OOPs.ThisKeyword;
/* calling one const to another called as const chaining.
 * this()- used to call the one const into another const.
 * this() should be the first statement in the const
 * we can't use this() multiple times
 */

public class ThisWithConst {
	public ThisWithConst(int a) {
		
		System.out.println("Default COnst - no param");//3
		System.out.println("exit");//4
	}

	public ThisWithConst() {
		this(100);//const calling with one param
		System.out.println("enter into param. COnst");//1
		//System.out.println("param const......" + a);//2
	}

	public ThisWithConst(int a, int b) {
		this();//calling no param const
		
	
		System.out.println("enter into param. COnst");
		System.out.println("param const......" + a);
	}

	public static void main(String[] args) {
		ThisWithConst twc = new ThisWithConst(10, 200);//
		System.out.println("Main Method");
		 

	}

}
