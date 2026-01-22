<<<<<<< HEAD
package inheritance;

class Marks {
	int marks;
	int id;
}

class Name extends Marks {
	String name;
	int age;

	Name() {
		System.out.println("name method called");
		marks = 50;
		id = 40;
		name = "niteesh";
	}

}

class Deatils extends Name {
	String address;
	long phno;

	Deatils() {
		System.out.println("deatils method called");
		address = "karimnagar";
		phno = 8143177599l;
		age = 21;
	}
}

public class Student {
	public static void main(String[] args) {
		System.out.println("main method started");
		Deatils n = new Deatils();
		System.out.println(n.id);
		System.out.println(n.marks);
		System.out.println(n.name);
		System.out.println(n.age);
		System.out.println(n.address);
		System.out.println(n.phno);
		System.out.println("main method ended");
	}

}
=======
package inheritance;

class Marks {
	int marks;
	int id;
}

class Name extends Marks {
	String name;
	int age;

	Name() {
		System.out.println("name method called");
		marks = 50;
		id = 40;
		name = "niteesh";
	}

}

class Deatils extends Name {
	String address;
	long phno;

	Deatils() {
		System.out.println("deatils method called");
		address = "karimnagar";
		phno = 8143177599l;
		age = 21;
	}
}

public class Student {
	public static void main(String[] args) {
		System.out.println("main method started");
		Deatils n = new Deatils();
		System.out.println(n.id);
		System.out.println(n.marks);
		System.out.println(n.name);
		System.out.println(n.age);
		System.out.println(n.address);
		System.out.println(n.phno);
		System.out.println("main method ended");
	}

}
>>>>>>> branch 'master' of https://github.com/alagandulaniteesh/corejava-niteesh
