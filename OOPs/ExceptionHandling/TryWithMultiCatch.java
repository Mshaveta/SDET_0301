package OOPs.ExceptionHandling;

public class TryWithMultiCatch {
	public static void main(String[] args) {
		System.out.println("Start");
		try {

			int[] arr = new int[5];
			arr[6] = 10;//AIB
			
			
			// String
			String st = null;
			System.out.println(st.length());// NPE--stop

			

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("test");
		}

		System.out.println("End");
	}
}
