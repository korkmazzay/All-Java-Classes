package com.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		
		Scanner anyName;
		anyName=new Scanner(System.in);
	
		// to capture entire sentence
		
		String sentence=anyName.nextLine();
		System.out.println(sentence);
		
		
		// to capture entire sentence
		int num=anyName.nextInt();
		System.out.println();

		// to capture single character

		char singleCharacter=anyName.next().charAt(num);
		
		System.out.println(singleCharacter);

		
		
	}

}
