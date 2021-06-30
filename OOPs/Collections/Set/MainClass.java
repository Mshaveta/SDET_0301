package OOPs.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		CustomClassObjs obj1 = new CustomClassObjs();
		CustomClassObjs obj2 = new CustomClassObjs();
		CustomClassObjs obj3 = new CustomClassObjs();
		CustomClassObjs obj4 = new CustomClassObjs();
		CustomClassObjs obj5 = new CustomClassObjs();
		
		Set<CustomClassObjs> st = new HashSet<CustomClassObjs>();
		st.add(obj1);
		st.add(obj2);
		st.add(obj3);
		st.add(obj4);
		st.add(obj5);
		
		Iterator<CustomClassObjs> itr = st.iterator();
		int i=1;
		while(itr.hasNext()) {
			CustomClassObjs ref = itr.next();
			ref.a=i;
			System.out.println(ref.printVal());
			i++;
		}
	}

}
