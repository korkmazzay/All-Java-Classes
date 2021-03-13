package com.class07;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		
		int q=0;
		while(q<5) {
			
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Hello "+name);	
		q++;
		
		}
		
	
		
	}

}
