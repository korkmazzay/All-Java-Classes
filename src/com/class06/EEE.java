package com.class06;

import java.util.Scanner;

public class EEE {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Input a number between 1-7");
		 int num;
		 String dayOfWeek;
		 num=scan.nextInt();
		
		
		 switch(dayOfWeek.equalsIgnoreCase(num)) { 	
		 		case 1:
		 			dayOfWeek="Monday";
					break;
				case 2:
					dayOfWeek="Tuesday";
					break;
				case 3:
					dayOfWeek="Wednesday";	
					break;
				case 4:
					dayOfWeek="Thursday";
					break;
				case 5:
					dayOfWeek="Friday";
					break;
				case 6:
					dayOfWeek="Saturday";
					break;
				case 7:
					dayOfWeek="Sunday";
					break;
					default:
					dayOfWeek="Invalid";

		  		System.out.println(dayOfWeek);}


		
		
		
		
		
		
		
		
		 }
		
    }
	

