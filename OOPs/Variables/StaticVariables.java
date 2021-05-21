package OOPs.Variables;

/*
 * Static  Variable / class level var / global variable
 * non need to carete an object of class to access static members
 * 
 * 1. Declaration: Declare the variable outside the method, block, const and inside the class with static keyword
 * 2. no need to init. such kind of variable, by default its value is acc. to its Data type.
 * 3. why class level var -  the memory will be allocated at the time of class loading.
 * m/m area is - static M/m.
 * 
 * 4. accessibility: static/ non static methods withn same class
 *  static - we can access static variables directly  in static area , 
 *  non static Area - can access static variables directly  in non static area , 
 *  
 *  we can access static members in outside the class with the class Name.
 *  5. Values of static variables don't varies as we create diff . no of objects of a class
 *   
 *   static members share the m/m.
 *   
 *   eg:App. static name/url/logo
 */
public class StaticVariables {
	static int y;// 0
	static int z;

	public static void main(String[] args) {
//		 System.out.println(StaticVariables.y);
//		 //or
//		 System.out.println(z);
		StaticVariables so1 = new StaticVariables();
		StaticVariables so2 = new StaticVariables();
		StaticVariables so3 = new StaticVariables();
		System.out.println(so2.y);
		System.out.println(so3.y);
		so1.y = 100;
		System.out.println("----------");
		System.out.println(so2.y);
		System.out.println(so3.y);
		System.out.println(so1.y);
	}

}
