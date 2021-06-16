package OOPs.Abstraction;

/*  A
 *  |
 * B C
 *  Abstract class- Abstract class is the class that can't be instantiate. (can'tr creater an object )
 *  we need to use abstr act keyword inc front of class
 *  
 *  if a class having abstract method, then that class should be abstracted one.
 *  Abstract class may conatins AbstrcAT METHOD AND NON ABS METHODS
 *  
 *  abstract method -  methods having no definition/body
 *  non - abstract method -  methods having  definition/body
 *  to create abstract method - need to use abstract keyword
 */
  public abstract class PersonAbstract{
	String name;
	int age;
	String tech;
	abstract public void details();
	//non abstract method
	public void taxCal() {
		System.out.println("taxCal");
	}
	public static void main(String[] args) {
		//AbstractionDemo obj = new AbstractionDemo();
	}
}
