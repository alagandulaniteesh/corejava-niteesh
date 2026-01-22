<<<<<<< HEAD
package com.javaintro;

import java.util.Scanner;

public class Onilnebakingsystem {
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
		int days;
		Scanner s = new Scanner(System.in);
		days = s.nextInt();
		return days;

	}

	public static void main(String[] args) {
		System.out.println("-------WELCOME TO ABC BANK-------");
		int dailyamount = 2;
		Onilnebakingsystem ca = new Onilnebakingsystem();
		System.out.println("Enter your name:");
		String name = ca.CreateAccount();
		System.out.println("Enter your phone num:");
		long phone = ca.phone();
		System.out.println("account is in the name of:" + name);
		System.out.println("phone number is: " + phone);
		int choice;
		int balance = 50000;
		System.out.println("Enter choice:");
		System.out.println("opreatios:\n Enter 1 for check balance\n Enter 2 for deposit money\n"
				+ " Enter 3 for withdraw money\n Enter 4 for calculate intrest\nfor exit 5");
		System.out.println("******************************************");

		while (true) {
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("Enter choice:");
			System.out.println("******************************************");
			System.out.println("opreatios:\n Enter 1 for check balance\n Enter 2 for deposit money\n"
					+ " Enter 3 for withdraw money\n Enter 4 for calculate intrest\nfor exit 5");
			System.out.println("******************************************");
			if (choice == 1) {
				System.out.println("your bank BALANCE is: " + balance);
				System.out.println("******************************************");
				System.out.println("opreatios:\n Enter 1 for check balance\n Enter 2 for deposit money\n"
						+ " Enter 3 for withdraw money\n Enter 4 for calculate intrest\nfor exit 5");
			}
			if (choice == 2) {
				System.out.println("Enter the amount you want to DEPOSIT");
				int deposit = ca.deposit();
				System.out.println("deposited money is: " + deposit);
				System.out.println("Avalaiable amount is: " + (balance + deposit));
				System.out.println("******************************************");
				System.out.println("opreatios:\n Enter 1 for check balance\n Enter 2 for deposit money\n"
						+ " Enter 3 for withdraw money\n Enter 4 for calculate intrest\nfor exit 5");
			}
			if (choice == 3) {
				System.out.println("Enetr the amount you want to WITHDRAW");
				int withdraw = ca.withdraw();
				int temp = balance - withdraw;
				System.out.println("Withdrawed amount is:" + withdraw);
				System.out.println("Avalaiable amount is" + temp);
				System.out.println("******************************************");
				System.out.println("opreatios:\n Enter 1 for check balance\n Enter 2 for deposit money\n"
						+ " Enter 3 for withdraw money\n Enter 4 for calculate intrest\nfor exit 5");
			}
			if (choice == 4) {
				System.out.println("Enter no of days:");
				int days = ca.intrest();
				System.out.println("total days are: " + days);
				System.out.println("total intrest is: " + (days * dailyamount + balance));
				System.out.println("******************************************");
				System.out.println("opreatios:\n Enter 1 for check balance\n Enter 2 for deposit money\n"
						+ " Enter 3 for withdraw money\n Enter 4 for calculate intrest\nfor exit 5");

			}
			if (choice == 5) {
				System.out.println("THANK YOU FOR VISITING OUR BANK");
				break;

			}
		}
	}

}
=======
package com.javaintro;

import java.util.Scanner;

public class Onilnebakingsystem {
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
		int days;
		Scanner s = new Scanner(System.in);
		days = s.nextInt();
		return days;

	}

	public static void main(String[] args) {
		System.out.println("-------WELCOME TO ABC BANK-------");
		int dailyamount = 2;
		Onilnebakingsystem ca = new Onilnebakingsystem();
		System.out.println("Enter your name:");
		String name = ca.CreateAccount();
		System.out.println("Enter your phone num:");
		long phone = ca.phone();
		System.out.println("account is in the name of:" + name);
		System.out.println("phone number is: " + phone);
		int choice;
		int balance = 50000;
		System.out.println("Enter choice:");
		System.out.println("opreatios:\n Enter 1 for check balance\n Enter 2 for deposit money\n"
				+ " Enter 3 for withdraw money\n Enter 4 for calculate intrest\nfor exit 5");
		System.out.println("******************************************");

		while (true) {
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("Enter choice:");
			System.out.println("******************************************");
			System.out.println("opreatios:\n Enter 1 for check balance\n Enter 2 for deposit money\n"
					+ " Enter 3 for withdraw money\n Enter 4 for calculate intrest\nfor exit 5");
			System.out.println("******************************************");
			if (choice == 1) {
				System.out.println("your bank BALANCE is: " + balance);
				System.out.println("******************************************");
				System.out.println("opreatios:\n Enter 1 for check balance\n Enter 2 for deposit money\n"
						+ " Enter 3 for withdraw money\n Enter 4 for calculate intrest\nfor exit 5");
			}
			if (choice == 2) {
				System.out.println("Enter the amount you want to DEPOSIT");
				int deposit = ca.deposit();
				System.out.println("deposited money is: " + deposit);
				System.out.println("Avalaiable amount is: " + (balance + deposit));
				System.out.println("******************************************");
				System.out.println("opreatios:\n Enter 1 for check balance\n Enter 2 for deposit money\n"
						+ " Enter 3 for withdraw money\n Enter 4 for calculate intrest\nfor exit 5");
			}
			if (choice == 3) {
				System.out.println("Enetr the amount you want to WITHDRAW");
				int withdraw = ca.withdraw();
				int temp = balance - withdraw;
				System.out.println("Withdrawed amount is:" + withdraw);
				System.out.println("Avalaiable amount is" + temp);
				System.out.println("******************************************");
				System.out.println("opreatios:\n Enter 1 for check balance\n Enter 2 for deposit money\n"
						+ " Enter 3 for withdraw money\n Enter 4 for calculate intrest\nfor exit 5");
			}
			if (choice == 4) {
				System.out.println("Enter no of days:");
				int days = ca.intrest();
				System.out.println("total days are: " + days);
				System.out.println("total intrest is: " + (days * dailyamount + balance));
				System.out.println("******************************************");
				System.out.println("opreatios:\n Enter 1 for check balance\n Enter 2 for deposit money\n"
						+ " Enter 3 for withdraw money\n Enter 4 for calculate intrest\nfor exit 5");

			}
			if (choice == 5) {
				System.out.println("THANK YOU FOR VISITING OUR BANK");
				break;

			}
		}
	}

}
>>>>>>> branch 'master' of https://github.com/alagandulaniteesh/corejava-niteesh
