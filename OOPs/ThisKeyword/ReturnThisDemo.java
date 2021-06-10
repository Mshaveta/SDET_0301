package OOPs.ThisKeyword;

public class ReturnThisDemo {
	
	public ReturnThisDemo  m1() {
		  
		return this;
	}

	public static void main(String[] args) {
		ReturnThisDemo obj = new ReturnThisDemo();
		System.out.println(obj);
		ReturnThisDemo res = obj.m1();
		System.out.println(res);
	}

}
