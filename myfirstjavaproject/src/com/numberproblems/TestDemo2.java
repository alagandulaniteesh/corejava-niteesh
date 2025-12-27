package com.numberproblems;

import java.util.Scanner;

//Check whether a number is Divisible by 5 and 11.
public class TestDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("ENTER ANY NUMBER");
		 int a= sc.nextInt();
		 if(a%5==0 && a%11==0) {
			 System.out.println("THE NUMBER IS DIVISIBLE BY BOTH 5 AND 11");
		 }
		 else {
			 System.out.println("THE NUMBER IS NOT DIVISIBLE BY BOTH 5 AND 11");
		 }

	}

}
