package SDET_0301.LoopDemos;

public class VariableInloop {

	public static void main(String[] args) {
		int n = 5;
//		int num = 1;
//
//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= n; j++) {
//
//				System.out.print(num + " ");// 2
//				num++;
//
//			}
//			// row area
//
//			System.out.println();
//		}

		System.out.println("-----------------------------------");

		int num = 1;

		for (int i = 1; i <= n; i++) {
			num = i;

			for (int j = 1; j <= n; j++) {

				System.out.print(num + " ");// 2
				num++;

			}
			// row area

			System.out.println();
		}

	}

}
