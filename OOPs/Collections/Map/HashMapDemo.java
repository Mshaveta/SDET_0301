package OOPs.Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map: stores the elmets/ objs in the form of key-value pair, called entry
 * collection of entries is known as EntrySet
 * Map can allow one null key and multiple null values
 * its insertion order is not preserved.
 * 
 * HASHtABLE -- it doesn't allowed null as key or value
 */
public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,Integer>map = new HashMap<Integer,Integer>();
		map.put(1,100); //entry
		map.put(4,4500);
		map.put(5,500);
		map.put(2,2500);
		map.put(3,5300);
		 
		
		
		//way1: for Non generic Map collection
//		Set st = map.entrySet();
//		 
////		Iterator itr = st.iterator();
////		while(itr.hasNext()) {
////			System.out.println(itr.next());
////			
////		}
//	
//		Iterator itr = st.iterator();
//		while(itr.hasNext()) {			 
//			 Map.Entry me =(Map.Entry)itr.next();
//			 System.out.println(me.getKey());
//			 System.out.println(me.getValue());
//			
//		}
		
		//way2: Generic collection
		
		for(Map.Entry<Integer,Integer> me : map.entrySet()) {
			System.out.println(me.getKey() + " - " +me.getValue());
		}
		
		
	 
		 

	}

}
