package OOPs.Variables;

public class AllVArs {
	int i;
	//i=10;//not allowed
	 

	static int s=10;

	public static void main(String[] args) {

		int x;
		x = 90;

		int l = 0;

		AllVArs rv = null;
		AllVArs obj = new AllVArs();//objt1
		System.out.println("object- " + obj);
		rv = obj;

		System.out.println("ref var - " + rv);

		System.out.println(obj.i);// 0
		System.out.println(s);
		System.out.println(l);
		System.out.println(rv);

		obj.i = 100;
		System.out.println(obj.i);

		AllVArs obj2 = new AllVArs(); //obj2
		obj2.i = 400;
		System.out.println(obj2.i);
		System.out.println(obj.i);

		obj.s = 1000;
		System.out.println("objj2 is accessing the sattic var."+obj2.s);

		l = 100;
		System.out.println(l);

	}

}
