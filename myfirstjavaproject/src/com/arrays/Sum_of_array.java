package com.arrays;

import java.util.Scanner;

public class Sum_of_array {

	public static void main(String[] args) {
		System.out.print("ENTER THE SIZE OF ARRAY: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		int sum=0;
		System.out.println("ENTER THE "+size+" NUMBERS");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.print("THE ARRAY IS:");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" " );
		}
		System.out.println("\nTHE SUM OF THE ARRAY IS: "+sum);

	}

}
