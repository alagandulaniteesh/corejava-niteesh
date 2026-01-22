<<<<<<< HEAD
package com.numberproblems;

import java.util.Scanner;

public class Carrie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int carrie=0;
		int count =0;
		System.out.println("enter your first number:");
		int a=sc.nextInt();
		System.out.println("enter your second number:");
		int b=sc.nextInt();
		while (a>0 || b>0) {
			int c=a%10;
			int d=b%10;
			if((c+d)+ carrie >=10) {
				count ++;
				carrie =1;
			}
			else {
				carrie=0;
			}
			a=a/10;
			b=b/10;
		}
		System.out.println(count);
	}

}
=======
package com.numberproblems;

import java.util.Scanner;

public class Carrie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int carrie=0;
		int count =0;
		System.out.println("enter your first number:");
		int a=sc.nextInt();
		System.out.println("enter your second number:");
		int b=sc.nextInt();
		while (a>0 || b>0) {
			int c=a%10;
			int d=b%10;
			if((c+d)+ carrie >=10) {
				count ++;
				carrie =1;
			}
			else {
				carrie=0;
			}
			a=a/10;
			b=b/10;
		}
		System.out.println(count);
	}

}
>>>>>>> branch 'master' of https://github.com/alagandulaniteesh/corejava-niteesh
