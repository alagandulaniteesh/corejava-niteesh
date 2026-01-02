package inheritance;
//✅ Question 2: Access Parent Variables
//Create a parent class Person with a variable
//name = "Ravi"
//Create a child class Student that extends Person and
//prints the name using a Student object.
class Parent{
	String name="Ravi";
}
class Child extends Parent{
	
}
public class Examplechatgpt2 {

	public static void main(String[] args) {
		Child	 s = new Child();
			System.out.println(s.name);

	}

}
