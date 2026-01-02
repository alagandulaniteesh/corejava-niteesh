package com.javaintro;

public class Rev {

	public static void main(String[] args) {
		int num = 123;
		int rev = 0;
		int i = 0;
		for (i = 1; i <= 3; i++) {
			rev = num % 10;
			num = num / 10;
			System.out.print(rev);
		}

	}

}
