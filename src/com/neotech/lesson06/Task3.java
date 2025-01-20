package com.neotech.lesson06;

import java.util.Scanner;

public class Task3 
{
	public static void main(String[] args) 
	{
		
//		Write a program that asks user to enter two numbers and prints which one is larger.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1 = input.nextInt();
	
		System.out.println("Enter second number:");
		int num2 = input.nextInt();
		
		if (num1 > num2)
		{
			System.out.println("----------");
			System.out.println(num1 + " is larger.");
		}
		else
		{
			System.out.println("----------");
			System.out.println(num2 + " is larger");
		}
		
		input.close();
		
	}
}
