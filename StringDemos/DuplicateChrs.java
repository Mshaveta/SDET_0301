package StringDemos;

public class DuplicateChrs {

	public static void main(String[] args) {
		String str = "jaava";
		// charAt
		// Array convert
		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {//j=1
				if (str.charAt(i) == str.charAt(j)) {// j==a
					 System.out.println(str.charAt(i)+" == "+str.charAt(j));
					str = str.replace(str.charAt(j), '0');
					 System.out.println(str);
					continue;
				}else {
					 System.out.println(str.charAt(i)+" == "+str.charAt(j));
						
					System.out.println("else");
				}
				 
			}
			System.out.println("--------------");
			
			if (str.charAt(i) != '0') {
				newStr+=str.charAt(i); 
				
			}
			//System.out.println(str);

		}
		
	

	}

}
