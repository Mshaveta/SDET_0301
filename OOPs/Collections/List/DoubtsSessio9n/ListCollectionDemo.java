package OOPs.Collections.List.DoubtsSessio9n;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * collection: grouping of objects as a single unit
 * framework: 
 * Collection: interface
 * non generic: can hold hetrogenous elmns
 * 
 * List Interface: can hold duplicate elmns.
 * insertion order is preserved.
 */
public class ListCollectionDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);// Integer object -100
		al.add(300);
		al.add(400);
		al.add(500);
//		al.add("test");// String class object
//		al.add("500");
//		System.out.println(al);
//		System.out.println("Size:-" + al.size());
//		// al.remove(0);
//		System.out.println("Remove elmn - " + al.remove("500"));
//		System.out.println(al);
//
//		System.out.println(al.get(1));
		
//		ArrayList al1 = new ArrayList();
//		al1.add("A");
//		al1.add("B");
//		al1.add("C");
//		al1.add("D");
//		
//		al.addAll(1,al1);
//		System.out.println(al);
		
		
		Iterator itr =   al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
