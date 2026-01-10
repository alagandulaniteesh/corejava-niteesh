package com.numberproblems;

import java.util.Scanner;

public class AlternativePrime {

	static boolean isPrime(int n) {
		
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n/i; i++) {
			if (n % i == 0) {
				return false;
				}
		}
		return true;
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int alc=0;
		for (int i = 2; i <a; i++) {
			if (isPrime(i) == true){
				alc++;
				if(alc%2!=0) {
					System.out.print(i+" ");
				}
			}
			}
		}

	}


