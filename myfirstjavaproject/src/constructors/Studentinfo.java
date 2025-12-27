package constructors;

public class Studentinfo {
	int sid;
	String sname;
	String branch;
	Studentinfo(int sid,String sname,String branch){
		this.sid=sid;
		this.sname=sname;
		this.branch=branch;
	} 
	
	
	public Studentinfo(Studentinfo s1) {
		this.sid=s1.sid+1;
		this.sname=s1.sname;
		this.branch=s1.branch;
	}


	public static void main(String[] args) {
		Studentinfo s1 = new Studentinfo(101,"Niteesh","cse");
		s1.display();
		Studentinfo s2 = new Studentinfo(s1);
		s2.display();
		

	}
	void display() {
		System.out.println("************************");
		System.out.println("Student Id: "+sid);
		System.out.println("Student Name: "+sname);
		System.out.println("Student Branch: "+branch);
		System.out.println("************************");
	}

}
