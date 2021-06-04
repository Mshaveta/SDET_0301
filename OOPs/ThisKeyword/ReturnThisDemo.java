package OOPs.ThisKeyword;

public class ReturnThisDemo {
	
	public ReturnThisDemo  m1() {
		 
		return this;
	}

	public static void main(String[] args) {
		ReturnThisDemo obj = new ReturnThisDemo();
		ReturnThisDemo x = obj.m1();

	}

}
