package OOPs.Inhertiance.FinalKeyword;

public class FinalChildClass extends FinalKeywordDemo {
	public void m1() {
		System.out.println("m1");
		
		FinalKeywordDemo obj = new FinalKeywordDemo();
		obj.m1();
	}
}
