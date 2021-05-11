package Loops;

public class RevNumber {

	public static void main(String[] args) {
//		int num=2356;//2356-->235
//		int rem=0;//6
//		int rev=0;//65
//		
//		int i=1;
//		while(num>0) {//2356>0-true
//			 
//			
//			rem = num%10;// 235 %10 =5
//			rev = rev*10 + rem;//6*10 + 5=65
//			num = num/10;//2356/10 = 235
//			System.out.println(i+" - value of rem var is -"+rem);
//			System.out.println(i+" - value of rev var is -"+rev);
//			System.out.println(i+" - value of num var is -"+num);
//			System.out.println("----------------------------------");
//			i++;
//		}
//		
//		
//		System.out.println("Rev of a number - "+rev );
		
		
		int num=121;//2356-->235
		int rem=0;//6
		int rev=0;//65
		
		int temp = num;//2356
		while(num>0) {//2356>0-true
			 
			
			rem = num%10;// 235 %10 =5
			rev = rev*10 + rem;//6*10 + 5=65
			num = num/10;//2356/10 = 235
			 
			 
		}
		
		//rev=
		if(temp==rev) {
			System.out.println("Yes, Pallindrom!"+temp);
		}else {
			System.out.println("NO");
		}
		
		
	 

	}

}
