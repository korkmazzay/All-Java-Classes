package com.class09;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

	/*
	 * MULTIPLICATION TABLE
	 */
		
		System.out.println("--------------MULTIPLICATION TABLE-----------");
		
		int result;
		
		for(int a=1; a<=9; a++) {
			for(int b=1; b<=9; b++) {
				result= a*b;
				System.out.println(a+" x "+b+" = "+result);
			}
		}
		
		
		
		
		System.out.println("--------------MULTIPLICATION TABLE-----------");

		for (int r=1; r<=4; r++) {
			
			for(int c=1; c<=5; c++) {
			System.out.print(c);
			}
			System.out.println();}
		
		
		


			Scanner scan=new Scanner(System.in);
						int x;
						System.out.println("In:");
						x=scan.nextInt();


						for (int i=1; i<=x; x--) {
									
									System.out.print((x-1)+" ");}
					

		
		
		
		
		
		
		
	}

}
