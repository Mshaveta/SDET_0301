package StringDemos;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Builder");//StringBuilder
		StringBuilder sb1 = new StringBuilder("Builder");
		sb.append(sb1);
		System.out.println(sb);
		
		if(sb==sb1) {//compares the m/m addr.
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		if(sb.equals(sb1)) {////compares the m/m addr.
			System.out.println("Yes equal");
		}else {
			System.out.println("NO equal");
		}

	}

}
