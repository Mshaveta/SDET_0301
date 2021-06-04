package OOPs.ThisKeyword;
/*
 *   this refers to the current object of current class
 *   we can't use this keyword in static area
 *   this usage:
 *   variables
 *   methods
 *   const.
 *   pass thias as parameter
 *   return this in a amethod
 * */

public class ThisKeyword {
	
	public void nsm() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		System.out.println(tk);//OOPs.ThisKeyword.ThisKeyword@15db9742
		//System.out.println(this);
		
		tk.nsm();//OOPs.ThisKeyword.ThisKeyword@15db9742
		
		ThisKeyword tk1 = new ThisKeyword();
		System.out.println(tk1);//
		tk1.nsm();//

	}

}
