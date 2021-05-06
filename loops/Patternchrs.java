package SDET_0301;

public class Patternchrs {

	public static void main(String[] args) {
		int n=5;
		char ch='a';//b
		for(int i=1;i<=n;i++) {
			 /////////////////////
			for (int j = 1; j <= (n + 1) - i; j++) {
				///////////col ARea
				 System.out.print(ch);
				 ch++;
			}
			/////////////
			System.out.println();
		}
	}
}
