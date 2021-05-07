package SDET_0301.LoopDemos;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the table no.-");
		int n = scn.nextInt();

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= n; col++) {
				if (row == 1 || row == n || col == 1 || col == n) {
					System.out.print("1 ");
				} else {
					System.out.print("- ");
				}

			}

			System.out.println();

		}

	}

}
