package com.class11;

public class IMPORTANTEX {

	public static void main(String[] args) {

	String[][] usa={
	{"Alexandria","Oakton","Arlington","Virginia Beach","Fairfax"},
	{"Philly","Strassburg","Pittsburg"},
	{"Boston","Qincy","Springfield","Burlington"},
	{"LA","Long Beach","San Fransisco","Sacramento","Santa Barbara"},
	{"Miami","Orlando","Tampa","talhasse"}
	};
		
	System.out.println(usa.length);
	System.out.println(usa[0].length);	
	System.out.println(usa[1].length);
	System.out.println(usa[2].length);
	
	for(int r=0; r<usa.length; r++) {
			
			for(int c=0; c<usa[r].length; c++) {
				System.out.print(usa[r][c]+" ");
			}
			System.out.println();
			
	}
	System.out.println("------------------2ND WAY----------");
		for(String[] cities:usa) {
			for(String city:cities) {
				System.out.print(city+" ");
			}
			System.out.println();
		}
	
	
	
	}

}
