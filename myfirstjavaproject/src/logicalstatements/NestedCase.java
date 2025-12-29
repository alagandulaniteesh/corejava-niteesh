package logicalstatements;

import java.util.Scanner;
// program for creating a billing system for fruits and vegetable market using nested switch and case 
public class NestedCase {// open brace of class

	public static void main(String[] args) {// open brace for main method
		System.out.println("WELCOME TO THE E-FRUITS AND VEGETABLE MARKET");
		System.out.println("========================================================");
		System.out.println(
				"AVALIABLE ITEMS IN FURITS\n-|APPLE  🍎 |200RS PER KG\n-|BANANA 🍌 |80RS PER DOZEN \n-|MANGO  🥭 |100RS PER KG");
		System.out.println(
				"AVALIABLE ITEMS IN VEGETABLES\n-|POTATO 🥔 |50RS PER KG\n-|TOMATO 🍅 |30 PER KG\n-|CARROT 🥕 |60 PER KG");
		System.out.println("========================================================");
		Scanner sc = new Scanner(System.in);
		int total = 0;// to calculate the total final bill
		String bill = "";
		bill = bill + "ITEM\t\tQTY\tPRICE\n";
		bill = bill + "--------------------------------\n";
		String choice = "yes";
		do {// open brace for do
			System.out.println("ENTER 1 FOR FRUITS AND 2 FOR VEGETABLES");
			int a = sc.nextInt();
			System.out.println("========================================================");
			sc.nextLine();
			switch (a) {// open brace for cases fruits or vegetables
			case 1 -> {// open brace for fruits cases
				System.out.println("YOU SELECTED FRUITS");
				System.out.println("SELECT THE FRUITS YOU WANT:\n APPLE\n BANANA \n MANGO");
				System.out.println("========================================================");
				String fruits = sc.nextLine();
				switch (fruits) {// open brace for types of fruits
				case "apple", "APPLE" -> {// open brace for apple
					System.out.println("PRICE OF APPLES IS 200 PER KG");
					System.out.println(
							"ENTER THE QUANTITY YOU WANT\nENTER 0 FOR HALF KG \nFOR KG'S ENTER THE QUANTITY OF KG'S YOU WANT \nLIMIT  UPTO 3KGS ONLY");
					int kg = sc.nextInt();
					sc.nextLine();
					int cost = 200;
					switch (kg) {// open brace for kgs
					case 0 -> {
						System.out.println("COST OF APPLES FOR HALF KG IS" + (cost / 2));
						total = total + (cost / 2);
						bill = bill + "Apple\t\tHALF KG\t" + cost / 2 + "\n";
					}
					case 1 -> {
						System.out.println("COST OF APPLES FOR 1 KG IS " + cost);
						total += cost;
						bill = bill + "Apple\t\t1 KG\t" + cost + "\n";
					}
					case 2 -> {
						System.out.println("COST OF APPLES FOR 2 KG IS " + (cost * 2));
						total += cost * 2;
						bill = bill + "Apple\t\t2 KG\t" + cost * 2 + "\n";
					}
					case 3 -> {
						System.out.println("COST OF APPLES FOR 3 KG IS " + cost * 3);
						total += cost * 3;
						bill = bill + "Apple\t\t3 KG\t" + cost * 3 + "\n";
					}
					default -> {
						System.out.println("PLEASE ENTER IN THE RANGE OF 1-3");
					}
					
					}// close brace for kgs
					
					
					System.out.println("========================================================");
				} // close brace for apple
				default -> System.out.println("PLEASE ENTER THE ITEMS THAT ARE LISTED IN THE MENU");

				case "banana", "BANANA" -> {// open brace for banana
					System.out.println("PRICE OF BANANA IS 80 PER DOZEN");
					System.out.println(
							"ENTER THE QUANTITY YOU WANT\nENTER 0 FOR HALF DOZEN\nFOR KG'S ENTER THE QUANTITY OF DOZENS YOU WANT\nLIMIT  UPTO 3 DOZENS ONLY");
					int kg = sc.nextInt();
					sc.nextLine();
					int cost = 80;
					switch (kg) {// open brace for dozens
					case 0 -> {
						System.out.println("COST OF BANANA FOR HALF DOZEN IS" + (cost / 2));
						total = total + (cost / 2);
						bill = bill + "BANANA\t\tHALF DOZEN\t" + cost / 2 + "\n";
					}
					case 1 -> {
						System.out.println("COST OF BANANA FOR 1 DOZEN IS " + cost);
						total += cost;
						bill = bill + "BANANA\t\t1 DOZEN\t" + cost + "\n";
					}
					case 2 -> {
						System.out.println("COST OF BANANA FOR 2 DOZEN " + (cost * 2));
						total += cost * 2;
						bill = bill + "BANANA\t\t2 DOZEN\t" + cost * 2 + "\n";
					}
					case 3 -> {
						System.out.println("COST OF BANANA FOR 3 DOZEN " + cost * 3);
						total += cost * 3;
						bill = bill + "BANANA\t\t3 DOZEN\t" + cost * 3 + "\n";
					}
					default -> System.out.println("PLEASE ENTER IN THE RANGE OF 1-3");
					}// close brace for dozens
					System.out.println("========================================================");
				} // close braces for banana
				
				case "mango", "MANGO" -> {// open brace for MANGO
					System.out.println("PRICE OF MANGO  IS 100 PER KG");
					System.out.println(
							"ENTER THE QUANTITY YOU WANT\nENTER 0 FOR HALF KG\nFOR KG'S ENTER THE QUANTITY OF KG YOU WANT\nLIMIT  UPTO 3 DOZENS ONLY");
					int kg = sc.nextInt();
					sc.nextLine();
					int cost = 100;
					switch (kg) {// open brace for kgs
					case 0 -> {
						System.out.println("COST OF MANGO FOR HALF KG IS" + (cost / 2));
						total = total + (cost / 2);
						bill = bill + "MANGO\t\tHALF KG\t" + cost / 2 + "\n";
					}
					case 1 -> {
						System.out.println("COST OF MANGO FOR 1 KG IS " + cost);
						total += cost;
						bill = bill + "MANGO\t\t1 KG\t" + cost + "\n";
					}
					case 2 -> {
						System.out.println("COST OF MANGO FOR 2 KG IS" + (cost * 2));
						total += cost * 2;
						bill = bill + "MANGO\t\t2 KG\t" + cost * 2 + "\n";
					}
					case 3 -> {
						System.out.println("COST OF MANGO FOR 3 KG IS" + cost * 3);
						total += cost * 3;
						bill = bill + "MANGO\t\t3 KG\t" + cost * 3 + "\n";
					}
					default -> System.out.println("PLEASE ENTER IN THE RANGE OF 1-3");
					}// close brace for kgs
					
					System.out.println("========================================================");
				} // close brace for MANGO
				
				}// close brace for types fruits
					
				
			} // close of case 1

			case 2 -> {// open brace for case 2
				System.out.println("YOU SELECTED VEGETABLES");
				System.out.println("SELECT THE VEGETABLES YOU WANT:\n POTATO\n TOMATO \n CARROT");
				System.out.println("========================================================");
				String veg = sc.next();
				switch (veg) {
				case "potato" -> {
					System.out.println("PRICE OF POTATO IS 50 PER KG");
					System.out.println(
							"ENTER THE QUANTITY YOU WANT\nENTER 0 FOR HALF KG\nFOR KG'S ENTER THE QUANTITY OF KG YOU WANT\nLIMIT  UPTO 3 KGS ONLY");
					int kg = sc.nextInt();
					sc.nextLine();
					int cost = 50;
					switch (kg) {// open brace for kgs
					case 0 -> {
						System.out.println("COST OF POTATO FOR HALF KG IS" + (cost / 2));
						total = total + (cost / 2);
						bill = bill + "POTATO\t\tHALF KG\t" + cost / 2 + "\n";
					}
					case 1 -> {
						System.out.println("COST OF POTATO FOR 1 KG IS " + cost);
						total += cost;
						bill = bill + "POTATO\t\t1 KG\t" + cost + "\n";
					}
					case 2 -> {
						System.out.println("COST OF POTATO FOR 2 KG " + (cost * 2));
						total += cost * 2;
						bill = bill + "POTATO\t\t2 KG\t" + cost * 2 + "\n";
					}
					case 3 -> {
						System.out.println("COST OF POTATO FOR 3 KG " + cost * 3);
						total += cost * 3;
						bill = bill + "POTATO\t\t3 KG\t" + cost * 3 + "\n";
					}
					default -> System.out.println("PLEASE ENTER IN THE RANGE OF 1-3");
					}// close brace for kgs
					
					System.out.println("========================================================");
				} // close brace for potato
				default -> System.out.println("PLEASE ENTER THE ITEMS THAT ARE LISTED IN THE MENU");
				case "tomato" -> {// open brace for tomato
					System.out.println("PRICE OF TOMATO IS 30 PER KG");
					System.out.println(
							"ENTER THE QUANTITY YOU WANT\nENTER 0 FOR HALF KG\nFOR KG'S ENTER THE QUANTITY OF KG YOU WANT\nLIMIT  UPTO 3 KGS ONLY");
					int kg = sc.nextInt();
					sc.nextLine();
					int cost = 30;
					switch (kg) {// open brace for kgs
					case 0 -> {
						System.out.println("COST OF TOMATO FOR HALF KG IS" + (cost / 2));
						total = total + (cost / 2);
						bill = bill + "TOMATO\t\tHALF KG\t" + cost / 2 + "\n";
					}
					case 1 -> {
						System.out.println("COST OF TOMATO FOR 1 KG IS " + cost);
						total += cost;
						bill = bill + "TOMATO\t\t1 KG\t" + cost + "\n";
					}
					case 2 -> {
						System.out.println("COST OF TOMATO FOR 2 KG " + (cost * 2));
						total += cost * 2;
						bill = bill + "TOMATO\t\t2 KG\t" + cost * 2 + "\n";
					}
					case 3 -> {
						System.out.println("COST OF TOMATO FOR 3 KG " + cost * 3);
						total += cost * 3;
						bill = bill + "TOMATO\t\t3 KG\t" + cost * 3 + "\n";
					}
					default -> System.out.println("PLEASE ENTER IN THE RANGE OF 1-3");
					}// close brace for kgs
					System.out.println("========================================================");
				} // CLOSE brace for tomato
				case "carrot" -> {// open brace for carrot
					System.out.println("PRICE OF carrot IS 60 PER KG");
					System.out.println(
							"ENTER THE QUANTITY YOU WANT\nENTER 0 FOR HALF KG \nFOR KG'S ENTER THE QUANTITY OF KG YOU WANT \nLIMIT  UPTO 3 KGS ONLY");
					int kg = sc.nextInt();
					sc.nextLine();
					int cost = 60;
					switch (kg) {// open brace for kgs
					case 0 -> {
						System.out.println("COST OF CARROT FOR HALF KG IS" + (cost / 2));
						total = total + (cost / 2);
						bill = bill + "CARROT\t\tHALF KG\t" + cost / 2 + "\n";
					}
					case 1 -> {
						System.out.println("COST OF CARROT FOR 1 KG IS " + cost);
						total += cost;
						bill = bill + "CARROT\t\t1 KG\t" + cost + "\n";
					}
					case 2 -> {
						System.out.println("COST OF CARROT FOR 2 KG " + (cost * 2));
						total += cost * 2;
						bill = bill + "CARROT\t\t2 KG\t" + cost * 2 + "\n";
					}
					case 3 -> {
						System.out.println("COST OF CARROT FOR 3 KG " + cost * 3);
						total += cost * 3;
						bill = bill + "CARROT\t\t3 KG\t" + cost * 3 + "\n";
					}
					default -> System.out.println("PLEASE ENTER IN THE RANGE OF 1-3");
					}// close brace for kgs
					
					System.out.println("========================================================");
				} // close brace for carrot
			
				}// close brace for veg
			} // close brace for case 2
			}// close for fruits or vegetables
			System.out.println("========================================================");
			System.out.println("\nDO YOU WANT TO CONTINUE? (yes/no)");
			sc.nextLine();
			choice = sc.nextLine();
			System.out.println("========================================================");
		} // close of do
		while (choice.equals("yes"));
		System.out.println("DO YOU WANT A CARRY BAG?(yes/no)\nEACH CARRY BAG COST IS 15RS");
		String carry = sc.next();
		if (carry.equals("yes")) {
			System.out.println("ENTER WHO MAY CARRY BAGS YOU WANT");
			int b=sc.nextInt();
			total=total+15*b;
			bill = bill + "CARRY BAG\t"+b+"\t"+b*15+"\n";
		}
		System.out.println("=================== FINAL BILL =========================");
		System.out.println(bill);
		System.out.println("TOTAL BILL\t\t" + total);
		System.out.println("-------------------------------------------");
		System.out.println("THANK YOU FOR SHOPING");
		System.out.println("========================================================");
	}// close brace for main method
}// close brace for class
