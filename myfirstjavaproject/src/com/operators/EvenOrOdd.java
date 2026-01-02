package com.operators;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check wheter the given number is EVEN or ODD");
		long a = sc.nextLong();
		if(a%2==0) {
			System.out.println(a+" IS EVEN NUMBER");
			}
		else {
			System.out.println(a+" IS ODD NUMBER");
		}
		sc.close();

	}

}
