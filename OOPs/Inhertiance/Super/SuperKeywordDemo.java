package OOPs.Inhertiance.Super;

/*
 * super: refers the object of immediate  parent class object
 * A
 * |
 * B - super --A
 * |
 * C - super -- refers to Class B
 * 
 * can't use super keyword in static method/area
 * 
 * usage: variables, methods, const.
 * variables - parent class prop and child prop having same name, in child class we can access the parent prop with super keyword in non static area
 * if two static members having same name in parent and child class then to access the static prop of parent class we use parent classname.propname
 * if prop names are diff in pboth classes, then we can access the non static prop of parent class directly in non sttaic method and by suing object of child class in static method
 * methods-
 * const.- 
 */
public class SuperKeywordDemo {
	int a = 10;
	static int b= 500;
	int c = 900;

}
