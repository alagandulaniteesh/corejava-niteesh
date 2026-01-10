package com.numberproblems;

import java.util.Scanner;

public class HighestDigit {
//WAP TO PRINT THE LARGEST DIGIT IN THE GIVEN NUMBER
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num=sc.nextInt();
		int temp=num;
		int highest=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			if(rem>highest) {
				highest=rem;
			}
			num=num/10;
		}
		System.out.println("LARGEST DIGIT IN THE "+temp+" IS "+highest);
		
	}

}
