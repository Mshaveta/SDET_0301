package OOPs.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * collection extends iterable
 * Set Interface extends Collection:
 *: Set : that can't store duplicate elments
 *its insertion order is also not preserved.
 * Set follows hashing technique
 * 
 *  - HashSet implements Set 
 *  - LinkedHashSet implmenets Set
 *
 */
public class HashSetDemo {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(100);
		set.add(500);
		set.add(200);
		set.add(400);
		set.add(50);
		set.add(120);
		set.add(40);
		 
		set.add(null);
		 
		
		set.add(230);
	//	set.remove(40);
//		System.out.println(set);
//		
//		Object[] arr = set.toArray();
//		System.out.println(arr[0]);
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();//null
			if(obj==null) {
				itr.remove();
				continue;
			}
			 int x  =  (int) obj;
			if(x==100 || x==50) {
				itr.remove();
			}
			 
			 
		}
		
		System.out.println(set);

	}

}
