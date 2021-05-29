package OOPs.Methods.Doubts;

public class MainClass {
	public static void main(String[] args) {
		ObjAsParamClassA ao = new ObjAsParamClassA();
		ObjAsParamClassB bo = new ObjAsParamClassB();

		ObjAsParamClassB.bm1(ao);
		ObjAsParamClassB.bm2(ao);
		ObjAsParamClassB.bm3(ao,bo);

	}

}
