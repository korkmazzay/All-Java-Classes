package com.class07;

import java.util.Scanner;

public class LotterywithDoWhile {

	public static void main(String[] args) {

	/*
	 * we play lottery and we have a win number which is 17
	 * we need to keep asking a user to enter any number from 1 to 10
	 * UNTIL correct number is entered	
	 */
	
	Scanner input;
	input=new Scanner(System.in);
	int num;
	int lotteryNumber=17;
	
	do {
	System.out.println("Please enter any number from 1 to 100 to win the lottery");
	num=input.nextInt();
	}while(num!=lotteryNumber);	
	System.out.println("Congrats you enterered "+num+" which is a lucky number");
		
		
		
		
		
		
		
		
	}

}
