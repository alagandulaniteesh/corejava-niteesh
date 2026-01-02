package inheritance;
class Bank{
	
	void interest() {
		System.out.println("Interest is 5 %");
	}
}
class Sbi extends Bank{
	void interest() {
		System.out.println("Interest is 7 %");
	}
}
public class Examplechatgpt6 {

	public static void main(String[] args) {
		Sbi s = new Sbi();
		s.interest();

	}

}
