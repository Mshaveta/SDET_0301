//AND-  username | password
		//(username or email)  AND (pwd OR DOB)
		//comparison opt.
		
		//OR
		/*true true =  true
		 * true false =  true
		 * false false =  false
		 * false true =  true
		 */
public class LadderElseIfORDemo {

	public static void main(String[] args) {
		
		 int a=100;
		 int b=200;
		 
		 if(a==b || a<b) { //100 == 200- false || 100<200- true
			 
			 
			 if(a==b) {
				 
			 }
			 if(a<b) {
				 
			 }
			 System.out.println("if part");//S1
		 }else if(a==b || a<b){ //100==200-false || 100<200- true
			 System.out.println("else if part");
		 }else {
			 System.out.println("Else part");
		 }

	}

}
