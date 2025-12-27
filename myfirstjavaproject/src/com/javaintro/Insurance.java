package com.javaintro;

public class Insurance {
	static String cname ="VCUBE";
	static int ifee=500;
	static int amount=1500; 
	static String companyname()
	{
		return cname;
	}
	static int insurancefee()
	{
		return ifee;
	}
	static int dailyamount()
	{
		return amount;
	}
	static int baseamount(int days)
	{
			int base=days*dailyamount();
			return base;
	}
	static int totalamount(int days)
	{
		int total=insurancefee()+baseamount(days);
		return total;
	}
	
	public static void main(String[] args) 
	{
		insurancefee();
		dailyamount();
		companyname();
		totalamount(12);
		System.out.println("companyname is:"+companyname());
		System.out.println("insurance fee is:"+insurancefee());
		System.out.println("dailyamount is:"+dailyamount());
		System.out.println("total amount is:"+totalamount(12));
		

	}

}
