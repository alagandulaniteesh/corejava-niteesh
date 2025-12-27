package com.operators;

import java.util.Scanner;

public class LabExample25_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your attendence percentage");
		int attendence = sc.nextInt();
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		System.out.println("ATTENDENCE: " + attendence);
		System.out.println("MARKS: " + marks);
		if (attendence >= 75 && marks >= 60) {
			System.out.println("Eligible for Scholarship");

		} else {
			System.out.println("Not Eligible for Scholarship");
		}
		sc.close();
	}

}
