package com.class12;

public class MaximumNumber {

	public static void main(String args[]) {
	
		int[] numbers = { -1, 80, 234, 321, 345, 1000 };
		int small=numbers[0];
		int big=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
		
		if(numbers[i]<small) {
		small=numbers[i];}
		
		else {
		big=numbers[i];}
		
		}
		
		System.out.println(small+" is minimum number in the array");
		System.out.println(big+" is maximum number in the array");
		
		
		
		

		
	}
}
