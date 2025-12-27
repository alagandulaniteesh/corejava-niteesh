package com.pyramids;

//Print a right-angled triangle
//
//*
//**
//***
//****
public class Testdemo1 {

	public static void main(String[] args) {
		int a;
		int b;
		for (a = 1; a <= 5; a++) {
			for (b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
