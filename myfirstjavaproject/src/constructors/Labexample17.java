package constructors;
public class Labexample17{
	int empid;
	String name;
	double salary;
	static String companyname="TECH SOFT PVT LTD";
	Labexample17(int empid,String name,double salary){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		show();
	} 


public Labexample17(Labexample17 e1,double salary) {
	this.empid=e1.empid+1;
	this.name=e1.name;
	this.salary=salary;
	show();
}



	public static void main(String[] args) {
		Labexample17 e1= new Labexample17(101,"Niteesh",20000);
		Labexample17 e2 =new Labexample17(e1,567888.00);
	
	}
	void show() {
		System.out.println("EMPID: "+empid);
		System.out.println("NAME: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("EMPID: "+companyname);
		System.out.println("****************************");
	}

}
