package com.numberproblems;

import java.util.Scanner;

public class NonZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int num = sc.nextInt();
		int rem;
		String nonZeros = "";
		while (num != 0) {
			rem = num % 10;
			if (rem != 0) {
				nonZeros = rem + nonZeros;
			}
			num = num / 10;
		}
		System.out.println(nonZeros);
		do {
			rem = num % 10;
			if (rem != 0) {
				nonZeros = rem + nonZeros;
			}
		num = num / 10;
		}while(num!=0);
		System.out.println(nonZeros);
		
	}

}
