package com.pyramids;

//Print an inverted right-angled triangle
//
//****
//***
//**
//*
public class TestDemo2 {

	public static void main(String[] args) {
		int a, b;
		for (a = 5; a >= 1; a--) {
			for (b = 1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
