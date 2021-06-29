package OOPs.Collections.List;

import java.util.ArrayList;

/*
 * collection: collection framework
 * Collection: interface
 * Collections: class
 * 
 * collection can store hetrogenous elmns.
 * List Interface: 
 * allows duplicate elmns
 * insertion order preserve.--10,20,30
 * like arrays, its also starts with index no 0
 * 
 * class ArrayList extends List
 * 
 * Array:
 * size: int[] arr = new int[5];
 * arr[0]=100;
 * Syso(arr[0]);// 
 * 
 * List list = allElemnets("<a>"); [1,2,4,5,6,7,7]
 * list.size();
 * ------------
 * Generic: collection allows to store the similar type of  objects. - homo
 * non generic:- any tyep of data---hetro
 * 
 * addAll
 * S1: collection1 -  generic, coll2 - N.G ---- allow
 * S2: collection1 -  Non.generic, coll2 - G ---- allow
 * S3: collection1 -  generic-String, coll2 - Generic - integer ---- not allowed
 */
public class ListDemo {
	public static void main(String[] args) {
//		ListDemo ld1 = new ListDemo();
//		ListDemo ld2 = new ListDemo();
//		ListDemo ld3 = new ListDemo();
//		ListDemo ld4 = new ListDemo();
//		ListDemo ld5 = new ListDemo();
//		// Name-- String
		ArrayList<Object> al = new ArrayList<Object>();

		al.add(10);
		al.add(20);
		al.add(20);
		al.add(20);

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("50");
		al1.add("70");

		// al.addAll(al1);//[50, 70, 80, 90, 10, 20, 30, 40]
	//	al.addAll(1, al1);//

		System.out.println(al);
//		al1.removeAll(al);
//		System.out.println("After removing collection al - "+al1);
//		
//		
//		
//		//count the elmns
//		System.out.println(al.size());//6
//		//to access the list element
//		System.out.println(al.get(3));
//		//to remove the elm
//		al.remove(2);
//		
//		System.out.println(al);
		
		
		//ArrayList<Integer> al = new ArrayList<Integer>();//classA
//		 ArrayList<Object> al = new ArrayList<Object>();
//		 al.add(ld1);
//		 al.add(ld2);
//		 al.add(ld3);
//		 al.add(ld4);

	}
}
