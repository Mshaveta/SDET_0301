package OOPs.ThisKeyword;

/**
 * 
 * if the name of local variables and global variables- (inst.) are same then we
 * use this keyword with instance variable to diff. both.
 * for static variables we can use class name to diff.
 *
 */

public class ThisWithVariable {
	int b;// inst. global var.
	static int a;
	int c;
	public void m1(int a,int c) {
		ThisWithVariable.a=a;//inst = local
		b = a;
		this.c=c;

	}

	public static void main(String[] args) {
		ThisWithVariable twv = new ThisWithVariable();
		twv.m1(100,200);
		System.out.println(a);
		System.out.println(twv.b);
	}

}
