package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class N_Elements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		System.out.println("ENTER "+size+" NUMBERS");
		int[]arr= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("THE NUMBER YOU HAVE ARRANGED IN THE LIST");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]);
		}
	}

}
