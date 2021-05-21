package StringDemos;

import java.util.Arrays;

/**
 * 1. Length of Strings 
 * 2. Convert the string into lowercase 3. Convert both the
 * strings into Array 4. Sort the arrays
 *
 */
public class Anagram {

	public static void main(String[] args) {
		String str1 = "Silent";
		String str2 = "Listan";

		// Step1
		int stlen1 = str1.length();//6
		int stlen2 = str2.length();//6
		
		if (stlen1 == stlen2) { //6==6
			// Step2
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();

			// Step3:
			char[] chArr1 = str1.toCharArray();// ['s','i','l','e','n','t']
			char[] chArr2 = str2.toCharArray();// ['l','i','s','t','e','n']

			
			// Step4:
			Arrays.sort(chArr1); // [e, i, l, n, s, t]
			Arrays.sort(chArr2);// [a, i, l, n, s, t]
			System.out.println(Arrays.toString(chArr1));
			System.out.println(Arrays.toString(chArr2));
			
			//int count=0;
			boolean flag=false;
			// step4:
			for (int i = 0; i < chArr1.length; i++) {
				if (chArr1[i] != chArr2[i]) {// e-e
					// count=1;
					flag = true;
					break;
				}

				if (flag) {
					System.out.println("Not an Anagram");
				} else {
					System.out.println("An Anagram");
				}
			}

			if(flag) {
				System.out.println("Not an Anagram");
			}else {
				System.out.println("An Anagram");
			}
			
			

		} else {
			System.out.println("Length should be same!");
		}
	}

}
