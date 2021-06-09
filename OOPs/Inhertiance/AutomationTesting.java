package OOPs.Inhertiance;
/*
 * class Child/ Sub extends Parent/Super/Base
 */
public class AutomationTesting extends ManualTesting  {
	String tool = "Selenium";
	

	public void regTestTool() {
		System.out.println("regTest using Tool in Automation");
	}
	public static void main(String[] args) {
		AutomationTesting at = new AutomationTesting();
		System.out.println(at.tool);
		System.out.println(at.process);
		at.functional();
		at.regTestTool();
		 
	}

}
