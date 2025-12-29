package com.operators;

import java.util.Scanner;

public class CaseStudy4_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR SALARY: ");
		double salary = sc.nextDouble();
		System.out.println("ENTER THE BONUS AMOUNT: ");
		double bonus = sc.nextDouble();
		System.out.println("ENTER THE DEDUCTION AMOUNT: ");
		// ARITHMETIC OPERATORS
		double deduction = sc.nextDouble();
		double grossSalary = salary + bonus;// arithmetic "+" operator
		double netSalary = grossSalary - deduction;// arithmetic "-" operator
		System.out.println("GROSS SALARY: " + grossSalary);
		System.out.println("NET SALARY: " + netSalary);
		// RELATIONAL OPERATORS
		System.out.println("ENTER THE NO OF YEARS OF EXPERIENCE");
		int experience = sc.nextInt();
		if (experience >= 3) {// relational ">" operator
			System.out.println("EMPLOYEE HAS MORE THEN THAN 3 YEARS OF EXPERIENCE");
		} else {
			System.out.println("EMPLOYEE HAS LESS 3 YEARS OF EXPERIENCE");
		}
		if (netSalary >= 30000) {
			System.out.println("EMPLOYEE NET SALARY IS MORE THAN 30000");
		} else {
			System.out.println("EMPLOYEE NET SALARY IS LESS THAN 30000");
		}
		// LOGICAL OPERATORS
		System.out.println("ARE YOU A PERMANENT ?");
		String stay = sc.next();
		System.out.println("PERMANENT AND MORE THAN 3 YEARS EXPERIENCE: " + (stay.equals("yes") && experience > 3));
		
		System.out.println("PERMANENT OR MORE THAN 5 YEARS EXPERIENCE: " + (stay.equals("yes") || experience > 5));

		// ASSIGNMENT OPERATORS
		bonus += 1000; // compound assignment operator
		System.out.println("BONUS OF THE EMPLOYEE IS: " + bonus);
		// UNARY OPERATORS
		++experience;// pre increment operator ++x
		System.out.println("EXPERIENCE OF THE EMPLOYEE IS: " + experience);
		// TERNARY OPERATORS
		String eligible;
		eligible = (netSalary >= 30000) ? "ELIGIBLE" : "NOT ELIGIBLE";// ternary operator(condition)?:
		System.out.println(eligible);
		sc.close();
	}

}
