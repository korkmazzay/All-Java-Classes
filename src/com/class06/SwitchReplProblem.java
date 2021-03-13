package com.class06;

import java.util.Scanner;

public class SwitchReplProblem {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your favorite car make");

		String marka,mensei;
		marka=scanner.nextLine();
		switch(marka) {

		   case "BMW":
					mensei="german car";
					break;
			case "Toyota":
					mensei=" japanese car";
					break;
			case "Maserati":
					mensei="italian car";	
					break;
		
		    default:
					mensei="unknown";}

		System.out.println(mensei);

			
		
		
		
	}

}
