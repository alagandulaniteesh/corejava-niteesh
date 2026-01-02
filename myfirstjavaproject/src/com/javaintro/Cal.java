package com.javaintro;

public class Cal {

	public static void main(String[] args) {
		int choco = 15;// one chocolate price is 15
		int cookie = 10;// one cookie price is 10
		int total = 450;// I have total amount of 450
		int remain = 0;
		int subtotal = 0;
		int a = 15 * 10;// cost of total chocolates
		int b = 10 * 5;// cost of total cookies
		System.out.println("I have amout of 450");
		System.out.println("one chocolate price is " + choco);
		System.out.println("one cookie price is " + cookie);
		System.out.println("total chocolates price is " + 15 * 10);// to print total chocolate cost
		System.out.println("total cookies price is " + 10 * 5);// to print total cookie cost
		subtotal = a + b;// storing the total amount of chocolate and cookies
		System.out.println("total purchase cost is " + subtotal);
		remain = total - subtotal;// calculate the total remain money
		System.out.println("remain amount is " + remain);

	}

}
