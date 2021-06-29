package OOPs.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * Iterable -> interface  
 * Iterator - interface -> used to iterate the elmns
 * always traverse the lemnets in uni directiobnal (f/w direction)
 * hasNext()
 * next()
 * remove()
 * 
 * 
 * LinkedList:Divya, Hardeep
 * Namika: - Set , hashSet class
 * Sonu :  LinkedHashSet
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(500);
		al.add(800);

		//Way1:
//		int count = al.size();
//		for(int i=0;i<count;i++) {
//			System.out.println(al.get(i));
//		}

		//Way2:
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			int val = itr.next();
			System.out.println(val);
		}
		
		System.out.println("=====Way3=========");
		//way3: foEeach loop--lambda expression
		al.forEach( val ->  System.out.println(val) );
		
//		al.forEach( (val) -> {
//			
//			System.out.println(val);
//		} );
			
		
		 
			
		 
		

		
	}

}
