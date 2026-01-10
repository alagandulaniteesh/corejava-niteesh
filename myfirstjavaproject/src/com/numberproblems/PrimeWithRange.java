package com.numberproblems;

import java.util.Scanner;

public class PrimeWithRange {
//WAP TO PRINT PRIME UPTO GIVEN RANGE
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE RANGE UPTO YOU WANT");
		int range = sc.nextInt();

		int primeCount = 0;
		for (int i = 2;; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println(i);
				primeCount++;
				if (primeCount >= range) {
					break;
				}
			}
		}

	}

}
