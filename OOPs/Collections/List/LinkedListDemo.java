package OOPs.Collections.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
/**
 * iterator : unidirectional, used to iterate the elmn so fcollection in f/w dirc.
 * 
 * hasNext(),next(),remove()
 * 
 * for LinkedList : - 
 * ListIterator: - bidirectional , reverse dir ads well
 * 
 * ListIterator extends Iterator
 * hasNext(),next(),remove()
 * hasPrevious(), previous()
 * @author 123
 *
 */

public class LinkedListDemo {

	public static void main(String[] args) {
		 LinkedList ll = new LinkedList();
		 ll.add(100);
		 ll.add(200);
		 ll.add(300);
		 ll.add(300);
		 ll.add(2,1000);
		 
		 System.out.println(ll);
		 
		 ll.addFirst(230);
		 ll.addLast(240);
		 System.out.println(ll);
		 
//		 Iterator itr = ll.iterator();
//		 while(itr.hasNext()) {
//			System.out.println(itr.next());
//			 
//		 }
		 
		ListIterator litr =  ll.listIterator();
		 while(litr.hasNext()) {
				System.out.println(litr.next());
				 
			 }
		 System.out.println("==============================");
		 while(litr.hasPrevious()) {
				System.out.println(litr.previous());
				 
			 }
	}

}
