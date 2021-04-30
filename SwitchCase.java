package SDET_0301;
public class SwitchCase {

	public static void main(String[] args) {
		int d = 2;
		String msg = "";
		switch (d) {
		case 1:
			msg = "Sun";// s1
			break;
		case 2:
			msg = "mon";// 2
			break;
		case 3:
			msg = "tue";// s1
			break;
		case 4:
			msg = "wed";// s2
			break;
		case 5:
			msg = "thu";
			break;
		case 6:
			msg = "fri";
			break;
		case 7:
			msg = "sat";
			break;
		default:
			msg = "Wrong Day Number!";
		}

		System.out.println(msg);

		System.out.println("Exit");//

	}

}
