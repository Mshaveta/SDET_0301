package StringDemos;

import java.util.Arrays;

public class ReplacewordWithStars {

	public static void main(String[] args) {
		String str = "Selenium is an automation tool";
		String trgtWrd = "is";
		String newStr="";
		//S1- Convert string to String type Array
		String[] strArr = str.split(" ");
		System.out.println(Arrays.toString(strArr));
		//[Selenium, is, an, automation, tool]
		
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].equals(trgtWrd)) {//Selenium--<is
				System.out.println("if - "+strArr[i]+"-----"+trgtWrd);
				int wordLen = trgtWrd.length();//2
				for(int j=0;j<wordLen;j++) {
					newStr+="*";//Selenium **
				}
			}else {
				newStr+=strArr[i];//Selenium
			}
			newStr+=" ";//Selenium ** an automation tool
		}
		System.out.println(newStr.trim());

	}

}
