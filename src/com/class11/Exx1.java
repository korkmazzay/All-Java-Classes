package com.class11;

public class Exx1 {

	public static void main(String[] args) {

		
		

		String[][] names= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","jordan","Jackson","Obama"},
				};
		System.out.println(names[0][1]+" "+names[1][1]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);

		
		String[][] name= { {"Andy","Garcia","Michael","Obama"},{"A+","B+","C+","D+"}};
		
		System.out.println(name[0][0]+" "+name[1][0]+" "+name[1][1]);
		System.out.println(name[0][1]+" "+name[1][0]+" "+name[1][1]);
		System.out.println(name[0][2]+" "+name[1][0]+" "+name[1][1]);
		System.out.println(name[0][3]+" "+name[1][0]+" "+name[1][1]);

	}

}
