package OOPs.Variables;

/*
 * Instance Variable / object level var / global variable
 * 1. Declaration: Declare the variable outside the method, block, const and inside the class
 * 2. no need to init. such kind of variable, by default its value is acc. to itys Data type.
 * 3. why object level var -  the memory will be allocated to these variable in heap area at 
 * the time of object creation
 * 4. accessibility: static/ non static methods
 *  static - we can't access indtance variable in static area directly, 
 *  with the help of object of class
 *  non static Area - Yes, can be accessible directly within same class.
 *  
 *  5. Values of instance variables varies as we create diff . no of objects of a class
 *  Eg: Pages-class (int title) -Home-title,AboutUS-tile,conatct
 *  
 */
public class InstanceVariable {

	int a;// property/fiedl/data member/instance variable

	//static area/method -class level
	public static void main(String[] args) {

		// creating an object of class
		InstanceVariable obj = new InstanceVariable();
		//System.out.println(obj.a);
		obj.a=100;
		System.out.println(obj.a);//accessing the prop of class with the help of object
		
		InstanceVariable obj1 = new InstanceVariable();
		obj1.a=890;
		System.out.println(obj1.a);
		
		InstanceVariable obj2 = new InstanceVariable();
		System.out.println(obj2.a);
		
		InstanceVariable obj3 = new InstanceVariable();
		System.out.println(obj3.a);
		
	}

}
