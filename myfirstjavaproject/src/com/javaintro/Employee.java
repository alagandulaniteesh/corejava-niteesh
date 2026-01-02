package com.javaintro;

public class Employee {
		int empid=1;
		String empname="niteesh";
		double salary=49540;
		{
			double d=salary+(salary/10);
			System.out.println("Employee id: "+empid);
			System.out.println("Employee name: "+empname);
			System.out.println("Employee salary: "+d);
		}
	public static void main(String[] args) {
		Employee e1= new Employee();

	}

}
