package ArraysDemos;

import java.util.Arrays;

public class ForEachDemo {

	public static void main(String[] args) {
		//array decl.
		int[] marks = new int[5]; // 0-4---count=5
		
		System.out.println(Arrays.toString(marks));//testing checking purpose

		int count = marks.length;//10
		System.out.println(count);

		//way1: 
		for (int i = 0; i < count; i++) {//0-9

			marks[i] = (i+1)*10;//marks[0]=0+1
			//marks[1] = 1+1=2
			// to prin the elm of an array
			System.out.println(marks[i]);
			 
		}
//		
//		System.out.println(Arrays.toString(marks));
		System.out.println("---------For Each Loop----");
		//For Each Demo-- to print the elmns of an array
		for( int val : marks) {
			System.out.println(val);
		}
		

	}

}
