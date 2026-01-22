package com.arrays;

import java.util.Scanner;

public class DuplicateNumbers {

	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("Enter the size of array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr= new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int []arr1= new int[size];
		for(int i=0;i<size;i++) {
		int	count=1;
		for(int j=i+1;j<size;j++) {
			
			if(arr[i]==arr[j]) {
				count++;
			
			}
		}if(count>1) {
		System.out.println("duplicates are "+arr[i]+"->"+count);
		}
		else if (count==1) {
			 System.out.println("unique are"+arr[i]);
		 }
		}
		}
		
	}


