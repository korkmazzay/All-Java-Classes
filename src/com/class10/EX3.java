package com.class10;

public class EX3 {

	public static void main(String[] args) {

		String[] syntax=new String[4];
		syntax[0]="Java";
		syntax[1]="Saturday";
		syntax[2]="day";
		syntax[3]="Coding";
		System.out.println(syntax[1]+" is "+syntax[0]+" "+syntax[3]+" "+syntax[2]);	
		
		
		
		System.out.println("--------2ND QUE-------");
		
		
		String[] names=new String[5];
		names[0]="Andy";
		names[1]="James";
		names[2]="Korkmaz";
		names[3]="Jordan";
		names[4]="Rodrigues";

		System.out.println(names[2]);
		
		String[] name= {"Andy","James","Korkmaz","Jordan","Rodrigues"};
		System.out.println(names[2]);
		
		for(int i=0; i<=names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
		
	}

}
