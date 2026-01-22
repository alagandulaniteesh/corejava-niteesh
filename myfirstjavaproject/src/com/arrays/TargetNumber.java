package com.arrays;

public class TargetNumber {

	public static void main(String[] args) {
		int[] num = { 123, 912, 627, 1992, 19982,2,2,2,22 };
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			int temp = num[i];
			while (temp != 0) {
				temp = num[i] % 10;
				num[i]=num[i]/10;
				if (temp == 2) {
					count++;
				}
			}
		}
		System.out.println("the number of 2 in array are: "+count);
	}

}
