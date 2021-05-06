package SDET_0301.LoopDemos;

public class Letterpattern {

	public static void main(String[] args) {
		 int n=5;

		 //char ch = 'a';
		for (int i = 1; i <= n; i++) {
			char ch = 'a';

			for (int j = 1; j <= n; j++) {

				System.out.print( ch+ " ");// 2
				 
				ch++;
			}
			 

			System.out.println();
		}

	}

}
