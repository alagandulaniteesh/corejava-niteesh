package com.javaintro;

import java.util.Scanner;

public class Verificaton {
	int Employeeid()
	{
		Scanner s =new Scanner(System.in);
		int id=s.nextInt();
		return id;
	}
	public static void main(String[] args)
	{ 
		Verificaton v = new Verificaton();
		System.out.println("Enter your id:");
		int id =v.Employeeid();
		while(id!=345)
		{
		if (id!=345)
		{	
			System.out.println("Enter correct id");
			id=v.Employeeid();
			
		}
		}
		System.out.println("Loged in successfully");
		System.out.println("Employee id is: "+id);
		}

		
	}
