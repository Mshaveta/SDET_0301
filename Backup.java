/*Source Code
class-keyword
BackupDemo - identifier- className, functionName, interface Name, variable name
literal - value
builtin - null,false,true*/
package SDET_0301;
public class Backup{
	//psvm- String class in java
	//JVM starts execution from main method
	public static void main(String[] args){
	 int a;//declaration
	 a=100; //init.
	 int b=100;//
	 //String - ""
	 //char - ''
	 
	 a=20;
	// int b=20;
	 System.out.print(""+a+b);//2020
	 System.out.print(a+b+" Sum");//40 Sum
	 System.out.print("Sum is - "+(a+b));//Sum is - 40
	}
}