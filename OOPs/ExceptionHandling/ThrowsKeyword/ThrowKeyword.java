package OOPs.ExceptionHandling.ThrowsKeyword;

/*
 * throw keyword is used 
 * - to throw an object of  the custom exception class
 * 
 * A.E
 * A.I.O>b
 * N.P.E------------
 * 
 * Syntax: throw new ArithmeticExcception();//not recommd.
 * throw new CustomException
 * 
 * 
 * e.printstacktrace();//
 * Syso(e)
 * e.getmessage();
 */
public class ThrowKeyword {
	public static void avg_marks() {
		int avg = 82 / 2;
		if (avg < 50) {
			try {
				 throw new CustomException("Avg should be greater than 50%");
			}catch(CustomException e) {
				//System.out.println(e.printMsg());
				e.printStackTrace();
			 
			}
			
		}
	}

	public static void main(String[] args) {
//		try {
//			System.out.println(10/0);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	 
//		System.out.println(10/0.0);
		 
		System.out.println("Start");
		avg_marks();
		System.out.println("End");
	}
}
