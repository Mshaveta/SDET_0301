package OOPs.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomObjects {

	public static void main(String[] args) {
		//Non generic
//		Student s1 = new Student(100);
//		Student s2 = new Student(200);
//		Student s3 = new Student(300);
//		Student s4 = new Student(400);
//
//		ArrayList<Student> al = new ArrayList<Student>();
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//		al.add(s4);
//
//		Iterator<Student> itr = al.iterator();
//		while (itr.hasNext()) {
//			Student st = itr.next();
//			System.out.println(st.printId());
//
//		}
		
		//Generic
		Student s1 = new Student(100);
		Student s2 = new Student(200);
		Student s3 = new Student(300);
		Student s4 = new Student(400);

		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.printId());

		}
	}

}
