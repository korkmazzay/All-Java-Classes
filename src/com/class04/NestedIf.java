package com.class04;

public class NestedIf {

	public static void main(String[] args) {

		
	boolean morning=true;
	
	boolean classToday=true;
	
	// is it morning? ---> Good Morning
		// if there id a class: yes --> hello classmates
		// otherwise---> hello my family
	if(morning) { 
		System.out.println("let me check if I have a class today");
	}
		
		if(classToday) {
			System.out.println("Good Morning my classmates");
		} else {
			System.out.println("Good Morning my family");

		}

	System.out.println("----- End of the code--------");

	System.out.println("----------------------2-----------------------");
	
	boolean anyAllergy=true;
	boolean pollenAllergy=false;
	if(anyAllergy)	{
		
		System.out.println("lets check your allergies");
		if(pollenAllergy) {
		}else {
			System.out.println("ok, i know you dont have pollen allergy");
		}

	}else {
		System.out.println("lucky you, you have no allergy");

	}
		
		
		
		
		
		
	}

}
