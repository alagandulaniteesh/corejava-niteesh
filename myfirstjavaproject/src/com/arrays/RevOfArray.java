package com.arrays;

public class RevOfArray {

	public static void main(String[] args) {
	int []num= {100,001};
	String temp1="";
	for(int i=0;i<num.length;i++) {
	while(num[i]>0) {
			int temp=num[i];
			temp=num[i]%10;
			num[i]=num[i]/10;
			temp1=temp1+temp;
		}
		System.out.println(temp1);
		temp1="";
	}
	}

}
