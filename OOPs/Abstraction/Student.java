package OOPs.Abstraction;

public  class Student extends PersonAbstract {
	int marks;

	public void grade() {
		System.out.println("Grade");
	}

	public void details() {
		 taxCal();
		 name="Tester";
		 marks=10;
		 age=20;
		
	}
	public static void main(String[] args) {
		Student st = new Student();
		st.details();
		st.grade();
		st.age=100;
	}
}
