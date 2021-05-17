package StringDemos;

import java.util.Arrays;

public class StringBasics {

	 
	public static void main(String[] args) {
		String s1 = "Testing"; //
		String s2 = "Automation";

		s1 = s1.concat(s2);// TestingAutomation
		System.out.println(s1);
		
		//methods
		String s3 = "a bc";//0
		System.out.println(s3.length());
		
		//convert string into array- return type is char[]
		String s4 = "tool";
		char[] chArr = s4.toCharArray();
		System.out.println(Arrays.toString(chArr) +" "+chArr.length);
		
		for( char ch : chArr) {
			System.out.println(ch);
		}
		
		// to get the character at certain index number
		System.out.println("---------");
		char ch = s4.charAt(2);
		System.out.println(ch);
		
		String s5 = "PROCESS";
		s5 = s5.toLowerCase();//process
		System.out.println(s5);//PROCESS
		
		//Split() -  convert the string into array-STring[] arr
		
		String str = "Selenium Tetsing tool";
		String[] strArr = str.split("@");
		System.out.println(Arrays.toString(strArr)+" "+strArr.length);
		
		char[] chArr1  = str.toCharArray();
		System.out.println(Arrays.toString(chArr1)+" "+chArr1.length);
		
		
		String testData = "name###test@gmail.com###1234";
		String[] testDataArr = testData.split("###");
		System.out.println(Arrays.toString(testDataArr));
		System.out.println(testDataArr[1] + "- "+testDataArr[0]);
		
		String date = "12#03@2021-342424";//0-12,1-03/2021
		
		String[] dateArr = date.split("#|@|-");//?? spcl. chrs
		System.out.println(Arrays.toString(dateArr));
		
		//replace
		String str1 = "testing";
		str1 = str1.replace('t', 'p');
		System.out.println(str1);
		
		String str2 = "testingtool";
//		str2  = str2.substring(3);//index number 
//		System.out.println(str2);
//		
		str2  = str2.substring(0, 4);//0-3
		System.out.println(str2);
		
		System.out.println("=========================");
		
		String st1 = "Test";//Literal way - - SCP - 1object - m/m1
		String st2 = "test";//Literal Way - SCP -  1 object-m/m2
//		if(st1 == st2) { //m/m1 == m/m1
//			System.out.println("matched!");
//		}else {
//			System.out.println("Not Matched!");
//		}
		
		if(st1.equals(st2)) { //m/m1 == m/m1
			System.out.println("matched!");
		}else {
			System.out.println("Not Matched!");
		}
		
		 
		
		//new 
		String stObj1 =  new String("TestObject"); //Heap M/m  -- 2 Object | 
		String stObj2 =  new String("TestObject");
		 
		if(st1 == st2) {//m/m1 == m/m2
			System.out.println("matched!");
		}else {
			System.out.println("Not Matched!");//
		}
		
		if(stObj1.equals(stObj2)) {//m/m1 == m/m2
			System.out.println("matched!");
		}else {
			System.out.println("Not Matched!");//
		}
		
		
		System.out.println("----------------------");
		String expTitle = "facebook";
		String actTitle = "Facebook";
		if(expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Matched!");
		}else {
			System.out.println("NOt Matched !");
		}
		
		

	}

}
