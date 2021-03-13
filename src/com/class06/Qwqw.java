package com.class06;

import java.util.Scanner;

public class Qwqw {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the roll number of the Child");
		int number;
		String scenario;
		number=scan.nextInt();
			switch(number){
			case 101:
					scenario="Student name: Ramesh";
					break;
			case 102:
					scenario="Student name: Mahesh";
					break;
			case 103:
					scenario="Student name: Mukesh";	
					break;
			
			default:
					scenario="Not found Student name: in Class";}
					
			
			System.out.println(scenario);

		
	}

}
