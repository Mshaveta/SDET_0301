package StringDemos;

public class DuplicateChrDemo {

	public static void main(String[] args) {
		
//		String s="test";
//		System.out.println(s.indexOf('z'));

		String input = "jaavaa";

		String newStr = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);// char 'j'
			String chr=""+ch;//"j"
			//String chr = String.valueOf(input.charAt(i));// String "j"
			if (!newStr.contains(chr)) {
				newStr += chr;
			}
		}

		System.out.println("New String - " + newStr);
		System.out.println("-------------way2--------");

		String str = "jaavaa";
		 
		String newStr1 = "";//ja
		//[]

		for (int i = 0; i < str.length(); i++) {
			//i=0---j
			char ch = str.charAt(i);//i=0---j,i=1=a,i=2=a//
 			 
			if (newStr1.indexOf(ch) == -1) {// 1 ==-1
				newStr1 =newStr1+ ch;//jav
			}
		}
		System.out.println("New String----" + newStr1);

	}

}
