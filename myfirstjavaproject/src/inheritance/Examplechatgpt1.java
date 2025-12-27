package inheritance;

//Question:
//Create a parent class Vehicle with a method start().
//Create a child class Car that extends Vehicle.
//Call start() using a Car object.
class Vehicle {
	void start() {
		System.out.println("Vehicle Started");
	}
}

class Car extends Vehicle {

}

public class Examplechatgpt1 {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.start();
	}

}
