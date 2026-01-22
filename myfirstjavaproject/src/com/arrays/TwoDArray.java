package com.arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int []num1= {1,2,3};
		int []num2= {2,3,4};
		int [][]num3=new int[num1.length][num2.length];
		for(int i=0;i<num3.length;i++) {
			for(int j=0;j<num3[i].length;j++) {
				num3[i][j]=num1[i]+num2[j];
			System.out.print(num3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
