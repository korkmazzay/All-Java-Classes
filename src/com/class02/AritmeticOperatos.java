package com.class02;

public class AritmeticOperatos {

	public static void main(String[] args) {
	
	int num1=10;
	int num2=5;
	// +,*,/,-,%
	
	
	System.out.println(num1+num2);
	System.out.println(num1-num2);	
	System.out.println(num1*num2);	
	System.out.println(num1/num2);	

	int sum=num1+num2;
	int sub=num1-num2;
	int div=num1/num2;
	
	//sum of number 10 and 5 is =15
	
	System.out.println("sum of number "+num1+" and "+ num2+"is =" +sum);
	
	double number1=10.99;
	double number2=90.99;
	double sumOfDouble=number1+number2;
	double subOfDouble=number1-number2;
	double divOfDouble=number2/number1;
	
	System.out.println("Result of division of 2 double values "+divOfDouble);
	
	float n1=10.99f;
	float n2=90.99f;
	
	float f=n2/n1;
	
	
	System.out.println("Result of division of 2 float values "+f);
	
	// precedence () --> * &/-->+&-
	
	 
	
	//modulus operator--> shows reminder the division
	
	int mod=10%3;
	System.out.println("remainder is="+mod);//1
	
	
	
	
	
	
	}

}
