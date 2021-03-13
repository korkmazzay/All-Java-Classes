package com.class08;

public class ExamplesHW {

	public static void main(String[] args) {

		/* calculate sum of odd and even numbers from 1 to 50 */
		
		int sumEven = 0 ,sumOdd=0;
		for(int i=0;i<=50;i+=2) {
			sumEven +=i;
		}
			System.out.println("Sum of Even number less then 50 is "+sumEven);
			for(int i=1;i<=50;i+=2) {
				sumOdd+=i;
			}
			System.out.println("Sum of Even number less then 50 is "+sumOdd);
		
		
System.out.println("-------------------2ND WAY----------------------");
			
			int odd =0;
			int even =0;
			for(int i=1; i<=50; i++) {
				if(i%2==0) {
					even+=i;}
				
				else {
					odd+=i;
					}
			}	
			System.out.println("Sum of Even number less then 50 is "+even);
			System.out.println("Sum of Even number less then 50 is "+odd);

			
			
	}

}
