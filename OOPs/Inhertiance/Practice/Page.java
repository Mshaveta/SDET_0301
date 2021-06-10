package OOPs.Inhertiance.Practice;

/*
 * //Parent class
Class Page(){
url:-var
browserName:-var
Header()
Footer()
}

//child class1
Class AboutPage extends page{
pageTitle; --->var

aboutContent(){
}
}

child class2 of Page Class
Class HomePage extends page{
homeSlider;
homeContent(){
}
}
-----------------------------------------
Classs Main
{
main(){
}
}
 */
public class Page {
	static String url;
	String browser;

	public Page(String url , String browser) {
		Page.url = url;
		this.browser=browser;
		
	}
	public void pageHeader() {
		System.out.println("Page Header");
	}

	public void pageFooter() {
		System.out.println("Page Footer");

	}
}
