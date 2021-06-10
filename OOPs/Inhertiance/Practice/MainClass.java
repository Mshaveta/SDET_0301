package OOPs.Inhertiance.Practice;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Browser:-");
		String browser = scn.next();
		System.out.println("Enter Url:-");
		String appUrl = scn.next();

		AboutUs au = new AboutUs(appUrl, browser);
		System.out.println(Page.url);
		System.out.println(au.browser);
		String auPageheading = au.aboutpageDetails();
		System.out.println("page heading- " + auPageheading);

//		HomePage hp = new HomePage();
//		System.out.println(hp.slider);
//		hp.pageHeader();
//		hp.homeContent();
//		hp.pageFooter();

	}

}
