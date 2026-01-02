package com.javaintro;

public class Test1 {
	static {
		System.out.println("static block called");
	}
	
	public static void main(String[] args) {
		
		{
			System.out.println("instance block called");
			
		}
	}

}
