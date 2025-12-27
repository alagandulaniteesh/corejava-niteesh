package com.operators;
import java.io.InputStream;
import java.util.Scanner;
public class Arthematic {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter First Number:");
	int a=s.nextInt();
	System.out.println("Enter Second Number");
	int b=s.nextInt();
	System.out.println("ADDITION OF TWO NUMBERS:"+(a+b));
	System.out.println("SUBRACTION OF TWO NUMBERS:"+(a-b));
	System.out.println("MULTIPLICATION OF TWO NUMBERS:"+a*b);
	System.out.println("DIVISION OF TWO NUMBERS:"+a/b);
	System.out.println("MODULS OF TWO NUMBERS:"+a%b);
	s.close();
	
}
}
