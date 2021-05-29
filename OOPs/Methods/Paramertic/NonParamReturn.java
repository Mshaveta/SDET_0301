package OOPs.Methods.Paramertic;
/*
 *  obj as a parameter in method
1. nonparam , no return
public void m1(){
}

2. param, no return type
public void m1(int x){
}

3. noparam, return type
public int m1(){
return 10 ;
}

 */

public class NonParamReturn {
	 int n=900;
	public int m1() {
		int sum = 10 + 20;// 30
		return sum;// should be the last statement-30
	}
	
	public int[][] returnArray() {
		int[] arr = {12,3,4,5};
		
		int[][] arr1 = { {1,2} , {3,4} };
		return arr1;
	}
	
	public NonParamReturn returnObject() {
		NonParamReturn npr = new NonParamReturn();//obj2--n=900
		//int x = npr.n;//900
		return npr;
	}

	public static void main(String[] args) {
		NonParamReturn npr = new NonParamReturn();//obj1
		System.out.println(npr.n);//900
		
		NonParamReturn y = npr.returnObject();//obj2
		System.out.println(y);//900

		 

	}

}
