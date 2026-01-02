package constructors;

public class ConstuctorsLab {
	int id;
	String name;
	int age;

	ConstuctorsLab() {
		this(2);
		System.out.println("********NO ARG CONSTRUCTOR CALLED*********");
		id = 1;
		name = "niteesh";
		age = 21;
		display();
	}

	ConstuctorsLab(int id) {
		this(3, "vasu");
		System.out.println("ONE ARG CALLED");
		this.id = id;
		display();
	}

	ConstuctorsLab(int id, String name) {
		this(4, "KING", 34);
		System.out.println("TWO ARG CALLED");
		this.id = id;
		this.name = name;
		display();
	}

	ConstuctorsLab(int id, String name, int age) {
		System.out.println("THREE ARG CALLED");
		this.id = id;
		this.name = name;
		this.age = age;
		display();
	}

	public static void main(String[] args) {

		System.out.println("MAIN METHOD STARTED");
		
		ConstuctorsLab std1 = new ConstuctorsLab();
		System.out.println("MAIN METHOD ENDED");

	}

	void display() {
		System.out.println("Student ID: " + id);
		System.out.println("Student NAME: " + name);
		System.out.println("Student AGE: " + age);
	}

}
