<<<<<<< HEAD
package constructors;

class Address {
	String city;
	String state;

	Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	Address(Address a) {
		this.city = a.city;
		this.state = a.state;
	}

}

class Employee {
	int id;
	String name;
	Address address;

	Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address.city);
		System.out.println(address.state);
	}

	Employee(Employee emp2) {
		this.id = emp2.id;
		this.address = new Address(address);
		
	}
}

public class CaseStudyQuestion3 {

	public static void main(String[] args) {
		Address addr = new Address("karimnagar", "Telangana");
		Employee emp = new Employee(1, "Niteesh", addr);
		Employee emp1 = new Employee(2, "kumar", addr);
		emp1.address.city = "HYDERABAD";
		emp.show();
		emp1.address.city = "kphb";
		emp1.show();

	}

}
=======
package constructors;

class Address {
	String city;
	String state;

	Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	Address(Address a) {
		this.city = a.city;
		this.state = a.state;
	}

}

class Employee {
	int id;
	String name;
	Address address;

	Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address.city);
		System.out.println(address.state);
	}

	Employee(Employee emp2) {
		this.id = emp2.id;
		this.address = new Address(address);
		
	}
}

public class CaseStudyQuestion3 {

	public static void main(String[] args) {
		Address addr = new Address("karimnagar", "Telangana");
		Employee emp = new Employee(1, "Niteesh", addr);
		Employee emp1 = new Employee(2, "kumar", addr);
		emp1.address.city = "HYDERABAD";
		emp.show();
		emp1.address.city = "kphb";
		emp1.show();

	}

}
>>>>>>> branch 'master' of https://github.com/alagandulaniteesh/corejava-niteesh
