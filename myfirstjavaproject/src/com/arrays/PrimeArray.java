package com.arrays;

import java.util.Scanner;

//WAP TO FIND THE PRIME NUMBERS IN THE GIVEN ARRAY
public class PrimeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int[]num=new int[size];
		int count =0;
		System.out.println("enter "+size+" elements");
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("your array is: ");
		for(int i=0;i<size;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("\nprime numbers are:");
		for(int i=0;i<size;i++) {
			count=0;//for reseting the count value
			for(int j=1;j<num[i];j++) {
				if(num[i]%j==0) {
					count++;
				}
			}
			if(count<2) {
				System.out.print(num[i]+" ");
			}
		}
		
	}

}
