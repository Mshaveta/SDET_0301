package StringDemos;

public class PrintString {

	public static void main(String[] args) {
		String s1 = "Automation testing tool";
		//A
		//u
		//t
		//o
		
		//way1 : charAt()
		for(int i=0;i<s1.length();i++) {
			 char ch = s1.charAt(i);
			 System.out.println(ch);
			
		}
		
		System.out.println("----way2---");
		//way2 :  convert string into Array
		char[] chArr = s1.toCharArray();
		
		int count = chArr.length;
		
//		for(int j=0;j<count;j++) {
//			char ch = chArr[j];
//			System.out.println(ch);
//		}
		
		for( char val : chArr) {
			System.out.println(val);
		}
		
	}

}
