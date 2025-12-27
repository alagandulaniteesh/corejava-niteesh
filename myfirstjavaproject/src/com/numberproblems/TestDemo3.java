package com.numberproblems;

import java.util.Scanner;

//Check whether a number is Prime.
public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER TO CHECK WHETER THE NUMBER IS PRIME OR NOT");
		int a = sc.nextInt();
		int b = 1;
		int count = 0;
		for (b = 1; b <= a; b++) {
			if (a % b == 0) {
				count += 1;
			}
		}
		if (count == 2) {
			System.out.println("THE NUMBER IS PRIME NUMBER");
		} else {
			System.out.println("THE NUMBER IS NOT PRIME NUMBER");
		}
		sc.close();
	}

}
