package SDET_0301;
public class DbConnection {

	public static void main(String[] args) {
	 int hostName=100;//not set any value
	 int username=0;
	 int password=10;
	 int dbName=0;
	 
	 
	 
	 if(hostName!=0 && username!=0 && password!=0 && dbName!=0) {
		 System.out.println("DB Connection Establish!");
	 }else {//4 conditions
//		  if(hostName==0) {
//			  System.out.println("Some issue with Hotname");
//		  }
//		  
//		  if(username==0) {
//			  System.out.println("Some issue with username");
//		  }
//		  
//		  if(password==0) {
//			  System.out.println("Some issue with password");
//		  }
//		  
//		  if(dbName==0) {
//			  System.out.println("Some issue with dbName");
//		  }
		  
		  //day=1---days of week
		  
		  if(hostName==0) {
			  System.out.println("Some issue with Hotname");
		  }else if(username==0) {
			  System.out.println("Some issue with username");
		  }else if(password==0) {
			  System.out.println("Some issue with password");
		  }else if(dbName==0) {
			  System.out.println("Some issue with dbName");
		  }
	 }
	 
	 }

}
