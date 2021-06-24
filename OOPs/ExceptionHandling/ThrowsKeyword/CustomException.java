package OOPs.ExceptionHandling.ThrowsKeyword;

public class CustomException extends RuntimeException {
	String msg;//null
	
	public CustomException(String msg) {
		
		super(msg);
		//this.msg = msg;
	}
//	public void printMsg() {
//		System.err.println(msg);
//	}

 
}
