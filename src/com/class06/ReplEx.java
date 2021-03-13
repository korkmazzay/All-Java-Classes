package com.class06;

import java.util.Scanner;

public class ReplEx {

	public static void main(String[] args) {

	    Scanner scan=new Scanner(System.in);
	    int age;
	    char gender;
	    

	    System.out.println("Please enter your gender: M or F");
	      gender=scan.next().charAt(0);
	    System.out.println("Please enter your age");
	      age=scan.nextInt();
	      
	    if(age>25 && gender=='F' ) {
      System.out.println("Woman");
	    }else if (age>25 && gender=='M'){System.out.println("Man");}
	
	      if(age<25 && gender=='F') {
        System.out.println("Girl");
      }else if(age<25 && gender=='M');{System.out.println("Boy");}

	        
		
	}

}
