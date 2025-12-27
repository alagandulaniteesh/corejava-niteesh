package com.javaintro;

public class ConstructorsTestdemo1 {
	int id;
	String name;
	int marks;
	boolean pass;

	ConstructorsTestdemo1(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		pass = true;
	}

	ConstructorsTestdemo1() {
		this(2, "dhoni", 50);
	}

	public static void main(String[] args) {

		ConstructorsTestdemo1 t1 = new ConstructorsTestdemo1(1, "niteesh", 50);
		ConstructorsTestdemo1 t2 = new ConstructorsTestdemo1();
		System.out.println(t1.id);
		System.out.println(t1.name);
		System.out.println(t1.marks);
		System.out.println("***************");
		System.out.println(t2.id);
		System.out.println(t2.name);
		System.out.println(t2.marks);
	}

}
