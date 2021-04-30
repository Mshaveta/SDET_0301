package loops;

public class SingleForLoop {

	public static void main(String[] args) 
	{
		
		String java_version = System.getProperty("java.vendor");
		System.out.println(java_version);
		
		// for(initialisation; cond; inc/dec){ //block }
		// 1-5 or 0-<=4
		//int i = 1;
		
		int a=1;
		a=20;
		a=30;
		
		//a==30
		
		
		int i;// decalration
		for (  i = 1; i < 10; ++i) {
			// Stp1 - init- i=1,
			// st2: check the cond - i<=10 ==> 5<=10--true
			// Stp3: execute the sattemt -- Hello JAVA
			System.out.println("Hello Java");// 1
			// St4: i++ --> i=2
			// st5: i<=10---> 2<=10--true
			// perform stp3
			// i==11<=10--false
		}		
		System.out.println("value of i"+ i);///we can access variable i=10

		
		
		
		
		
		
		
		/*endless loop*/
//		for (; ; ) {
//			System.out.println("TEst");
//		}

	}

}
