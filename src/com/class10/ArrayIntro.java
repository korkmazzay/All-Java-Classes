package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {

	int num=10;
		num=20;
		System.out.println(num);
		/////--------INT------//////////

		int[] array=new int[5];
		array[0]=10;
		array[1]=12;
		array[2]=15;
		array[3]=9;
		array[4]=13;
		
		System.out.println(array[2]+array[4]);
		/////--------DOUBLE------//////////

		double[] numbers=new double[2];
		numbers[0]=10.00;
		numbers[1]=19.01;
		
		numbers[0]=11.99;
		
		System.out.println(numbers[0]);
		
		// ARRAYS ARE FIXED IN SIZE
		/////--------STRING------//////////

		String[] names=new String[4];
		names[0]="Adil";
		names[1]="Yigit";
		names[2]="Korkmaz";
		names[3]="Osman";
		System.out.println(names[2]);
		
		/////--------boolean------//////////
		boolean b[]=new boolean[3];
		b[0]=true;
		b[1]=true;
		b[2]=false;
		System.out.println(b[2]);
		
		int size=b.length;
		System.out.println("Size of the array is "+size);
		
		

	
	}

}
