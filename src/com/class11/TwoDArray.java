package com.class11;

public class TwoDArray {

	public static void main(String[] args) {

	int[][] num=new int[3][4];
	// FIRST ARRAY OR FIRST ROW
	
	num[0][0]=1;
	num[0][1]=2;
	num[0][2]=3;
	num[0][3]=4;	

	// 2ND ARRAY OR 2ND ROW

	num[1][0]=10;
	num[1][1]=20;
	num[1][2]=30;
	num[1][3]=40;

	// 3RD ARRAY OR 3RD ROW
	
	num[2][0]=100;
	num[2][1]=200;
	num[2][2]=300;
	num[2][3]=400;

	System.out.println(num[1][3]);
	System.out.println(num[2][2]);	
		
		System.out.println("---------ANOTHER WAY-------");
		
		int[][] numbers= {
				{1,2,3,4},
				{10,20,30,40},
				{100,200,300,400},
		};
		System.out.println(numbers[0][2]);
		System.out.println(numbers[1][1]);
		
		// whats the output
		int sum=numbers[1][2]+numbers[0][3];
		System.out.println(sum);
	}

}
