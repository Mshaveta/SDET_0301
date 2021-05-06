package SDET_0301.LoopDemos;

public class NumberPattern {
	public static void main(String[] args) {
		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i ; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		int num=1;
		for(int i=1;i<=n;i++) {
			num=1;
			for(int j=1;j<=i ; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
		
	}
}
