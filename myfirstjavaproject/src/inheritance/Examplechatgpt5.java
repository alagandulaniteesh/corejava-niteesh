package inheritance;

class Collegename {
	String collegename;

	Collegename(String collegename) {
		System.out.println();
		System.out.println("Collegename: " + collegename);
	}
}

class Stud extends Collegename {
	Stud() {
		super("JNTUH");

	}
}

public class Examplechatgpt5 {

	public static void main(String[] args) {
		Stud s1 = new Stud();

	}

}
