package OOPs.ThisKeyword;

class A {
	int i;
	int j;
        A() {
            i = 1;
            j = 2;
        }
   }
   public class Output {
        public static void main(String args[])
        {
             A obj1 = new A();
             A obj2 = new A();
	     System.out.print(obj1.equals(obj2));
        }
   }

