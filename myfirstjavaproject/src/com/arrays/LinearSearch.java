package com.arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		System.out.println("Enter size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		String decs = "y";
		System.out.println("Enter any " + size + " elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("YOUR ARRAY IS");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		do {
			boolean found = false;
			switch (decs) {
			case "y" -> {
				System.out.println("\nEnter the you want to search");
				int find = sc.nextInt();
				for (int i = 0; i < size; i++) {
					if (find == arr[i]) {
						System.out.println("element found at index " + (i + 1));
						found = true;
//				break;
					}

				}
				if (found != true) {
					System.out.println("Element not found");
				}
				System.out.println("do you want to contiune enter y for yes and n for no");
				decs = sc.next();
			}
			case "n"->{}

			default -> System.out.println("enter correct choice y or n");
			}
		} while (decs.equalsIgnoreCase("y"));

	}

}
