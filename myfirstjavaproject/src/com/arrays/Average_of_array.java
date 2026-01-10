package com.arrays;

import java.util.Scanner;

public class Average_of_array {

	public static void main(String[] args) {
	System.out.println("ENTER THE SIZE");
	Scanner sc = new Scanner(System.in);
	int size=sc.nextInt();
	int sum=0;
	double average=0;
	int[] arr= new int[size];
	System.out.println("ENTER "+size+" NUMBERS");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.print("ARRAY IS:"+" ");
	for(int i=0;i<size;i++) {
		System.out.print(arr[i]);
		sum=sum+arr[i];
	}
	System.out.println("\nSUM OF THE ARRAY: "+sum);
	average=sum/size;
	System.out.println("AVERAGE OF THE ARRAY IS: "+average);
	

	}

}
