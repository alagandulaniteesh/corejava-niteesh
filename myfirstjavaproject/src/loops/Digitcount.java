package loops;
import java.util.Scanner;
public class Digitcount {
	public static void main(String[] args) {
		int b,rem=0;
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("ENTER A NUMBER");
		int a=sc.nextInt();
		System.out.println("ENTER A SINGLE DIGIT NUMBER TO FIND  THE DUPLICATES IN THE NUMBER");
		int digit=sc.nextInt();
		for(int i=1;a>0;i++) {
			 b=a%10;
			 a=a/10;
			 if(b==digit) {
				 count++;
			 }
			rem=rem+b;
		}
		 System.out.println("THE DUPLICATES OF "+digit+" ARE: "+count);
	System.out.println("SUM OF ALL DIGITS "+rem);
		
	}

}
