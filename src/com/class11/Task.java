package com.class11;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

	/*
	 * CREATE AN ARRAY ON DOUBLE VALUES USING SCANNER
	 * CALCULATE THE SUM OF ALL STORED ELEMENTS IN THAT ARRAY
	 */
		
		Scanner input=new Scanner(System.in);
		double num;
		int size;
		double [] nums;
		double sum = 0;
		
		System.out.println("How many doubles do you want to print out?");
		size=input.nextInt();
		
		nums=new double[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter a double");
			num=input.nextDouble();
			sum+=num;
		}
		System.out.println("Sum of entered doubles are equal to "+sum);

		
	}

}
