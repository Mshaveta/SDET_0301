package OOPs.ExceptionHandling;
/*
 * TRY{
 * }finally{
 * }
 * 
 * execute the finally block first then print the exception message by java and stops the execution
 */
public class TryWithFinally {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println(10 / 0);

		}  finally {
			System.out.println("Finally");
		}
		
		//browser.close();
		System.out.println("End");

	}

}
