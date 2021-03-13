package com.class10;

public class ArrayEXample {

	public static void main(String[] args) {

	char[] grades=new char[6];
	grades[0]='A';
	grades[1]='B';
	grades[2]='C';
	grades[3]='D';
	grades[4]='E';
	grades[5]='F';
		
	System.out.println(grades[1]);
	
	System.out.println("-----ANOTHER WAY TO CREAT AN ARRAY----");
		
	char[] grade= {'A','B','C','D','E','F','G','H'};
	System.out.println(grade[7]);
	System.out.println("Number of elements in 2 array "+grade.length);	
		
		
	for(char grd:grade) {
		System.out.print(grd+" ");
	}
		
		System.out.println();
		System.out.println();

		
		
		
	    int [] years={2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020};

	    for(int i=0; i<years.length; i++) {
	   
		System.out.println(years[i]);}
	    





		   



		  	
	}

}
