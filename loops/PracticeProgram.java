package SDET_0301.LoopDemos;

public class PracticeProgram {

	public static void main(String[] args) {
		int b=1;
		b++;//2
		++b;//3

		int i;// decalration
		for (i = 1; i < 10; i++) {
			//i=1,1<10,2->3,4->5
			//3<10
			//5<10
			System.out.println("Hello Java");//1 time,2,3,4,5
			//i++;//i=2,4
		}
		System.out.println("value of i" + i);//11

	}

}
