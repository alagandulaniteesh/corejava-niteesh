package com.operators;

import java.util.Scanner;

public class LabExample_29 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER YOUR MARKS");
		int marks=sc.nextInt();
		String A;
		
		A=(marks>=90 && marks<=100)?"A":(marks>=80 && marks<=100)?"B":(marks>=70  && marks<=100)?"C":(marks>=50 && marks<=100)?"D":(marks>=35 && marks<=100)?"E":(marks<34 && marks>0)?"FAIL":(marks<0||marks>100)?"INVALID":"INVALID";
		System.out.println(A);
	}

}
