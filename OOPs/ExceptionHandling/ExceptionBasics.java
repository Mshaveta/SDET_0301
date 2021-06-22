package OOPs.ExceptionHandling;

/*
 * Runtime Execption -  unchecked Exception:
 * exception occurs at the time of execution
 * Error: Can n't be handleded. -m/m ,syntax .logical
 * Exception: can be 
 * checked - compile
 * unchecked- runtime----
 *  -  ArithmeticException
 * -  NullPointerException
 * 
 * can't define:
 *  only try{} block
 *  only catch(){}
 *  only finally{}
 */
public class ExceptionBasics {
	public static void main(String[] args) {
		System.out.println("Start Execution");
		
		try {
			int a = 10;
			int b=0;
			int c = a / b;
			
			//String 
			String st = null;
			System.out.println(st.length());
			
			//
			int[] arr = new int[5];
			arr[6]=10;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
//		try {
//			int a = 10;
//			int b=0;
//			int c = a / b;//JVM Arithmetic Exception //ArithmeticException -class-Runtime
//		}catch(Exception e) {
//			//System.out.println(e);//java.lang.ArithmeticException: / by zero
//			e.printStackTrace();
//			//System.out.println(e.getMessage());
//			
//		}
//
//		
//		try {
//			String st = null;
//			System.out.println(st.length());
//		} catch (Exception npe) {
//			npe.printStackTrace();
//
//		}
//
//		
//		try {
//			int[] arr = new int[5];
//			arr[6]=10;
//		} catch (Exception npe) {
//			npe.printStackTrace();
//
//		}
		
		 
		System.out.println("Stop Execution");
		System.out.println("Stop Execution");

	}
}
