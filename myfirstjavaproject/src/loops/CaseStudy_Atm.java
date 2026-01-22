package loops;

import java.util.Scanner;

public class CaseStudy_Atm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c="y";
		int user=1;
		
		System.out.println("------WELCOME TO THE STATE BANK ATM------");
		
		do {
		int transd=0;// to track the total deposit transactions 
		int trans=0;//to track total successful transactions
		int transw=0;//to track with drawl transactions
		int ftrans=0;//to track total failed transactions
		int tt=0;//to track total no of transactions
		double totald=0;//total deposit money
		double totalw=0;//total withdraw money
		double balance=0;
		System.out.println("USER-"+user);
		System.out.println("ENTER NUMBER OF TRANSACTIONS ");
		int ntran=sc.nextInt();
		for(int i=1;i<=ntran;i++) {
			System.out.println("ENTER YOUR CHOICE\n-> 1 FOR DEPOSITE\n-> 2 FOR WITHDRAWAL");
			int num=sc.nextInt();
		switch(num){
		case 1 ->{transd++;
			trans++;
			tt++;
			System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSITE");
			double deposite=sc.nextDouble();
			balance=balance+deposite;
			totald=totald+deposite;}//CASE 1 close brace
		case 2 ->{	
		System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW");
		double withdraw=sc.nextDouble();
		if(withdraw<=balance) {
			tt++;
			transw++;
			trans++;
		balance=balance-withdraw;
		totalw=totalw+withdraw;
		}// if close brace
		else {
			tt++;
			ftrans++;
			System.out.println("NO SUFFICIENT FUNDS TO WITHDRAW");
		}//else close brace
		}//CASE 2 close brace
		default->System.out.println("ENTER CORRECT CHOICE 1 0R 2");
		
		}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("TRANSACTIONS DEATILS OF USER- "+user);
		System.out.println("\nTOTAL NO OF TRANSACTIONS ARE: "+tt);
		System.out.println("TOTAL NO OF SUCCESSFUL TRANSACTIONS ARE:"+trans);
		System.out.println("TOTAL NO OF FAILED TRANSACTIONS ARE: "+ftrans);
		System.out.println("\n"+transd+" DEPOSITE TRANSACTIONS\n"+transw+" WITHDRAWL TRANSACTIONS");
		System.out.println("\nTOTAL DEPOSITED AMOUNT:"+totald);
		System.out.println("TOTAL WITHDRAWL AMOUNT:"+totalw);
		System.out.println("TOTAL BALANCE IN THE USER ACCOUNT: "+balance);
		System.out.println("-----------------------------------------------------");
	
		System.out.println("DO YOU WANT TO CONTIUNE FOR NEXT USER ENTER Y FOR YES AND N FOR NO");
		  c=sc.next();
		  user++;
		} while (c.equalsIgnoreCase("y"));

		
		sc.close();
	}

}
