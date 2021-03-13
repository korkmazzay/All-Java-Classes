package com.class06;

public class SwitchExam {

	public static void main(String[] args) {

		/*
		 * store gender using M or F
		 * based on the gender we will specify
		 * 	if M--->Male
		 * if F--->Female
		 * otherwise---> not sure
		 */
		
		char gender='M';
		String description;
		switch (gender) {
		case 'M':
			description="Male";
			break;
		case 'F':
			description="Female";
			break;
		default:
			description="N/A";
			
		}
		System.out.println(description);

		///// LIMITATIONS/////
		///YOU CANNOT USE RELATIONAL OR LOGICAL OPERATORS, SWITCH ONLY CHECK VALUE
		/// switch cannot be used with boolean,double
		
		
		
		boolean sunny=true;
		if(sunny) {
			System.out.println("I am Happy");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
