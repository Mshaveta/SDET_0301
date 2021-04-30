package SDET_0301;
public class NestedStatements {

	public static void main(String[] args) {
		 /*Nested */
		//Syntax:
		int a=100;
		int b=150;
		int c=180;
		
		if(a>b) { //100>150
			
			if(a>c) {//100>80
				System.out.println("a is largest");//S2
			}else {
				System.out.println("c is largest");
			}
			
			 
		}else {//
			
			if(b>c) {//150 >80--false
				System.out.println("b is largest");//2
			}else {
				System.out.println("c is largest");
			}
			
			
		}

	}

}
