package com.class05;

import java.util.Scanner;

public class LogicalOperatorsExample {

	public static void main(String[] args) {

		
		/*ask user to enter age
		 * based on age will be define 
		 * if age is from 1 to 3 ---> you are baby
		 * if age is from 3 to 5 ---> bigger baby
		 * if age 5-12 -------> kid
		 * if age 13-19------> teenager
		 * if above 20------> adult
		 * 
		 * 
		 */
		
		Scanner input;
		String name;
		int age;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your name");
		name=input.next();
		
		System.out.println("Please enter your age");
		age=input.nextInt();
		
		if (age>=1 && age <3) {
		System.out.println("you are baby");

		}else if (age>=3 && age<=5) {
			System.out.println("bigger baby");

		}else if (age>5 && age<=12) {
			System.out.println("kid");

		}else if (age>12 && age<=19) {
		
			System.out.println("teenager");
		}else if (age>=20) {
			System.out.println("adult");

		}
		
	}

}
