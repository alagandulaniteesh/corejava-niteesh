package com.javaintro;

public class Autoboxing_autounboxing {

	public static void main(String[] args) {
		System.out.println("Auto boxing (converting from primitive object data type to "
				+"wrapper object data type)");
	int a=5;
	Integer b=6;
	byte a1=2;
	Byte b1=3;
	short a3=5;
	Short b3=7;
	long a4=23l;
	Long b4=26l;
	float a5=34f;
	Float b5=4738f;
	double a6=23d;
	Double b6=27274d;
	char a7='A';
	Character b7='B';
	System.out.println(+(a=b));
	System.out.println(+(a1=b1));
	System.out.println(+(a3=b3));
	System.out.println(+(a4=b4));
	System.out.println(+(a5=b5));
	System.out.println(+(a6=b6));
	System.out.println(+(a7=b7));
	System.out.println("Auto unboxing (converting from primitive object data type to "
			+"wrapper object data type)");
	System.out.println(+(b=a));
	System.out.println(+(b1=a1));
	System.out.println(+(b3=a3));
	System.out.println(+(b4=a4));
	System.out.println(+(b5=a5));
	System.out.println(+(b6=a6));
	System.out.println(+(b7=a7));
	}

}
