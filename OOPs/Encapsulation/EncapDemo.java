package OOPs.Encapsulation;
/**
 * 
 * encap concept - all the properites/ variable should be private and methods should be public
 * in a class, all the prop are private and methods are public
 * and also createing sep. methods - getter , setter for prop. is called bean class
 */

public class EncapDemo {
	private int a;
	public void set_a(int a){
	 
		this.a=a;
		
	}
	
	public int get_a() {
		return a;
	}

	

}
