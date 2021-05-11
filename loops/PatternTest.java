package Loops;

public class PatternTest {

	public static void main(String[] args) {
	int n=7;
	int h = (n+1)/2;//4
	int space=0,star=0;
	for(int i=1;i<=n;i++) {
		
		//
		int num=i;
		if(i<=h) {//1<=4-true
			//upper part
			space = h-i; // 3-3=0
			star=2*i-1;//2*3-1=5
		}else {
			//lower part
			space++;//0-->1
			star-=2;//5-2=3
		}
		//space=2
		//star=1
		
		//spaces
		for(int sp=1;sp<=space; sp++) {//sp=1,1<=0
			System.out.print("-");
		}
		
		
		//digits
		for(int st=1;st<=star; st++) {
			System.out.print(num);
			num++;
		}
		
		//
		System.out.println();
	}

	}

}
