package OOPs.Methods.Doubts;

public class ObjAsParamClassB {

	public static void bm1(ObjAsParamClassA aobj) {
		aobj.am1();
		System.out.println("bm1");
	}

	public static void bm2(ObjAsParamClassA aobj) {
		aobj.am1();
		System.out.println("bm2");
	}
	public static void bm3(ObjAsParamClassA aObj, ObjAsParamClassB bObj ) {
		aObj.am1();
		aObj.am2();
		System.out.println(aObj.aVar);
		System.out.println("bm3");
		bObj.m4();
	}

	public void m4() {
		System.out.println("m4 in classB");
	}
	public static void main(String[] args) {
		ObjAsParamClassA ao = new ObjAsParamClassA();
		ObjAsParamClassB bo = new ObjAsParamClassB();

		ObjAsParamClassB.bm1(ao);
		ObjAsParamClassB.bm2(ao);
		ObjAsParamClassB.bm3(ao,bo);

	}

	
}
