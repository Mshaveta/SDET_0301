package OOPs.Abstraction;

public class Trainer extends PersonAbstract  {

 
	public void details() {
		System.out.println("Trainer Details");
		
	}
	public static void main(String[] args) {
		Trainer t = new  Trainer ();
		t.details();
		t.taxCal();
		
	}

}
