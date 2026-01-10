package com.arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE OF THE ARRAY");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("ENTER ANY " + size + " NUMBERS");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int secondmax=min;
		int secondmin=max;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<max && arr[i]>secondmax) {
				secondmax=arr[i];
			}	
			if(arr[i]>min && arr[i]<secondmin) {
				secondmin=arr[i];
			}
		}
		System.out.println("MAX: " + max + " MIN: " + min);
		System.out.println("\nSECOND MAX: "+secondmax+" SECOND MIN: "+secondmin);

	}

}
