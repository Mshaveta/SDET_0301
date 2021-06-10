package OOPs.Inhertiance.Practice;

public class AboutUs extends Page {
	String apHeading = "About Us";

	public AboutUs(String url, String browser) {
		super(url, browser);
	}

	private void aboutContent() {
		System.out.println("About Content");
	}

	public String aboutpageDetails() {
		 
		pageHeader();
		aboutContent();
		pageFooter();
		return apHeading;

	}

}
