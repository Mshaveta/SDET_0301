package OOPs.Inhertiance.Blocks;

/*
 * Static, Non Static, Const
 * 
 *inheritance concept:
 *sdtatic:
 *
// Static Block-Parent 
// Static Block - child
 * 
 * non static-
 * parent class- ns block
 * child class- ns block
 * 
 * 
 * const
 * parent - ns block  and const
 * child - ns block and const
 * 
 * 
 * static, ns block and const - parent and child
 * 
 * parent - static block , child sttaic block
 * parent - nonstatic & const
 * child - non sttaic & const
 * 
 * Static Block-Parent 
   Static Block - child
   Non static Block-Parent
   Const.-Parent
   Non static Block - child 
   Const. - Child
 */
public class BlocksDemo {

	// static Block
	static {
		System.out.println("Static Block-Parent ");
	}

	// non static Block
	{
		System.out.println("Non static Block-Parent");
	}

	public BlocksDemo() {
		System.out.println("Const.-Parent");
	}
 
}
