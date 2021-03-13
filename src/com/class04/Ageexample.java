package com.class04;

public class Ageexample {

	public static void main(String[] args) {

		int age=30;
		int weight=140;
		
		if (age>18) {
			if (weight>110) {
				System.out.println("you can donate based on your age and weight");
			} else {
				System.out.println("you weight is too small, you can not donate");
			}
			
		} else {
			System.out.println("you age is not eligible");
		}
		
		
		
	}

}
