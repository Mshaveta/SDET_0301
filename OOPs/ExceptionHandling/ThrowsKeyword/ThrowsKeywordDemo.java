package OOPs.ExceptionHandling.ThrowsKeyword;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * checked - checked at compile tinme -- IO exception, interrupted exception 
 * throws- used to handle the checked exceptions
 * - throws keyword use to declare the exceptions  with the method signature
 * - try catch
 * 
 */
public class ThrowsKeywordDemo {
	public static void m1() throws InterruptedException, FileNotFoundException     {
		System.out.println("m1 starts");
		Thread.sleep(5000);//
		
		//filepath
		String path = System.getProperty("user.dir")+"\\src\\OOPs\\ExceptionHandling\\ThrowsKeyword\\Test.properties";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		 
		 

		System.out.println("m1 End");
	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException    {
		System.out.println("Start");

		m1();
		System.out.println("End");

	}

}
