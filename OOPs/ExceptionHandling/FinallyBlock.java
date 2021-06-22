package OOPs.ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println(10 / 0);

		} catch (Exception e) {
			e.printStackTrace();

		}  finally {
			System.out.println("Finally");
		}
		
		//browser.close();
		System.out.println("End");

	}

}
