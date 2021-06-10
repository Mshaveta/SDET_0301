package OOPs.Inhertiance.Practice;

public class HomePage extends Page {
	public HomePage(String url, String browser) {
		super(url, browser);
		// TODO Auto-generated constructor stub
	}
	String slider="Image Slider";
	public void homeContent(){
		System.out.println("Home Content");
	}
}
