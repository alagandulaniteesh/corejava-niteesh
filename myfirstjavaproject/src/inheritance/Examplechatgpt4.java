package inheritance;

class Salary {
	double sal = 30000;
}

class Bonus extends Salary {

	double bonus = 5000;

	void totalsal() {
		System.out.println("Total salary: " + (super.sal + bonus));
	}

}

public class Examplechatgpt4 {

	public static void main(String[] args) {
		Bonus b = new Bonus();
		b.totalsal();

	}

}
