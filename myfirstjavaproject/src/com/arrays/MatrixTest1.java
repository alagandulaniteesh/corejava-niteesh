package com.arrays;

import java.util.Scanner;

public class MatrixTest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows you want");
		int a=sc.nextInt();
		System.out.println("Enter how many coloumns you want");
		int b=sc.nextInt();
		System.out.println("Enter "+a*b+" elements");
		int[][]matrix=new int[a][b];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=sc.nextInt();
			}
			
		}
		//int sum=0;
		System.out.println("YOUR MATRIX IS:\n");
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++) {
				//sum +=matrix[i][j];
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
			
		}
	}

}
