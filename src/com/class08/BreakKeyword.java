package com.class08;

public class BreakKeyword {

	public static void main(String[] args) {

		
/*
 * * BREAK BREAKS THE LOOP, AS SOON AS JAVA SEES THAT KEYWORD IT GETS OUT 
		 * OF THE LOOP BODY (IF THERE IS ANY CODE---> IT WILL BE SKIPPED)
		 * 
 * 
 */
		
		
	boolean rain=true;
	int temp=40;
	
	while(rain) {
		System.out.println("I will stay at home");
		if(temp>75) {
			System.out.println("I will walk under rain");
		
		break;}
		
	temp+=2;
	}
	
	System.out.println("-----------------------------------------");
	
	for(int i=1; i<=10; i++) {
		System.out.println("Hello");
		if(i==5) {
			break;
		}
		System.out.println("I am inside the loop");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
