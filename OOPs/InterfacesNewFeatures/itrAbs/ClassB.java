package OOPs.InterfacesNewFeatures.itrAbs;

public class ClassB implements  I1{

 
	public  void m1() {
		System.out.println("Static Method - I1 m1");
	 
	}

//	public   void am2() {
//		System.out.println("am2");
//
//	}
	public static void main(String[] args) {
//		ClassB b =new ClassB();
//		I1.m1();
		I1 i = new ClassB();
		i.absMethodI1();
		i.m3();
		 
	}

	@Override
	public void absMethodI1() {
		// TODO Auto-generated method stub
		
	}

}
