package com.class08;

import java.util.Scanner;

public class EXAMPLE2 {

	public static void main(String[] args) {

	/*
	 * 
	 * WRITE A PROGRAM THAT READS A RANGE OF INTEGERS (START AND END POINTS)
	 * PROVIDED BY A USER AND THEN FROM THAT RANGE PRINTS THE SUM OF THE EVEN 
	 * 	
	 */
		
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter start number");
	int start=input.nextInt();
		
	System.out.println("Please enter end number");
	int end=input.nextInt();
	int sumOdd=0;
	int sumEven=0;
	
	if(start<end) {
		for(int i=start; i<=end; i++) {
			if(i%2!=0) {
				sumOdd+=i;
				
			}else {
				sumEven+=i;
			}
		}
		
		System.out.println("Sum of Odd numbers from range "+start+" to "+ end+" is = "+sumOdd);
		System.out.println("Sum of Even numbers from range "+start+" to "+ end+" is = "+sumEven);

	}
		
		
		
		
	}

}
