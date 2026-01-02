package constructors;

class EmpDetails {
	int eid;
	String ename;
	long phone;

	EmpDetails(int eid, String ename, long phone) {
		this.eid = eid;
		this.ename = ename;
		this.phone = phone;
	}
}

class EmpAddress {
	String city;
	String state;

	EmpAddress(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
}

public class CaseStudy3 {
	public static void main(String[] args) {
		EmpDetails e1 = new EmpDetails(2,"NITEESH",9440077599l);
		EmpAddress e2 = new EmpAddress("karimnagar", "telangana");
		System.out.println("EMPLOYEE CITY: " + e2.city);
		System.out.println("EMPLOYEE STATE: " + e2.state);
		System.out.println("EMPLOYEE ID: " + e1.eid);
		System.out.println("EMPLOYEE NAME: " + e1.ename);
		System.out.println("EMPLOYEE PHONE NUMBER: " + e1.phone);

	}

	void show() {
		// System.out.println("EMPLOYEE ID: "+id);
		// System.out.println("EMPLOYEE NAME: ");
		// System.out.println("EMPLOYEE PHONE NUMBER: ");
		// System.out.println("EMPLOYEE CITY:"+city);
		// System.out.println("EMPLOYEE STATE: ");
	}

}
