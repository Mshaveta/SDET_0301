package OOPs.ThisKeyword;
/* Can we use this() in method??//NO
* Can we call const in method??//yes---> by creating an object of class
* can we call method in const??//Yes
* this
* const overloading
* this()--const. chaining
*/
public class TrickyQues {
	
	public TrickyQues() {
		System.out.println("Const");
		 m1();
	}
	
	public void m1() {
		 
		System.out.println("m1");
	}

	public static void main(String[] args) {
		TrickyQues tq = new TrickyQues();
		tq.m1();
		
	}

}
