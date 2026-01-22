<<<<<<< HEAD
package com.javaintro;

public class ConstructorsIntro {
	int id;
	String name;
	ConstructorsIntro (int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		System.out.println(name+"Age: "+age);
	}
	public ConstructorsIntro() 
	{	
	this(18,"kohil",35);
	}
	public static void main(String[] args) {
		//System.out.println("Hello main method");
		System.out.println("**************************");
		System.out.println("PARAMETERIZED CONSTRUCTORS:-");
		ConstructorsIntro t = new ConstructorsIntro(7,"Dhoni",40);
		System.out.println(t.id);
		System.out.println(t.name);
		System.out.println("**************************");
		System.out.println("NO ARGUMENT CONSTRUCTORS");
		ConstructorsIntro t1 = new ConstructorsIntro();
		System.out.println(t1.id);
		System.out.println(t1.name);
		
	

	}

}
=======
package com.javaintro;

public class ConstructorsIntro {
	int id;
	String name;
	ConstructorsIntro (int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		System.out.println(name+"Age: "+age);
	}
	public ConstructorsIntro() 
	{	
	this(18,"kohil",35);
	}
	public static void main(String[] args) {
		//System.out.println("Hello main method");
		System.out.println("**************************");
		System.out.println("PARAMETERIZED CONSTRUCTORS:-");
		ConstructorsIntro t = new ConstructorsIntro(7,"Dhoni",40);
		System.out.println(t.id);
		System.out.println(t.name);
		System.out.println("**************************");
		System.out.println("NO ARGUMENT CONSTRUCTORS");
		ConstructorsIntro t1 = new ConstructorsIntro();
		System.out.println(t1.id);
		System.out.println(t1.name);
		
	

	}

}
>>>>>>> branch 'master' of https://github.com/alagandulaniteesh/corejava-niteesh
