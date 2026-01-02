package com.javaintro;
import java.util.Scanner;
public class Converstion {
	int value(int a) 
	{
		 Scanner s = new Scanner(System.in);
		  a=s.nextInt();
		 return a;
	}
	char value(char b)
	{
		Scanner s = new Scanner(System.in);
		 b=s.next().charAt(0);
		return b;
	}
	public static void main(String[] args) 
	{
	Converstion c = new Converstion();
	System.out.println("Enter a number:");
	int a=c.value(0);
	System.out.println("The asscii value is: "+(char)a);
	System.out.println("Enter a char:");
	char b=c.value('a');
	System.out.println("The asscii value is: "+(int)b);
	
	
	

	}

}
