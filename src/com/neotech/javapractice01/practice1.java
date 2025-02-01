package com.neotech.javapractice01;

import java.util.Scanner;

public class practice1 
{
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int i1 = scan.nextInt();

		System.out.println("Enter operator:");
		char c = scan.next().charAt(0);
		
		System.out.println("Enter second number:");
		int i2 = scan.nextInt();
		
		if (c == '+')
		{
			int result = i1 + i2;
			System.out.println("= " + result);
		}
		else if (c == '-')
		{
			int result = i1 - i2;
			System.out.println("= " + result);
		}
		else if (c == '*')
		{
			int result = i1 * i2;
			System.out.println("= " + result);
		}
		else if (c == '/')
		{
			int result = i1 / i2;
			System.out.println("= " + result);
		}
		else
		{
			System.out.println("Invalid operation!");
		}
		
		scan.close();
		
	}

}
