package constructors;

public class Casestudy_2 {
	int empid;
	String empname;
	String dept;
	double sal;

	Casestudy_2() {
		empid = 1;
		empname = "Niteesh";// old employees details
		dept = "junior developer";
		sal = 100000.00;
	}

	Casestudy_2(int empid, String empname) {
		this();
		this.empid = empid;
		this.empname = empname;// here only the id and name of the employee is changed,
								// becasue the department and salary of the both employee are same.

	}

	Casestudy_2(int empid, String empname, String dept, double sal) {

		this.empid = empid;
		this.empname = empname;
		this.dept = dept;
		this.sal = sal;
	}

	public static void main(String[] args) {
		System.out.println("WELCOME TO THE COMPANY");
		System.out.println("EMPLOYEE DETAILS:-");
		Casestudy_2 emp = new Casestudy_2();
		Casestudy_2 emp1 = new Casestudy_2(2, "Nigama");
		Casestudy_2 emp2 = new Casestudy_2(3, "Siddharth", "trainee", 50000);
		emp.display();
		emp1.display();
		emp2.display();
	}

	void display() {
		System.out.println("********************************");
		System.out.println("EMPLOYEE ID:" + empid);
		System.out.println("EMPLOYEE NAME:" + empname);
		System.out.println("EMPLOYEE DEPARTMENT:" + dept);
		System.out.println("EMPLOYEE SALARY:" + sal);
		System.out.println("********************************");
	}

}
