package OOPs.Polymorphism.CompleteExample;

public class Moverriding extends Moverloading {
	public void m1() {
		System.out.println("m1");
		super.m1();//
	}
	
	public static void main(String[] args) {
		Moverriding obj = new Moverriding();
		obj.m1();//
		obj.m1(100);
	}
}
