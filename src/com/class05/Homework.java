package com.class05;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		
	String creditCard;
	double balance;
	Scanner scan;
	
	scan=new Scanner(System.in);
	
	System.out.println("Do you have a credit card");	
	creditCard=scan.next();
		
		
	
	
	if(creditCard.equals("yes")) {
		
		System.out.println("What is the balance on the card");	
		
		balance=scan.nextDouble();
		
		if (balance>1000) {
			System.out.println("pay off immediately");
		}else {
			System.out.println("spend more");	

		}
		}else {
		System.out.println("Do you want a credit card?");	

	
	
		
		}	
		
	}

}
