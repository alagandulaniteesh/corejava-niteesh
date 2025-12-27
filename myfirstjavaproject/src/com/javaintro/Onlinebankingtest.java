package com.javaintro;

import java.util.Scanner;

public class Onlinebankingtest {
	String CreateAccount() {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		return name;
	}

	long phone() {
		Scanner s = new Scanner(System.in);
		long phone = s.nextLong();
		return phone;
	}

	int deposit() {
		Scanner s = new Scanner(System.in);
		int deposit = s.nextInt();
		return deposit;
	}

	int withdraw() {
		Scanner s = new Scanner(System.in);
		int withdraw = s.nextInt();
		return withdraw;
	}

	int intrest() {
		Scanner s = new Scanner(System.in);
		int amt = s.nextInt();

		return amt;

	}

	public static void main(String[] args) {
		Onilnebakingsystem ca = new Onilnebakingsystem();
		System.out.println("Enter your name:");
		String name = ca.CreateAccount();
		System.out.println("Enter your phone num:");
		long phone = ca.phone();
		System.out.println("account is in the name of:" + name);
		System.out.println("phone number is: " + phone);

		Scanner s = new Scanner(System.in);
		int balance = 50000;
		int days = 30;
		int dailyamount = 2;
		System.out.println("your bank BALANCE is " + balance);
		System.out.println("Enter the amount you want to DEPOSIT");
		int deposit = ca.deposit();
		int rem1 = balance + deposit;
		System.out.println("deposited money is" + deposit);
		System.out.println("Avalaiable amount is" + rem1);
		System.out.println("Enetr the amount you want to WITHDRAW");
		int withdraw = ca.withdraw();
		System.out.println("Withdrawed amount is:" + withdraw);
		int rem = rem1 - withdraw;
		System.out.println("Avalaiable amount is" + (rem));
		System.out.println("ENTER THE AMOUNT YOU WANT TO TAKE AS LOAN");
		int amt = ca.intrest();
		int intr = ((days * dailyamount) + amt);
		System.out.println("DEBT: " + intr);

	}

}
