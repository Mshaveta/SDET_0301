package SDET_0301.LoopDemos;

public class PranavPattern {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			int num = i;
			for (int j = 1; j <= n; j++) {

				if (j <= i) { //1<=1
					 
					System.out.print(num);//1
					num--;//0
				} else {
					num+=2;//num=num+2;
					System.out.print(num);//0

					 
					num--;
					 
				}
			}
			System.out.println();
		}

//		String string1 = "failure is just practice for success";
//		String string2 = "is practice";
//		char[] charArray1 = string1.toCharArray();
//		char[] charArray2 = string2.toCharArray();
//		boolean foundspace = true;
//		for (int i = 0; i < charArray1.length; i++) {
//
//			if (Character.isLetter(charArray1[i])) {
//				if (foundspace) {
//					if (charArray1[i] != charArray2[i] && charArray1[i] != 'p') {
//						charArray1[i] = Character.toUpperCase(charArray1[i]);
//						foundspace = false;
//
//					} else {
//						charArray1[i] = Character.toLowerCase(charArray1[i]);
//						foundspace = false;
//					}
//				}
//			} else {
//				foundspace = true;
//			}
//		}
//
//		string1 = String.valueOf(charArray1);
//		System.out.println(string1);

//		String string1 = "selenium is an automation tool";
//		String string2 = "selenium tool";
//		String[] charArray1 = string1.split(" ");
//		String[] charArray2 = string2.split(" ");
//		String newStr = "";
//		boolean flag = false;
//		for (int i = 0; i < charArray1.length; i++) {
//			for (int j = 0; j < charArray2.length; j++) {
//				if (charArray1[i].equals(charArray2[j])) {
//					flag = true;
//				}
//			}
//
//			if (flag) {
//				newStr += charArray1[i];
//			} else {
//				 newStr += charArray1[i].substring(0, 1).toUpperCase() + charArray1[i].substring(1);
//			}
//
//			newStr += " ";
//			flag = false;
//		}
//		System.out.println(newStr);

	}

}
