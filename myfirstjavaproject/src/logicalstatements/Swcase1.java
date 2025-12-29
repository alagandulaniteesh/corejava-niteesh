package logicalstatements;

import java.util.Scanner;

public class Swcase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch (a) {
	    case 1:
	        System.out.println("ONE");
	        break;
	    case 2:
	        System.out.println("TWO");
	        break;
	    case 3:
	        System.out.println("THREE");
	        break;
	    case 4:
	        System.out.println("FOUR");
	        break;
	    case 5:
	        System.out.println("FIVE");
	        break;
	    default:
	        System.out.println("INVALID NUMBER");
	}


	}

}
