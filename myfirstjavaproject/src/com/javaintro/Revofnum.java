package com.javaintro;

public class Revofnum {

	public static void main(String[] args) {
		int num=123;
		int rev=0;
		rev=num%10;
		num=num/10;// string is reversed by using this technique;
		System.out.print(rev);
		rev=num%10;
		System.out.print(rev);
		num=num/10;
		rev=num%10;
		System.out.print(rev);

	}

}
