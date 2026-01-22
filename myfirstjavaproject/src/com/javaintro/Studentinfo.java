<<<<<<< HEAD
package com.javaintro;
import java.util.Scanner;
public class Studentinfo {
	 String Studentfname()
	{
		
		Scanner s =new Scanner(System.in);
		String fname =s.next();
		return fname;
	}
	 String Studentlname()
		{
			//System.out.println("Enter your last name:");
			Scanner s =new Scanner(System.in);
			String lname =s.next();
			return lname;
		}
	 long Studentno()
	 {
		 Scanner s = new Scanner(System.in);
		 long phone=s.nextLong();
		 return phone;
	 }
	  int Studentid()
	 {
		 Scanner s = new Scanner(System.in);
		 int id=s.nextInt();
		 return id;
	 }
	public static void main(String[] args) 
	{
		Studentinfo sc =new Studentinfo();
		System.out.println("Enter your id:");
		int id=sc.Studentid();
		System.out.println("Enter your firts name:");
		String fname=sc.Studentfname();
		System.out.println("Enter your last name:");
		String lname=sc.Studentlname();
		System.out.println("Enter your mobile no:");
		long phone=sc.Studentno();
		System.out.println("Student id is:"+id);
		System.out.println("Student first name is:"+fname);
		System.out.println("Student last  name is:"+lname);
		System.out.println("Student full name is :"+(fname+" "+lname));
		System.out.println("Student phone is:"+phone);

	}

}
=======
package com.javaintro;
import java.util.Scanner;
public class Studentinfo {
	 String Studentfname()
	{
		
		Scanner s =new Scanner(System.in);
		String fname =s.next();
		return fname;
	}
	 String Studentlname()
		{
			//System.out.println("Enter your last name:");
			Scanner s =new Scanner(System.in);
			String lname =s.next();
			return lname;
		}
	 long Studentno()
	 {
		 Scanner s = new Scanner(System.in);
		 long phone=s.nextLong();
		 return phone;
	 }
	  int Studentid()
	 {
		 Scanner s = new Scanner(System.in);
		 int id=s.nextInt();
		 return id;
	 }
	public static void main(String[] args) 
	{
		Studentinfo sc =new Studentinfo();
		System.out.println("Enter your id:");
		int id=sc.Studentid();
		System.out.println("Enter your firts name:");
		String fname=sc.Studentfname();
		System.out.println("Enter your last name:");
		String lname=sc.Studentlname();
		System.out.println("Enter your mobile no:");
		long phone=sc.Studentno();
		System.out.println("Student id is:"+id);
		System.out.println("Student first name is:"+fname);
		System.out.println("Student last  name is:"+lname);
		System.out.println("Student full name is :"+(fname+" "+lname));
		System.out.println("Student phone is:"+phone);

	}

}
>>>>>>> branch 'master' of https://github.com/alagandulaniteesh/corejava-niteesh
