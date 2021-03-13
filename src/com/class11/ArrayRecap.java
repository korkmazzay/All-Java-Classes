package com.class11;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {

	/*
	 * We want you create an array that will store elements from a user
	 * 
	 */
		
	Scanner scan=new Scanner(System.in);
	String element;
	String[] array;
	
	System.out.println("How many elements would you like to store");
	int size=scan.nextInt();
	
	array=new String[size];
	
	for(int i=0; i<size; i++) {
	System.out.println("Please enter A string");
	array[i]=scan.next();
	
	}
	System.out.println("--------Lets see what we have stored----------");
	
	for(String str:array) {
		System.out.println(str);
	}
	
	
	
	
	
	
	
	
	
	
	}

}
