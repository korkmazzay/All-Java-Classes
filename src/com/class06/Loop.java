package com.class06;

import java.util.Scanner;

public class Loop {

	public static void main(String args[]) {

		boolean isSunny=true;
		int tempature;
		Scanner scan=new Scanner(System.in);
		  
		  System.out.println("Is it sunny outside?");
		  isSunny=scan.nextBoolean();
		  if(isSunny){System.out.println("It is a sunny day, I should go somewhere!");
		    System.out.println("What is the temperature outside?");
		    tempature=scan.nextInt();
		    if(tempature>85){System.out.println("I am going to the beach");}
		    else{System.out.println("I am going to the park");}
		  }else{System.out.println("I stay home and practice Java!");}






	}

}
