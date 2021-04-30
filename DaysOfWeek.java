package SDET_0301;
import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 System.out.println("Please enter  any day number");
		 int day = scn.nextInt();//5
		 
		 ///switch 
		 if(day==1) {
			 System.out.println("Sun");//
		 }else if(day==2) {
			 System.out.println("MOn");
		 }else if(day==3) {
			 System.out.println("Tue");
		 }else if(day==4) {
			 System.out.println("Tue");
		 }else if(day==5) {
			 System.out.println("Tue");
		 }else if(day==6) {
			 System.out.println("Tue");
		 }else if(day==7) {
			 System.out.println("Tue");
		 }else {
			 System.out.println("not Found!");
		 }
		 
		 
		 
		 
//		 //way2:
//		 if(day==1 || day==2 || day==3 || day==4) {
//			 if(day==1) {
//				 System.out.println("Sun");
//			 }else if(){
//				  
//			 }
//		 
//		 }else {
//			 System.out.println("not Found!");
//		 }
	}

}
