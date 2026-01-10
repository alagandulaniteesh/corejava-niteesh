package com.numberproblems;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER TO FIND THE NUMBER IS ARMSTRONG OR NOT");
		int num=sc.nextInt();
		int temp=num;
		int temp1=num;
		int count=0;
		int arm=0;
		while(temp1!=0) {
			temp1=temp1/10;
			count++;
		}
		while(temp!=0) {
			int rem=temp%10;
			temp=temp/10;
			arm=arm+Math.powExact(rem, count);
		}
		if (arm==num) {
			System.out.println(num+" IS ARMSTRONG NUMBER");
		}else {
			System.out.println(num+" IS NOT ARMSTRONG NUMBER");
		}

	}

}
