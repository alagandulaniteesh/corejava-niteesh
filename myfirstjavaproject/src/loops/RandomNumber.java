package loops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(10);
		 System.out.println(num);
		Scanner sc = new Scanner(System.in);
		int turn = 3;
		while (turn != 0) 
		{
			System.out.println("ENTER ANY ONE  DIGIT NUMBER FROM 0-9 ");
			int n = sc.nextInt();
			if (num != n) 
			{
				turn--;
				if (turn >= 1) {
					System.out.println("THE NUMBER IS INCORRECT");
					System.out.println("you have more" + turn + "chances");
					System.out.println("***************************************");
				} else if (turn == 0) {
					System.out.println("YOU LOST YOUR ALL THREE CHANCES");
					System.out.println("YOU LOST THE GAME");
				}
			}

			else if (num == n) {
				System.out.println("YOUR GUESS IS CORRECT YOU WON");
				break;

			}

		}
		sc.close();

	}

}
