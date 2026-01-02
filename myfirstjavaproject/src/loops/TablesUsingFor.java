package loops;

import java.util.Scanner;

//wap to print math table based on the input? 
public class TablesUsingFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER TO FIND ITS TABLE");
		int a = sc.nextInt();// using this for which table
		System.out.println("ENTER THE RANGE UPTO  YOU WANT");
		int b = sc.nextInt();// using this for the range of the table
		for (int i = 1; i <= b; i++) {
			System.out.println(a + " X " + i + " = " + a * i);
		}

	}

}
