package com.arrays;

public class OddIndex {

	public static void main(String[] args) {
		int []num= {2,3,5,7,1,7,4};
		for(int i=0;i<num.length;i++) {
			if(i%2!=0) {
				System.out.print(num[i]+" ");
			}
		}
	}
}
