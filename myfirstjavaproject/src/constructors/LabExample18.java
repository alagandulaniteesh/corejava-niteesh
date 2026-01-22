<<<<<<< HEAD
package constructors;
 class Vehicle{
	 String brand;
	 Vehicle(String brand){
		 this.brand=brand;
		 System.out.println("Vehicle Constructor Called");
		// System.out.println(brand);
	 }
 }
 class Car extends Vehicle{
	 int modelYear;
	 Car(String brand,int modelYear){
		 super(brand);
		 this.modelYear=modelYear;
		 this.brand=brand;
		 System.out.println("Car Constructor Called");
		 //System.out.println(brand);
		 //System.out.println(modelYear);
	 }
 }
 class ElectricCar extends Car{
	 ElectricCar(String brand,int modelYear){
		 super(brand,modelYear);
		 System.out.println("Electric Car Constructor Called");
	 }
 }

public class LabExample18 {

	public static void main(String[] args) {
		ElectricCar e1= new ElectricCar("kia",2019);
		System.out.println(e1.brand);
		 System.out.println(e1.modelYear);

	}

}
=======
package constructors;
 class Vehicle{
	 String brand;
	 Vehicle(String brand){
		 this.brand=brand;
		 System.out.println("Vehicle Constructor Called");
		// System.out.println(brand);
	 }
 }
 class Car extends Vehicle{
	 int modelYear;
	 Car(String brand,int modelYear){
		 super(brand);
		 this.modelYear=modelYear;
		 this.brand=brand;
		 System.out.println("Car Constructor Called");
		 //System.out.println(brand);
		 //System.out.println(modelYear);
	 }
 }
 class ElectricCar extends Car{
	 ElectricCar(String brand,int modelYear){
		 super(brand,modelYear);
		 System.out.println("Electric Car Constructor Called");
	 }
 }

public class LabExample18 {

	public static void main(String[] args) {
		ElectricCar e1= new ElectricCar("kia",2019);
		System.out.println(e1.brand);
		 System.out.println(e1.modelYear);

	}

}
>>>>>>> branch 'master' of https://github.com/alagandulaniteesh/corejava-niteesh
