package com.class12;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);

		int [] nums=new int[5];
	

		for(int i=0; i<nums.length; i++){
		  nums[i]=scan.nextInt();
		}
		for(int i=nums.length-1; i>=0; i--){
		  System.out.println(nums[i]);
		}



	}

}
