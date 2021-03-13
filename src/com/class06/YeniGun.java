package com.class06;

import java.util.Scanner;

public class YeniGun {

	public static void main(String[] args) {
		
		
	boolean sale=true;
	String item=null;
	Double price=0.0;
	Double discount=0.0;
	Double cost=0.0;
	
	
	System.out.println("\n\t\t\t Sale Calculation Program");
	
	Scanner entry=new Scanner(System.in);
	System.out.println("Is there a Sale? Answer true or false");
	sale=entry.nextBoolean();
	
	if(!sale)
	{System.out.println("I am not going shopping");}
		
		else
		{System.out.println("What is the item on sale?");
		item=entry.next();}
		{System.out.println("What is the price of "+item);
		price=entry.nextDouble();}
		
		if(price>10)
		{discount=.05;}
		if(price>=10 && price<=100)
		{discount=.10;}
		if(price>=100 && price<=500)
		{discount=.20;}
		else if(price>500)
		{discount=.30;}

		cost=price-(price*discount);
		
		System.out.println(" - Your item purchased was "+item);
		System.out.println(" - Your original price was "+price);
		System.out.println(" - Your discount is "+discount);
		System.out.println(" - Your final price is "+cost);
		

		
		
	}

}
