package com.class04;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		int i=10;
		String str="Hello";
		
		Scanner scan=new Scanner(System.in);
		
		String text=scan.nextLine();
		
		System.out.println("Text that i entered"+text);
		System.out.println("please enter your name");

		
		String name=scan.next();/// captures 1 word till space
		System.out.println("nice to meet you"+name);
		System.out.println("please enter your age");
		int age=scan.nextInt();
		System.out.println("My name is "+name+" and I am "+age+" years old");

		
	}

}
