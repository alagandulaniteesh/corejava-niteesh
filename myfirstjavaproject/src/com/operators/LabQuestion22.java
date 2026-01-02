package com.operators;
import java.util.Scanner;

public class LabQuestion22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary");
		int basicSalary=sc.nextInt();
		System.out.println("Enter your Bonus");
		int bonus=sc.nextInt();
		int grossSalary=basicSalary+bonus;
		System.out.println("Gross Salary ="+grossSalary);
		System.out.println("Enter the deduction amount");
		int deduction=sc.nextInt();		
		int netSalary=grossSalary-deduction;
		System.out.println("NET SALARY :"+netSalary);
		System.out.println("Enter total no of working days");
		int totalWorkingDays=sc.nextInt();
		int perDaySalary=basicSalary/totalWorkingDays;
		System.out.println("PER DAY SALARY :"+perDaySalary);
		System.out.println("ENTER NO WORKING DAYS");
		int workingDays=sc.nextInt();
		int earnedSalary=perDaySalary*workingDays;
		System.out.println("WORKED DAYS SALARY:"+earnedSalary);
		int remainingLeaveDays=totalWorkingDays%workingDays;
		System.out.println("REMAINING DAYS:"+remainingLeaveDays);
		sc.close();
	
		
	}

}
