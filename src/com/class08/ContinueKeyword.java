package com.class08;

public class ContinueKeyword {

	public static void main(String[] args) {

		/*
		 * CONTINUE SKIPS CURRENT ITERATION/EXECUTION AND CODE GOES BACK
		 * TO THE BEGINNING OF THE LOOP(IF THERE IS ANY CODE---> IT WILL BE SKIPPED)
		 * 
		 * BREAK BREAKS THE LOOP, AS SOON AS JAVA SEES THAT KEYWORD IT GETS OUT 
		 * OF THE LOOP BODY (IF THERE IS ANY CODE---> IT WILL BE SKIPPED)
		 * 
		 */
		
		
	for (int i=10; i<=10; i++) {
		System.out.println("Hello");
		if(i==3) {
			continue;
		}
	System.out.println("I am inside the loop");
	}
		/*
		 * you need to print all numbers from 1 to 10 except 5 & 6
		 * 
		 * 
		 */
		for (int i=1; i<=10; i++) {
			if(i==5 || i==6) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		/*
		 * you need to print numbers from 1 to 40,except those that are divisible by 4
		 */
		
		for (int i=1; i<=40; i++) {
			if(i%4==0) {
				continue;
			}
			System.out.print(i+" ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
