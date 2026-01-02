package constructors;

public class ConstructorsTestdemo1 {
	int id;
	String name;
	int age;
	int marks;
	String clg;

	ConstructorsTestdemo1() {
		System.out.println("no arg constructor called");
		id = 1;
		name = "niteesh";
		age = 21;
		marks = 100;
		clg = "v cube";
	}

	ConstructorsTestdemo1(int id) {
		this();
		System.out.println("one arg constructor called");
		this.id = id;
	}

	ConstructorsTestdemo1(int id, String name) {
		this();
		System.out.println("two arg constructor called");
		this.id = id;
		this.name = name;

	}

	ConstructorsTestdemo1(int id, String name, int age) {
		this();
		System.out.println("Three arg constructor called");
		this.id = id;
		this.name = name;
		this.age = age;
	}

	ConstructorsTestdemo1(int id, String name, int age, int marks) {
		this();
		System.out.println("four arg constructor called");
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	ConstructorsTestdemo1(int id, String name, int age, int marks, String clg) {
		this();
		System.out.println("five arg constructor called");
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.clg = clg;
	}

	public static void main(String[] args) {
		ConstructorsTestdemo1 t1 = new ConstructorsTestdemo1();
		ConstructorsTestdemo1 t2 = new ConstructorsTestdemo1(2);
		ConstructorsTestdemo1 t3 = new ConstructorsTestdemo1(3, "David");
		ConstructorsTestdemo1 t4 = new ConstructorsTestdemo1(4, "Paul", 19);
		ConstructorsTestdemo1 t5 = new ConstructorsTestdemo1(5, "Mark", 27, 67);
		ConstructorsTestdemo1 t6 = new ConstructorsTestdemo1(6, "", 26, 46, "jyothismathi");
		System.out.println("*********************************");
		System.out.println("Main method started");
		t1.display();
		System.out.println("one arg constructor called");
		t2.display();
		System.out.println("two arg constructor called");
		t3.display();
		System.out.println("three arg constructor called");
		t4.display();
		System.out.println("four arg constructor called");
		t5.display();
		System.out.println("five arg constructor called");
		t6.display();
		System.out.println("Main method ended");

	}

	void display() {
		System.out.println("*********************************");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("marks: " + marks);
		System.out.println("clg: " + clg);
		System.out.println("*********************************");
	}

}
