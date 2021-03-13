package com.class01;

import java.util.Scanner; 
class Main {
 public static void main(String args[]){


	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you need a loan?");
		scan.nextBoolean();
		System.out.println("Do you have credit score?");
		scan.nextBoolean();

		
		System.out.println("What is your credit score?");
		int score=scan.nextInt();
		String eligibility=scan.nextLine();
		
		if(score<600) {
		eligibility="Not eligible";
		System.out.println("The eligibility is "+eligibility);}
		else if(score>=600 && score<=700) {
		eligibility="Maybe eligible";
		System.out.println("The eligibility is "+eligibility);}
		else if(score>=701 && score<=800) {
        eligibility = "Eligible";
		System.out.println("The eligibility is "+eligibility);}
        else if(score>801) {
        eligibility = "Definitely eligible"; 
        System.out.println("The eligibility is "+eligibility);
        }else {System.out.println("unknow");
        }
	
 }
}