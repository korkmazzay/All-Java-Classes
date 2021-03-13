package com.class12;

import java.util.Scanner;

public class AAA {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);

		String[] dayOfWeek=new String[7];

		for(int i=0; i<7; i++){
		  System.out.println("Please enter day "+(i+1)+" of the week");
		  dayOfWeek[i]=scan.next();
		}
		for(String week:dayOfWeek){
			  System.out.println(week);
			}


	}

}
