package OOPs.Inhertiance.Blocks;

/*
 * Static, Non Static, Const
 */
public class BlocksDemoChild extends BlocksDemo {
	// static Block
	static {
		System.out.println("Static Block - child");
	}

//	//non static Block
	{
		System.out.println("Non static Block - child ");
	}

	public BlocksDemoChild() {
		//
		System.out.println("Const. - Child");
	}

	public static void main(String[] args) {
		BlocksDemoChild bd = new BlocksDemoChild();//

	}
}
