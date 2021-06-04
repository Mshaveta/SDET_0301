package OOPs.Methods.ConstDemo;

public class ParamConstDemo {
//	public ParamConstDemo(String hName, String uname, String pwd, String db) {
//		System.out.println(hName+"-"+uname+"-"+pwd+"- "+db);
//	}

	public ParamConstDemo(String browserName) {
		System.out.println(browserName);
	}
	
	public static void main(String[] args) {
		
		ParamConstDemo pcd = new ParamConstDemo("Firefox");
		
	}

}
