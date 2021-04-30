package SDET_0301;
public class TypeCasting{
	public static void main(String[] args){
		byte b=125;//1byte- 8 bits-1 space-01
		short s = b; //2 bytes- 2spaces--1 left
		int i = s; //4 bytes-numeric
		long l = i;
		
		float f = 123.45f;//4bytes- floating
		double d= f;//8 bytes
	 
		char ch='A';//2 bytes
		i=ch;//65
		
		float x = i;
		
		System.out.println(x);
	}
}