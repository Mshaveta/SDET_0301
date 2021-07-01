package OOPs.Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainDemo {
	public static void main(String[] args) {
		Student s1 = new Student("s1");
		Student s2 = new Student("s2");
		Student s3 = new Student("s3");
		
		Trainer t1 = new Trainer("t1");
		Trainer t2 = new Trainer("t2");
		Trainer t3 = new Trainer("t3");
		
		Map<Student,Trainer> map = new HashMap<Student,Trainer>();
		map.put(s1,t1);//s1 - key, t1- value
		map.put(s2,t2);
		map.put(s3,t3);
		
	///	System.out.println(map);
		 Scanner scn = new Scanner(System.in);
		for(Map.Entry<Student,Trainer> me : map.entrySet()) {
			Student sref = me.getKey();//s1,s2,s3
			Trainer tref = me.getValue();//t1,t2,t3
			
			
			System.out.println(sref.sName  + "===="+ tref.tName);
			System.out.println("---------------------");
				
			System.out.println("Enter Student Name:");
			sref.sName = scn.next();
			System.out.println("Enter trainer Name:");
			tref.tName = scn.next();
			
			 System.out.println("============");
			 System.out.println(sref.stu_details() + "===="+ tref.trainer_details());
			
			
		}
	}
}
