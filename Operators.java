package SDET_0301;
public class Operators{
	public static void main(String[] args){
		/* int a=10;//a=10--> 11-->12
		System.out.println(a++);//10--->10-->11m/m
		System.out.println(a);//11
		a++; //11-->12
		System.out.println(a);//12 */
		
		/* int b = 5;//5
		int c = b++;//c=5,b=5-->6 in m/m
		 
		System.out.println(b);//6
		System.out.println(c);//5 */
		/////////////////////////////////////
		
		// int a= 10;//11-->12
		// System.out.println(a++);//10---> 10 with 11
		// System.out.println(a);//11
		
		// int c= (a++) + (a);//11 + 12 =23
		// System.out.println(c); //23
		// System.out.println(a);//12
		
		////////////////////////////////////
		/* int b=2;
		b++;//3
		b++;//4-->5
		int e=1;
		int d = b + b++ +e;//4  + 4 +1 =9
		System.out.println(b); 
		System.out.println(d); 
		System.out.println(e); //1
		 */
		
		/////////////////////////////////////
		//post ++, pre
		/* int b=2; //3//4
	 
		
		System.out.println(b++); //2
		
		System.out.println(b); //3
		 
		int c= b++;//c=3-->4
		
		System.out.println(b); //4
		//in m/m---4->5->6
		int d = b++ + b + b++;// d = 4 + 5 + 5 = 14
		System.out.println(d); //14
		System.out.println(b); //6 */
		
		/* int a=1;
		int b=2;
		int c = a+b ; //1+2=3
		c++; //4
		++c;//5
		//a=1-->2,b=2-->3,c=5-->6
		
		int d = a++ + ++b + ++c + c ;//d = 1 +  3 +  6 + 6 = 16
		
		System.out.println(a); //2
		System.out.println(b);//3
		System.out.println(c); //6
		System.out.println(d); //16 */
		
		
		//swapping of two numbers using third variable
		
		int a=10;//20
		int b=20;
		
		System.out.println("Before Swapping-"+a+","+b); 
		 
		int temp = a;//10
		
		
		a=b;//Assiging the value of b -20to a //a=20
		//b=temp//Assiging the value of temp to b//10
		
		System.out.println("After Swapping-"+a+","+b); //
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}