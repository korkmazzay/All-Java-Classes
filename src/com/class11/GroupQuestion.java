package com.class11;

public class GroupQuestion {

	public static void main(String[] args) {

		int[][] value=new int[3][4];
		
		value[0][0]=5;
		value[0][1]=7;
		value[0][2]=9;
		value[0][3]=11;	


		value[1][0]=5;
		value[1][1]=10;
		value[1][2]=15;
		value[1][3]=20;

		
		value[2][0]=4;
		value[2][1]=6;
		value[2][2]=8;
		value[2][3]=10;

		System.out.println(value[0][0]+value[0][1]+value[0][2]+value[0][3]
                          +value[1][0]+value[1][1]+value[1][2]+value[1][3]
						  +value[2][0]+value[2][1]+value[2][2]+value[2][3]);
	
    }

    }
