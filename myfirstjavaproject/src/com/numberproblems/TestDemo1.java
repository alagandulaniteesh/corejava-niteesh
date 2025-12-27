package com.numberproblems;
import java.util.Scanner;
public class TestDemo1 {
	//Check whether a number is Positive, Negative, or Zero.

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("ENTER ANY NUMBER");
	 int a= sc.nextInt();
	 if(a>0) {
		 System.out.println("THE NUMBER IS POSITIVE");
	 }
	 else if(a<0) {
		 System.out.println("THE NUMBER IS NEGATIVE");
	 }
	 else {
		 System.out.println("THE NUMBER IS ZERO");
	 }
	}

}
