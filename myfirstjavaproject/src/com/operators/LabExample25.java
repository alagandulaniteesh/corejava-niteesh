package com.operators;
import java.util.Scanner;
public class LabExample25 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER YOUR MARKS");
		int a=sc.nextInt();
		String marks=(a>=40)?"PASS":"FAIL";
		System.out.println(marks);
		
		
		

	}

}
