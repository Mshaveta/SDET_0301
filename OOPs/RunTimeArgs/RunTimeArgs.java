package OOPs.RunTimeArgs;

import java.util.Arrays;

public class RunTimeArgs {
	
	 
	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		System.out.println(args[0]+args[1]+args[2]+args[3]);
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		int a = Integer.parseInt(args[3]);
		
		System.out.println(a+y+z+a);

	}

}
